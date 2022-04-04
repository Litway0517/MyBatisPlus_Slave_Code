package com.atguigu.mybatiscodehelperpro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.mybatiscodehelperpro.mapper")
@SpringBootApplication
public class MyBatisCodeHelperPro {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisCodeHelperPro.class, args);
    }

}
