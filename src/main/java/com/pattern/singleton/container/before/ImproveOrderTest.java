package com.pattern.singleton.container.before;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ImproveOrderTest {
    public static void main(String[] args) {
        Order order1 = new Order("201803180001", new BigDecimal(15), "10001", 0);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        for (Order order : orderList) {
            Integer payMode = order.getPayMode();

        }
    }
}
