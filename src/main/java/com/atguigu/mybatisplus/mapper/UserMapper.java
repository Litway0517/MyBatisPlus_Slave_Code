package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户映射器
 *
 * @author DELL_
 * @date 2022/04/07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


}
