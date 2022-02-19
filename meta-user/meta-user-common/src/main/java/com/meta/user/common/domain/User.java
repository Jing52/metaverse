package com.meta.user.common.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.meta.user.common.domain.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @program: metaverse
 * @description:
 * @packagename: com.meta.user.common.domain
 * @author: cxy
 * @date: 2022-02-19 15:54:10
 **/
@TableName("meta_user")
@Data
public class User extends BaseEntity {

    @TableId(type = IdType.ASSIGN_ID)
    @TableField("user_id")
    private Long userId;

    @TableField("user_name")
    private String userName;

    @TableField("age")
    private Integer age;

    @TableField("gender")
    private Integer gender;

    @TableField("password")
    private String password;

    @TableField("birthday")
    private Date birthday;
}
