package com.ql.cloud.service;

import com.ql.cloud.domain.Order;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:28
 **/
public interface OrderService {
    void createOrder(Order order);
}
