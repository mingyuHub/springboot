package com.my.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @auther: chenmingyu
 * @date: 2018/12/2 21:39
 * @description:
 */
@Configuration
@EnableSwagger2
public class Swagger2Configration {

    /**
     * 创建api文档
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.my.swagger"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * api文档页面展示信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger组件")
                .description("测试api文档")
                .contact(new Contact("mingyu", "www.chenmingyu.top", null))
                .version("1.0")
                .build();
    }
}
