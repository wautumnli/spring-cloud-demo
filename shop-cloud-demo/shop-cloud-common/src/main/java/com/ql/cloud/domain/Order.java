package com.ql.cloud.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:13
 **/
@Data
@Entity(name = "shop_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;
    private Integer uid;
    private String username;
    private Integer pid;
    private String productName;
    private String productPrice;
    private Integer number;
}
