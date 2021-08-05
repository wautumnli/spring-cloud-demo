package com.ql.cloud.service.impl;

import com.ql.cloud.dao.OrderDao;
import com.ql.cloud.domain.Order;
import com.ql.cloud.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:28
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public void createOrder(Order order) {
        orderDao.save(order);
    }
}
