package com.atguigu.mybatisplus.service;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;

// DS注解用于标识此Service使用的数据源是哪一个
@DS("master")
public interface UserService extends IService<User> {


}
