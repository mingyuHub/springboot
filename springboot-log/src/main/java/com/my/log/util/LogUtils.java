package com.my.log.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenmingyu
 * @date: 2018/8/25 14:25
 * @description: 日志工具类
 */
public class LogUtils {

    private static Map<LogTypeEnum, Log> logMap = new HashMap<LogTypeEnum, Log>();

    static {
        for (LogTypeEnum ft : LogTypeEnum.values()) {
            logMap.put(ft, LogFactory.getLog(ft.getKey()));
        }
    }

    /**
     * 记录DEBUG信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void debug(LogTypeEnum type, String str) {
        getLog(type).debug(str);
    }

    /**
     * 记录INFO信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void info(LogTypeEnum type, String str) {
        getLog(type).info(str);
    }

    /**
     * 记录error信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void error(LogTypeEnum type, String str) {
        getLog(type).error(str);
    }


    public static Log getLog(LogTypeEnum type) {
        if (logMap.get(type) == null) {
            return LogFactory.getLog(LogUtils.class);
        } else {
            return logMap.get(type);
        }
    }


    /**
     * 日志消息占位符形式的替换，按照传入参数依次替换"{}"
     *
     * @param str  带占位符的日志消息
     * @param args 需要被替换的参数，除了字符串和基本类型的对象形式外，其它类型需要自己实现toString方法
     * @return
     */
    public static <T extends Object> String replace(String str, T... args) {
        if (str == null || args == null || args.length < 1) {
            return str;
        }
        StringBuilder builder = new StringBuilder(str);
        int start = builder.indexOf("{}");
        int end = start + 1;
        for (Object arg : args) {
            if (start == -1) {
                break;
            }
            if (arg == null) {
                arg = "null";
            }
            builder.replace(start, end + 1, arg.toString());
            start = builder.indexOf("{}", start);
            end = start + 1;
        }
        return builder.toString();
    }

    /**
     * 记录DEBUG信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void debug(LogTypeEnum type, String str, Object... args) {
        Log log = getLog(type);
        if (log.isDebugEnabled()) {
            String msg = replace(str, args);
            log.debug(msg);
        }
    }

    /**
     * 记录INFO信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void info(LogTypeEnum type, String str, Object... args) {
        Log log = getLog(type);
        if (log.isInfoEnabled()) {
            String msg = replace(str, args);
            log.info(msg);
        }
    }

    /**
     * 记录error信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void error(LogTypeEnum type, String str, Object... args) {
        Log log = getLog(type);
        if (log.isErrorEnabled()) {
            String msg = replace(str, args);
            log.error(msg);
        }
    }

    /**
     * 记录DEBUG信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void debug(LogTypeEnum type, Throwable e, String str,
                             Object... args) {
        Log log = getLog(type);
        if (log.isDebugEnabled()) {
            String msg = replace(str, args);
            log.debug(msg, e);
        }
    }

    /**
     * 记录INFO信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void info(LogTypeEnum type, Throwable e, String str,
                            Object... args) {
        Log log = getLog(type);
        if (log.isInfoEnabled()) {
            String msg = replace(str, args);
            log.info(msg, e);
        }
    }

    /**
     * 记录error信息
     *
     * @param type 日志业务类型
     * @param str
     */
    public static void error(LogTypeEnum type, Throwable e, String str,
                             Object... args) {
        Log log = getLog(type);
        if (log.isErrorEnabled()) {
            String msg = replace(str, args);
            log.error(msg, e);
        }
    }
}
