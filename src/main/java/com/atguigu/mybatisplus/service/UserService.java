package com.atguigu.mybatisplus.service;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;

/*
    DS注解用于标识此Service使用的数据源是哪一个
    DS注解能够用于类上也能够用于方法上, 就近原则
        - 读数据的方法上面就使用 从库
        - 写数据的方法上面就使用 主库
 */
@DS("master")
public interface UserService extends IService<User> {


}
