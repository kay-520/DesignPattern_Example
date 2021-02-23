package com.example.controller;

import com.example.strategy.context.PayContextStrategy;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IDEA
 * User:wang7
 * Date:2019/5/8
 * Time:23:09
 */
@RestController
public class IndexController {

    @Autowired
    private PayContextStrategy payContextStrategy;

    @RequestMapping("/a")
    public String toPayHtml(@RequestParam("payCode") String payCode){
        if (StringUtils.isEmpty(payCode)){
            return "找不到payCode";
        }
        return payContextStrategy.toPayHtml(payCode);
    }
}
