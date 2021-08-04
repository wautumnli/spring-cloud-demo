package com.ql.cloud.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 用户实体类
 * @author: wautumnli
 * @date: 2021-08-04 23:10
 **/
@Data
@Entity(name = "shop_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    private String username;
    private String password;
    private String telephone;
}
