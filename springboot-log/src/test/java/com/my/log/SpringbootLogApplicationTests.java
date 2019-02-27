package com.my.log;

import com.my.log.util.LogTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLogApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringbootLogApplicationTests.class);

    @Test
    public void test() {
        logger.error("日志级别：error");
        logger.warn("日志级别：warn");
        logger.info("日志级别：info");
        logger.debug("日志级别：debug");
        logger.trace("日志级别：trace");
    }

    @Test
    public void test1() {
        LogTypeEnum.EXCEPTION.error("日志级别：error");
        LogTypeEnum.EXCEPTION.info("日志级别：warn");
        LogTypeEnum.MQ.info("日志级别：info");
        LogTypeEnum.MQ.debug("日志级别：debug");
    }
}

