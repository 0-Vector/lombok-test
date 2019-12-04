package com.penny.lomboktest.entity;

import lombok.Data;

/**
 * @author 0-Vector
 * @date 2019/11/29 13:15
 */
@Data
public class Student5 extends Person {

    private Integer id = 0;

    private String name;

    private String password;

    private boolean female;
}
