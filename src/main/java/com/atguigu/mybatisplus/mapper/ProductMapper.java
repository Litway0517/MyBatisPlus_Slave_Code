package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author DELL_
 * @since 2022-04-02
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
