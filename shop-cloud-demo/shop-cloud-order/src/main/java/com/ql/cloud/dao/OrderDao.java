package com.ql.cloud.dao;

import com.ql.cloud.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:29
 **/
public interface OrderDao extends JpaRepository<Order, Integer> {
}
