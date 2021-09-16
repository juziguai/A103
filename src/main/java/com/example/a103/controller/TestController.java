package com.example.a103.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunql
 * @description controller层
 * @date 2021/09/16 22:09
 */

@Controller
@RequestMapping(value = "/leyou")
public class TestController {
    @RequestMapping(value = "/login")
    public String test() {
        System.out.println("启动login方法");
        return "login/login";
    }
}
