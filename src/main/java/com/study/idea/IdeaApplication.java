package com.study.idea;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com") // 组件扫描路径
@MapperScan("com.study.idea.mapper") // Mybatis 扫描的包
public class IdeaApplication {
    public static void main(String[] args) {
        SpringApplication.run(IdeaApplication.class, args);
    }
}