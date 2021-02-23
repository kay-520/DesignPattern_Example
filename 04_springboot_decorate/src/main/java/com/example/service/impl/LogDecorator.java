package com.example.service.impl;

import com.example.GatewayComponent;
import com.example.AbstractDecorator;

/**
 * @author: create by wangmh
 * @name: LogDecorator.java 日志收集
 * @description:
 * @date:2019/5/14
 **/
public class LogDecorator extends AbstractDecorator {
    public LogDecorator(GatewayComponent gatewayComponent){
        super(gatewayComponent);
    }
    @Override
    public void service() {
        super.service();
        System.out.println("第二步>>>>日志的采集.....");
    }
}
