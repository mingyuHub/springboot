package com.my.async.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: chenmingyu
 * @date: 2019/3/1 17:49
 * @description: 异步调用
 */
@Component
public class UserTest {

    @Async
    public void testOne() throws Exception{
        System.out.println("testOne 开始执行");
        Thread.sleep(2000L);
        System.out.println("testOne 执行结束");
    }

    @Async
    public void testTwo() throws Exception{
        System.out.println("testTwo 开始执行");
        Thread.sleep(1000L);
        System.out.println("testTwo 执行结束");
    }
}
