package com.my.swagger.controller;

import io.swagger.annotations.*;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @auther: chenmingyu
 * @date: 2018/12/2 21:43
 * @description:
 */
@RestController
@RequestMapping("/test")
@Api(tags ="用户信息接口")
public class UserController {

    @GetMapping("/user")
    @ApiOperation(value="查询所有", notes="查询所有用户信息")
    public List<User> queryUsers(){
        List<User> userList = new ArrayList<>();
        IntStream.range(0, 5).forEach(i->{
            User user = new User();
            user.setId(i);
            user.setUserName("cmy");
            user.setPassWord("passWord");
            userList.add(user);
        });
        return userList;
    }
}
@Data
@ApiModel(value="用户对象")
class User {

    private Integer id;
    @ApiModelProperty(value="用户名称",name="userName")
    private String userName;

    @ApiModelProperty(value="密码",name="passWord")
    private String passWord;
}