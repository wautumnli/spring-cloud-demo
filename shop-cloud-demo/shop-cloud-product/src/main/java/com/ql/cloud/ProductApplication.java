package com.ql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:17
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan("com.ql.cloud.domain")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
