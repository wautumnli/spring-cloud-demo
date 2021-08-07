package com.ql.cloud.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author: wautumnli
 * @date: 2021-08-07 11:55
 **/
@Service
public class OrderServiceImpl2 {

    // 定义资源
    @SentinelResource("message")
    public String message() {
        return "message";
    }
}
