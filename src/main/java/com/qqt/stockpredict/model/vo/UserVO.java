package com.qqt.stockpredict.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author QQT
 * @Create 2023--11--17 10:14
 */
@Data
public class UserVO implements Serializable {
    /**
     * 用户ID
     */
    private Integer Id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户名/账号
     */
    private String userName;


    /**
     * 性别
     */
    private String sex;

    /**
     * token
     */
    private String token;

    private static final long serialVersionUID = 1L;
}
