package com.dubbo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 石玉龙 at 2023/6/21 12:37
 */
@Data
public class User implements Serializable {
    static final long serialVersionUID = -6430539691155161871L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
}
