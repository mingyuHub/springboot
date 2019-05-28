package com.my.example.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: chenmingyu
 * @date: 2019/5/23 17:29
 * @description: 队列配置类
 */
@Configuration
public class RabbitQueueConfig {

    /**
     * 测试队列名称
     */
    public static final String TEST_QUEUE = "test";

    @Bean
    public Queue Queue() {
        return new Queue(TEST_QUEUE);
    }
}
