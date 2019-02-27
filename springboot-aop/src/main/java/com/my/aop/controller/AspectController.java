package com.my.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: chenmingyu
 * @date: 2018/12/5 17:34
 * @description:
 */
@RestController
public class AspectController {

    /**
     * 走切面
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return "method return";
    }

    /**
     * 不走切面
     */
    @GetMapping("/test1")
    private void test1(){
    }

    /**
     * 走切面，抛异常
     */
    @GetMapping("/throws")
    public void throwsException(){
        throw new RuntimeException();
    }
}
