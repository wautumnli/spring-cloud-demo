package com.ql.cloud.controller;

import com.ql.cloud.service.ProductService;
import com.alibaba.fastjson.JSON;
import com.ql.cloud.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author: wautumnli
 * @date: 2021-08-04 23:28
 **/
@Slf4j
@RestController
public class ProductController {

    @Resource
    private ProductService productService;

    @RequestMapping("/product/{pid}")
    public Product product(@PathVariable("pid") Integer pid) {
        log.info("查询商品：{}", pid);
        Product product = productService.findByPid(pid);
        log.info("商品内容：{}", JSON.toJSONString(product));
        return product;
    }
}
