package com.atguigu.mybatiscodehelperpro.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.mybatiscodehelperpro.mapper.ProductMapper;
import com.atguigu.mybatiscodehelperpro.pojo.Product;
import com.atguigu.mybatiscodehelperpro.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Product record) {
        return productMapper.insert(record);
    }

    @Override
    public int insertSelective(Product record) {
        return productMapper.insertSelective(record);
    }

    @Override
    public Product selectByPrimaryKey(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return productMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return productMapper.updateByPrimaryKey(record);
    }

}

