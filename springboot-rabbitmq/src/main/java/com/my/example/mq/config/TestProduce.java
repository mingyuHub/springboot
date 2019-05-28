package com.my.example.mq.config;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: chenmingyu
 * @date: 2019/5/23 17:32
 * @description: 生产者
 */
@Component
public class TestProduce {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     */
    public void send(){
        System.out.println("发送消息");
        rabbitTemplate.convertAndSend(RabbitQueueConfig.TEST_QUEUE,"this is test");
    }
}
