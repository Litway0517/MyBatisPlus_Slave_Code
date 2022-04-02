package com.atguigu.mybatisplus.service.impl;

import com.atguigu.mybatisplus.entity.Product;
import com.atguigu.mybatisplus.mapper.ProductMapper;
import com.atguigu.mybatisplus.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DELL_
 * @since 2022-04-02
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
