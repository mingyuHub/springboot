package com.my.example.springbootconfig.controller;

import com.my.example.springbootconfig.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther: chenmingyu
 * @date: 2018/11/3 22:32
 * @description:
 */
@RestController
public class UserController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private Integer age;

    @Resource
    private User user;

    @GetMapping("/getUserInfo")
    private String getUserInfo(){

        return String.format("@Value注入: %s_%s",user,age);
    }

    @GetMapping("/getUserInfoByBean")
    private String getUserInfoByBean(){
        return String.format("@ConfigurationProperties注入: %s_%s",user.getName(),user.getAge());
    }

}
