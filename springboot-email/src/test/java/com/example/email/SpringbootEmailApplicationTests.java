package com.example.email;

import com.example.email.service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEmailApplicationTests {

    @Resource
    private EmailService emailService;

    @Test
    public void sendSimpleMail() {
        emailService.sendSimpleEmail("1520151594@qq.com","注册提醒","欢迎注册，这是一封测试邮件");
    }

    @Test
    public void sendHtmlMail() {
        emailService.sendHtmlEmail("1520151594@qq.com","注册提醒","<h1>欢迎注册，这是一封测试邮件</h1>");
    }

    @Test
    public void sendTemplateMail() {
        Map<String,Object> map = new HashMap<>();
        map.put("name","叫我明羽");
        emailService.sendTemplateEmail("1520151594@qq.com","注册提醒",map);
    }

}
