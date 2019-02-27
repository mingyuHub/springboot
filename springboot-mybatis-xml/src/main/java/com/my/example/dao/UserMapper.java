package com.my.example.dao;

import com.my.example.domain.User;
import org.apache.ibatis.annotations.*;

/**
 * @auther: chenmingyu
 * @date: 2018/11/4 13:42
 * @description:
 */
public interface UserMapper {

    User findUserByName(@Param("id") Long id) throws Exception;
}
