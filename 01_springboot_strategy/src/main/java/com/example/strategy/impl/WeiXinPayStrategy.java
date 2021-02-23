package com.example.strategy.impl;

import com.example.strategy.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * Created by IDEA
 * User:wang7
 * Date:2019/5/8
 * Time:22:43
 */
@Component
public class WeiXinPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用微信支付s接口.....";
    }
}
