package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "userName")
    private String userName;

    /**
     * 昵称
     */
    @TableField(value = "nickName")
    private String nickName;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 账号状态（0正常 1停用）
     */
    @TableField(value = "status")
    private String status;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 手机号
     */
    @TableField(value = "phonenumber")
    private String phonenumber;

    /**
     * 用户性别（0男，1女，2未知）
     */
    @TableField(value = "sex")
    private String sex;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 用户类型（0管理员，1普通用户）
     */
    @TableField(value = "userType")
    private String userType;

    /**
     * 创建人的用户id
     */
    @TableField(value = "createBy")
    private Long createBy;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField(value = "updateBy")
    private Long updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime")
    private LocalDateTime updateTime;

    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    @TableField(value = "delFag")
    private Integer delFag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
