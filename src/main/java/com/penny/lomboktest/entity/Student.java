package com.penny.lomboktest.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 0-Vector
 * @date 2019/11/29 13:15
 */
public class Student {

    @Setter
    private Integer id;

    @Setter(AccessLevel.PROTECTED)
    @Getter
    private String name;

    @Setter(AccessLevel.PACKAGE)
    private Integer age;

    @Setter(AccessLevel.NONE)
    private String password;

    @Getter
    private boolean female;

}
