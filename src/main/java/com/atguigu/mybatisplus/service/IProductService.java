package com.atguigu.mybatisplus.service;

import com.atguigu.mybatisplus.entity.Product;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author DELL_
 * @since 2022-04-02
 */
@DS("slave_1")
public interface IProductService extends IService<Product> {

}
