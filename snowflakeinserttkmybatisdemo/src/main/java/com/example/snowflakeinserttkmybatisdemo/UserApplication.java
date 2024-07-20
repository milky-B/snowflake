package com.example.snowflakeinserttkmybatisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        //配置异步日志上下文选择器,不配置的话，等于没开异步
        SpringApplication.run(UserApplication.class);
    }
}
