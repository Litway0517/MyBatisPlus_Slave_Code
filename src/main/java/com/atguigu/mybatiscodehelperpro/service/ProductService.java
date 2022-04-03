package com.atguigu.mybatiscodehelperpro.service;

import com.atguigu.mybatiscodehelperpro.pojo.Product;

public interface ProductService {


    int deleteByPrimaryKey(Long id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

}

