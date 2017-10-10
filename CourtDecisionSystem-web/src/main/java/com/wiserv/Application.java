package com.wiserv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

/**
 * spring-boot 启动类
 */
@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.wiserv.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("---------启动成功-----------");
    }
}