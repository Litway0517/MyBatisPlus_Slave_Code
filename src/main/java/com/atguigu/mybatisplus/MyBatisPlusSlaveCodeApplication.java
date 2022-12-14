package com.atguigu.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.mybatisplus.mapper")
@MapperScan("com.atguigu.mybatiscodehelperpro.mapper")
@SpringBootApplication
public class MyBatisPlusSlaveCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusSlaveCodeApplication.class, args);
    }

}
