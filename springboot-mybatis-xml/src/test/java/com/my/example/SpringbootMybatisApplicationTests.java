package com.my.example;

import com.my.example.dao.UserMapper;
import com.my.example.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testFindByName() throws Exception {
        User user = userMapper.findUserByName(5L);
        System.out.println("第一条记录："+user.toString());
    }
}
