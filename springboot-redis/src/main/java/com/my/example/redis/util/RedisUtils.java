package com.my.example.redis.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @auther: chenmingyu
 * @date: 2018/11/11 12:04
 * @description: redis工具类
 */
@Component("redisUtils")
public class RedisUtils {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 获取key
     * @param key
     * @return
     */
    public String get(String key){
        try {
            if(StringUtils.isBlank(key)){
                return null;
            }
            return stringRedisTemplate.opsForValue().get(key);
        }catch (Exception e){
            System.out.println(String.format("获取字符串异常！ key ：%s",key));
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 设置key
     * @param key
     * @param value
     */
    public Boolean set(String key,String value){
        try {
            if(StringUtils.isBlank(key)||StringUtils.isBlank(value)){
                return false;
            }
            stringRedisTemplate.opsForValue().set(key,value);
            return true;
        }catch (Exception e){
            System.out.println(String.format("设置字符串异常！ key ：%s ,value：%s",key,value));
            e.printStackTrace();
        }
        return false;
    }
    /**
     * 删除key
     * @param key
     */
    public Boolean delete(String key){
        try {
            if(StringUtils.isBlank(key)){
                return false;
            }
            return stringRedisTemplate.delete(key);
        }catch (Exception e){
            System.out.println(String.format("删除key异常！ key ：%s ",key));
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 设置缓存，时间单位为秒
     * @param key
     * @param value
     * @param time
     * @return
     */
    public Boolean setEX(String key,String value,Long time){
        try {
            if(StringUtils.isBlank(key)||StringUtils.isBlank(value)){
                return false;
            }
            stringRedisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            return true;
        }catch (Exception e){
            System.out.println(String.format("设置缓存异常！ key ：%s ,value：%s,times：%s",key));
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 获取key缓存时间，时间单位为秒
     * @param key
     * @return
     */
    public Long getExpireTime(String key){
        try {
            if(StringUtils.isBlank(key)){
                return null;
            }
            return stringRedisTemplate.getExpire(key,TimeUnit.SECONDS);
        }catch (Exception e){
            System.out.println(String.format("获取key缓存时间异常！ key ：%s",key));
            e.printStackTrace();
        }
        return null;
    }

}
