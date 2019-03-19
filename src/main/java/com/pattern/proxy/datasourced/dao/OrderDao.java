package com.pattern.proxy.datasourced.dao;

import com.pattern.proxy.datasourced.Order;

public class OrderDao {

    public int insert(Order order){
        System.out.println("OrderDao创建Order成功");
        return 1;
    }
}
