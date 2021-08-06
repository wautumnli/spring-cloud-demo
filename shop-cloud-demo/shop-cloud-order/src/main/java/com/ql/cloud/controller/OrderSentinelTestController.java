package com.ql.cloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:28
 **/
@Slf4j
@RestController
public class OrderSentinelTestController {
    @RequestMapping("/order/message1")
    public String message1() {
        return "message1";
    }

    @RequestMapping("/order/message2")
    public String message2() {
        return "message2";
    }
}
