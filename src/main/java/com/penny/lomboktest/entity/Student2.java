package com.penny.lomboktest.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 0-Vector
 * @date 2019/11/29 13:15
 */
//@ToString(exclude = {"password"})
//@ToString(of = {"id", "name", "age"})
//@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(doNotUseGetters = true)
public class Student2 extends Person {

    private Integer id;

    private String name;

    private String password;

    private boolean female;

}
