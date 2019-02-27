package com.my.example.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: chenmingyu
 * @date: 2018/11/3 23:33
 * @description:
 */
@RestController
public class propertiesController {

    @Value("${my.environment}")
    private String environment;

    @GetMapping("/getEnvironment")
    private String getEnvironment(){
        return String.format("environment: %s",environment);
    }
}
