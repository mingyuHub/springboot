package com.my.async;

import com.my.async.async.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootAsyncApplicationTests {

    @Autowired
    private UserTest userTest;

    @Test
    public void contextLoads() throws Exception{
        userTest.testOne();
        userTest.testTwo();
        Thread.sleep(5000L);
    }
}
