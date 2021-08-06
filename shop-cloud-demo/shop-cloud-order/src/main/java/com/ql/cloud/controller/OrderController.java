package com.ql.cloud.controller;

import com.alibaba.fastjson.JSON;
import com.ql.cloud.domain.Order;
import com.ql.cloud.domain.Product;
import com.ql.cloud.service.OrderService;
import com.ql.cloud.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:28
 **/
@Slf4j
@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private OrderService orderService;
    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private ProductService productService;

    @RequestMapping("/order/product/{pid}")
    public Order order(@PathVariable("pid") Integer pid) {
        log.info("商品id：{}", pid);
        // List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        // 自定义均衡负载
        // int index = new Random().nextInt(instances.size());
        // ServiceInstance instance = instances.get(index);
        // rest风格调用
        // Product product = restTemplate
        //         .getForObject("http://"+ instance.getHost() +":"+ instance.getPort() + "/product/" + pid, Product.class);
        // Product product = restTemplate.getForObject("http://localhost:8081/product/" + pid, Product.class);
        // 开启Ribbon均衡负载
        // Product product = restTemplate.getForObject("http://service-product/product/" + pid, Product.class);
        Product product = productService.findByPid(pid);
        log.info("商品内容: {}", JSON.toJSONString(product));
        Order order = Order.builder()
                .uid(1)
                .username("测试用户")
                .pid(pid)
                .productName(product.getProductName())
                .productPrice(product.getProductPrice())
                .number(1)
                .build();
        orderService.createOrder(order);
        log.info("创建订单成功: {}", JSON.toJSONString(order));
        return order;
    }
}
