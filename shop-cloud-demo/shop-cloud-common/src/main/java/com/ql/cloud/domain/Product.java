package com.ql.cloud.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 商品表
 * @author: wautumnli
 * @date: 2021-08-04 23:12
 **/
@Data
@Entity(name = "shop_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    private String productName;
    private Double productPrice;
    private Integer stock;
}
