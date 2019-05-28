package com.my.example.mq.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: chenmingyu
 * @date: 2019/5/23 17:31
 * @description: 消费者
 */
@Component
@RabbitListener(queues = RabbitQueueConfig.TEST_QUEUE)
public class TestConsumer {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("消费消息  : " + msg);
    }
}
