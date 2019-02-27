package com.my.log.exception;

import com.my.log.util.LogTypeEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenmingyu
 * @date: 2019/2/26 16:56
 * @description:
 */
@RestController
@RequestMapping("exception")
public class ExceptionLogController {

    @GetMapping("/test")
    public void test(){
        LogTypeEnum.MQ.info("{} mq : {}",ExceptionLogController.class,"info");
        LogTypeEnum.EXCEPTION.info("{} exception : {}",ExceptionLogController.class,"info");
    }
}
