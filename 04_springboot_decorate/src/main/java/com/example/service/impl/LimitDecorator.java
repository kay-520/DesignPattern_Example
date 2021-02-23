package com.example.service.impl;

import com.example.GatewayComponent;
import com.example.AbstractDecorator;

/**
 * @author: create by wangmh
 * @name: LimitDecorator.java API限流
 * @description:
 * @date:2019/5/14
 **/
public class LimitDecorator extends AbstractDecorator {
    public LimitDecorator(GatewayComponent gatewayComponent){
        super(gatewayComponent);
    }
    @Override
    public void service() {
        super.service();
        System.out.println("第三步>>>>API接口限流");
    }
}
