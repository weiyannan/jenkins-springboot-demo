package com.weiyannan.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Title: HelloController
 * @Author weiyannan
 * @Date: 2022/10/6
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @GetMapping(value = "/test")
    public String sayHello(){
        return "This is jenkens demo test dev";
    }
}
