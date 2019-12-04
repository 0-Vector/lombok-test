package com.penny.lomboktest.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 0-Vector
 * @date 2019/11/29 13:15
 */

//@EqualsAndHashCode(callSuper = true)
@EqualsAndHashCode(onParam = {}, callSuper = true)
@Getter
public class Student3 extends Person {

    private Integer id;

    private String name;

    private String password;

    private boolean female;

}
