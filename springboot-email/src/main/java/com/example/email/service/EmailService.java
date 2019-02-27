package com.example.email.service;

import java.util.Map;

/**
 * @auther: chenmingyu
 * @date: 2019/2/24 13:00
 * @description: 邮件服务
 */
public interface EmailService {

    /**
     * 发送文本邮件
     * @param toMail 接收邮箱
     * @param subject 标题
     * @param text 文本
     * @return
     */
    boolean sendSimpleEmail(String toMail,String subject,String text);

    /**
     * 发送html邮件
     * @param toMail 接收邮箱
     * @param subject 标题
     * @param html html内容
     * @return
     */
    boolean sendHtmlEmail(String toMail,String subject,String html);

    /**
     * 发送模板邮件
     * @param toMail 接收邮箱
     * @param subject 标题
     * @param templateValue 模板内容填充值
     * @return
     */
    boolean sendTemplateEmail(String toMail,String subject,Map<String,Object> templateValue);
}
