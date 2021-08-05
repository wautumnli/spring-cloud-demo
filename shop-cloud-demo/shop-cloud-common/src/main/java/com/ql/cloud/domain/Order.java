package com.ql.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:13
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "shop_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;
    private Integer uid;
    private String username;
    private Integer pid;
    private String productName;
    private Double productPrice;
    private Integer number;
}
