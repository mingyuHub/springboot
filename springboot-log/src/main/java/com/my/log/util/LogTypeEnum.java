package com.my.log.util;

/**
 * @author: chenmingyu
 * @date: 2018/8/25 14:25
 * @description: 日志类型枚举
 */
public enum LogTypeEnum {

    EXCEPTION("exception", "运行错误"),
    MQ("mq", "mq日志信息");

    private String key;
    private String value;

    LogTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 记录DEBUG信息
     *
     * @param str  日志信息，可使用占位符"{}"，占位符将会被args中的参数依次替换
     * @param args 替换占位符的参数，如果没有该参数则不会替换
     * @param e
     */
    public void debug(Throwable e, String str, Object... args) {
        LogUtils.debug(this, e, str, args);
    }

    /**
     * 记录INFO信息
     *
     * @param str  日志信息，可使用占位符"{}"，占位符将会被args中的参数依次替换
     * @param args 替换占位符的参数，如果没有该参数则不会替换
     * @param e
     */
    public void info(Throwable e, String str, Object... args) {
        LogUtils.info(this, e, str, args);
    }

    /**
     * 记录error信息
     *
     * @param str  日志信息，可使用占位符"{}"，占位符将会被args中的参数依次替换
     * @param args 替换占位符的参数，如果没有该参数则不会替换
     * @param e
     */
    public void error(Throwable e, String str, Object... args) {
        LogUtils.error(this, e, str, args);
    }

    /**
     * 记录DEBUG信息
     *
     * @param str  日志信息，可使用占位符"{}"，占位符将会被args中的参数依次替换
     * @param args 替换占位符的参数，如果没有该参数则不会替换
     */
    public void debug(String str, Object... args) {
        LogUtils.debug(this, str, args);
    }

    /**
     * 记录INFO信息
     *
     * @param str  日志信息，可使用占位符"{}"，占位符将会被args中的参数依次替换
     * @param args 替换占位符的参数，如果没有该参数则不会替换
     */
    public void info(String str, Object... args) {
        LogUtils.info(this, str, args);
    }

    /**
     * 记录error信息
     *
     * @param str
     */
    public void error(String str, Object... args) {
        LogUtils.error(this, str, args);
    }

    /**
     * 记录DEBUG信息
     *
     * @param str 日志信息
     */
    public void debug(String str) {
        LogUtils.debug(this, str);
    }

    /**
     * 记录INFO信息
     *
     * @param str 日志信息
     */
    public void info(String str) {
        LogUtils.info(this, str);
    }

    /**
     * 记录error信息
     *
     * @param str
     */
    public void error(String str) {
        LogUtils.error(this, str);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}