package com.atguigu.mybatiscodehelperpro.mapper;

import com.atguigu.mybatiscodehelperpro.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 产品映射器测试
 *
 * @author DELL_
 * @date 2022/04/05
 */
@SpringBootTest
class ProductMapperTest {

    @Autowired
    private ProductMapper productMapper;

    // 测试更新
    @Test
    public void updateProductByIdAndName() {
        Product product = new Product();
        product.setPrice(12999);
        product.setName("ROG笔记本");
        productMapper.updateByIdAndPriceAndName(product, 1L, 12999, "外星人笔记本");
    }

    @Test
    public void testProductMapper() {
        Product product = new Product();
        product.setName("G15 I-12700H");
        product.setPrice(8299);
        int insert = productMapper.insert(product);
        System.out.println("影响行数 -> " + insert);
        System.out.println("返回的主键userGeneratorKeys -> " + product);
    }



}
