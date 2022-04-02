package com.atguigu.mybatisX.mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatisX.pojo.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author DELL_
* @description 针对表【t_emp】的数据库操作Mapper
* @createDate 2022-04-02 20:24:36
* @Entity com.atguigu.mybatisX.pojo.Emp
*/
public interface EmpMapper extends BaseMapper<Emp> {
    /**
     * 插入选择性
     *
     * @param emp 电磁脉冲
     * @return int
     */
    int insertSelective(Emp emp);

    /**
     * 删除开斋节和德尔国旗大于和emp名字
     *
     * @param eid     开斋节
     * @param delFlag 德尔国旗
     * @param empName emp名字
     * @return int
     */
    int deleteByEidAndDelFlagGreaterThanAndEmpName(@Param("eid") Integer eid,
                                                   @Param("delFlag") String delFlag,
                                                   @Param("empName") String empName);

    /**
     * 删除开斋节和德尔国旗=和emp名字
     *
     * @param eid     开斋节
     * @param delFlag 德尔国旗
     * @param empName emp名字
     * @return int
     */
    int deleteByEidAndDelFlagEqualsAndEmpNameLike(@Param("eid") Integer eid,
                                                  @Param("delFlag") String delFlag,
                                                  @Param("empName") String empName);
}




