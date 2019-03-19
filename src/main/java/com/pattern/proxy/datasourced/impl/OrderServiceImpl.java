package com.pattern.proxy.datasourced.impl;

import com.pattern.proxy.datasourced.IOrderService;
import com.pattern.proxy.datasourced.Order;
import com.pattern.proxy.datasourced.dao.OrderDao;

public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl() {
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderServiceImpl调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
