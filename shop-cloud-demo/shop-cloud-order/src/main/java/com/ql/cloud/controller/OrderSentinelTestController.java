package com.ql.cloud.controller;


import com.ql.cloud.service.impl.OrderServiceImpl2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:28
 **/
@Slf4j
@RestController
public class OrderSentinelTestController {

    @Resource
    private OrderServiceImpl2 orderServiceImpl2;

    @RequestMapping("/order/message1")
    public String message1() {
        orderServiceImpl2.message();
        return "message1";
    }

    @RequestMapping("/order/message2")
    public String message2() {
        orderServiceImpl2.message();
        return "message2";
    }
}
