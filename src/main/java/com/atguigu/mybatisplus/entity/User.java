package com.atguigu.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户
 *
 * @author DELL_
 * @date 2022/04/02
 */
@Data
@TableName("t_user")
public class User {

    /**
     * uid
     */
    @TableId("uid")
    private Long uid;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性
     */
    private Integer sex;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 被删除
     */
    private Integer isDeleted;

}
