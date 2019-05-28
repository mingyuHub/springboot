#### springboot2.0系列教程
> spring Boot 是一个基于spring的轻量级框架，可用于快速构建容易配置的、生产级的、的Spring 应用程序

##### 简介

spring Boot简化了spring的应用开发，采用约定大于配置的方式，提供了很多合理的默认值，即使少量的配置也是采用注解方式配置，省去了复杂的xml配置

spring Boot使用starter来简化依赖项的配置， starter 都使用以下命名约定：`spring-boot-starter-xxx`，xxx就代表想要引入的服务，如web，redis，mongodb等。系统中如果要提供web支持，只需要引入`spring-boot-starter-web`即可，`spring-boot-starter-web`自动提供了web需要的各种jar包及相应的版本。

###### spring Boot的优点：

- 约定大于配置，省去了繁琐的xml配置
- 内置容器，默认使用tomcat
- 自动装配bean，提供starter来提供对第三方服务的支持



###### 本系列教程环境版本：

- ide：idea
- springboot：  2.x以上
- jdk ： 1.8
- maven： 3.53

spring Boot 2.x版本需要jdk1.8或者更高版本支持，maven需要3以上；

##### 教程：

1. [**spring Boot 2.x | 第一个web应用 hello world**](https://chenmingyu.top/springboot-web/)
2. [**spring Boot 2.x | 配置文件，自定义配置，多环境配置**](https://chenmingyu.top/springboot-properties/)
3. [**spring Boot 2.x | 自定义异常 统一返回值 全局异常处理**](https://chenmingyu.top/springboot-exception/)
4. [**spring Boot 2.x | 日志管理**](https://chenmingyu.top/springboot-log/)
5. [**spring Boot 2.x | swagger2构建api文档**](https://chenmingyu.top/springboot-swagger/)
6. [**spring Boot 2.x | 模板引擎 thymeleaf**](https://chenmingyu.top/springboot-thymeleaf/)
7. [**spring Boot 2.x | 发送文本邮件，HTML邮件，模板邮件**](https://chenmingyu.top/springboot-mail/)
8. [**spring Boot 2.x | 实现 aop**](https://chenmingyu.top/springboot-aop/)
9. [**spring Boot 2.x | mybatis-注解方式**](https://chenmingyu.top/springboot-mybatis-annotation/)
10. [**spring Boot 2.x | mybatis-xml方式**](https://chenmingyu.top/springboot-mybatis-xml/)
11. [**spring Boot 2.x | 集成 redis**](https://chenmingyu.top/springboot-redis/)


