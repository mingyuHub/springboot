package com.my.example.dao;

import com.my.example.domain.User;
import org.apache.ibatis.annotations.*;

/**
 * @auther: chenmingyu
 * @date: 2018/11/4 13:42
 * @description:
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findUserByName(@Param("id") Long id) throws Exception;

    @Insert("insert into user values (#{id},#{userName},#{passWord})")
    int insert(User user);

    @Update("update user set user_name=#{userName},pass_word=#{passWord} where id = #{id}")
    int updateById(User user);

    @Delete("delete from user where id=#{id}")
    int deleteById(@Param("id") String id);
}
