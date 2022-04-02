package com.atguigu.mybatisX.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_emp
 */
@TableName(value ="t_emp")
@Data
public class Emp implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer eid;

    /**
     * 
     */
    private String empName;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String sex;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private Integer did;

    /**
     * 
     */
    private String delFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}