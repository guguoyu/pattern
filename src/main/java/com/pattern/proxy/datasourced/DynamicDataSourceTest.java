package com.pattern.proxy.datasourced;

import com.pattern.proxy.datasourced.impl.OrderServiceImpl;
import org.omg.CORBA.ORB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicDataSourceTest {

    public static void main(String[] args) {


        IOrderService orderService = (IOrderService) new OrderServiceStaticProxy().getInstance(new OrderServiceImpl());
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        try {
            Date date = sdf.parse("2018.02.25");
            order.setCreateTime(date.getTime());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
