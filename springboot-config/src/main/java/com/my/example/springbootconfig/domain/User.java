package com.my.example.springbootconfig.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @auther: chenmingyu
 * @date: 2018/11/3 22:30
 * @description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "my")
public class User {

    private String name;

    private Integer age;

}
