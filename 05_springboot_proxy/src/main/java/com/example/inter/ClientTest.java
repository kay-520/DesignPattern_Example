package com.example.inter;

import com.example.inter.proxy.OrderServiceProxy;
import com.example.inter.service.OrderService;
import com.example.inter.service.impl.OrderServiceImpl;

/**
 * @author: Wangmh
 * @date: 2019/5/31
 * @time: 17:16
 */
public class ClientTest {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
        orderService.order();
    }
}
