package com.atguigu.mybatisX.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.mybatisX.pojo.Emp;
import com.atguigu.mybatisX.service.EmpService;
import com.atguigu.mybatisX.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL_
* @description 针对表【t_emp】的数据库操作Service实现
* @createDate 2022-04-02 20:24:36
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

}




