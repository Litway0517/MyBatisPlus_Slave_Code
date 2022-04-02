package com.atguigu.mybatisX.mapper;
import java.util.List;
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

    /**
     * 开斋节=和年龄之间选择
     *
     * @param eid      开斋节
     * @param beginAge 开始年龄
     * @param endAge   时代结束
     * @return {@link List}<{@link Emp}>
     */
    List<Emp> selectByEidEqualsAndAgeBetween(@Param("eid") Integer eid,
                                             @Param("beginAge") Integer beginAge,
                                             @Param("endAge") Integer endAge);

    /**
     * 更新年龄和性别
     *
     * @param age 年龄
     * @param sex 性
     * @return int
     */
    int updateAgeAndSex(@Param("age") Integer age, @Param("sex") String sex);

    /**
     * 更新年龄和emp名字开斋节和德尔国旗
     *
     * @param age     年龄
     * @param empName emp名字
     * @param eid     开斋节
     * @param delFlag 德尔国旗
     * @return int
     */
    int updateAgeAndEmpNameByEidAndDelFlag(@Param("age") Integer age,
                                           @Param("empName") String empName,
                                           @Param("eid") Integer eid,
                                           @Param("delFlag") String delFlag);
}




