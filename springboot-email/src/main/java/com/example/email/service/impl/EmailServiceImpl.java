package com.example.email.service.impl;

import com.example.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafTemplateAvailabilityProvider;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenmingyu
 * @date: 2019/2/24 13:01
 * @description: 邮件服务
 */
@Service
public class EmailServiceImpl implements EmailService {

    @Resource
    private JavaMailSender mailSender;

    @Resource
    private TemplateEngine templateEngine;

    /**
     * 发送邮件邮箱
     */
    @Value("${spring.mail.username}")
    private String formMail;

    @Override
    public boolean sendSimpleEmail(String toMail,String subject,String text) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom(formMail);
            simpleMailMessage.setTo(toMail);
            simpleMailMessage.setSubject(subject);
            simpleMailMessage.setText(text);
            mailSender.send(simpleMailMessage);
            System.out.println("发送文本邮件：toMail："+toMail);
            return true;
        }catch (Exception e){
            System.out.println("发送文本邮件异常：toMail："+toMail);
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean sendHtmlEmail(String toMail, String subject, String html) {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
            mimeMessageHelper.setTo(toMail);
            mimeMessageHelper.setFrom(formMail);
            mimeMessageHelper.setText(html,true);
            mimeMessageHelper.setSubject(subject);
            mailSender.send(mimeMessage);
            System.out.println("发送html邮件：toMail："+toMail);
            return true;
        } catch (Exception e) {
            System.out.println("发送html邮件异常：toMail："+toMail);
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean sendTemplateEmail(String toMail, String subject, Map<String,Object> templateValue) {
        System.out.println("发送html邮件：toMail："+toMail);
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setTo(toMail);
            mimeMessageHelper.setFrom(formMail);
            mimeMessageHelper.setSubject(subject);
            Context context = new Context();
            context.setVariables(templateValue);
            String text = templateEngine.process("template",context);
            mimeMessageHelper.setText(text, true);
            mailSender.send(mimeMessage);
            return true;
        } catch (Exception e) {
            System.out.println("发送html邮件异常：toMail："+toMail);
            e.printStackTrace();
        }
        return false;
    }
}
