package com.atguigu.mybatisplus;


import com.atguigu.mybatisplus.service.IProductService;
import com.atguigu.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusApplicationTest {

    @Autowired
    private UserService userService;

    @Autowired
    private IProductService productService;

    @Test
    public void testDataSource() {
        // 尝试 -> 从不同数据源取数据
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));
    }




}
