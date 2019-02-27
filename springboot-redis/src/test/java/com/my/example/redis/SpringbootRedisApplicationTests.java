package com.my.example.redis;

import com.my.example.redis.util.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Resource
    private RedisUtils redisUtils;


    @Test
    public void testSet() {
        Boolean flag = redisUtils.set("mingyu","mingyu");
        System.out.println("testSet："+flag);
    }

    @Test
    public void testGet() {
        String value = redisUtils.get("mingyu");
        System.out.println("testGet："+value);
    }

    @Test
    public void testDelete() {
        Boolean flag = redisUtils.delete("mingyu");
        System.out.println("testDelete："+flag);
    }

    @Test
    public void testSetEX() {
        Boolean flag = redisUtils.setEX("mingyu","cmy",1000L);
        System.out.println("testSetEX："+flag);
    }

    @Test
    public void testGetExpireTime() {
        Long time = redisUtils.getExpireTime("mingyu");
        System.out.println("testSetEX："+time);
    }
}
