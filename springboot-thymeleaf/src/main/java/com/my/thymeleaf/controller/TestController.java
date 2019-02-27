package com.my.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: chenmingyu
 * @date: 2019/2/27 11:04
 * @description:
 */
@Controller
public class TestController {

    @GetMapping("test")
    public String test(Model model){

        model.addAttribute("name","叫我明羽");
        model.addAttribute("url","https://chenmingyu.top");
        return "test";
    }
}
