package com.my.async.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: chenmingyu
 * @date: 2019/3/1 17:33
 * @description: 定时任务
 */
@Component
public class Schedule {

    @Scheduled(cron = "0/1 * * * * ?")
    public void test() {
        System.out.println("...测试...");
    }
}
