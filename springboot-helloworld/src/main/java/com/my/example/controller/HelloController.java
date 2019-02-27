package com.my.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenmingyu
 * @date: 2018/10/21 14:29
 * @description:
 */
@RestController
public class HelloController
{
    @GetMapping("/")
    public String sayHello(){
        return "say hello";
    }
}
