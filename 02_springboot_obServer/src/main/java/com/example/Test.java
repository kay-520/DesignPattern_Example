package com.example;

import com.example.service.AbstractSubject;
import com.example.service.impl.UserObServer;
import com.example.service.impl.WeChatSubject;

/**
 * @author: Wangmh
 * @date: 2019/5/31
 * @time: 16:48
 */
public class Test {
    public static void main(String[] args) {
        // 1.注册主题
        AbstractSubject weChatSubject = new WeChatSubject();
        // 2.添加观察者 订阅主题
        weChatSubject.addObServer(new UserObServer("小明"));
        weChatSubject.addObServer(new UserObServer("小红"));
        // 3.设置发送消息
        weChatSubject.setNtifyMessage("加油啊！");

    }
}
