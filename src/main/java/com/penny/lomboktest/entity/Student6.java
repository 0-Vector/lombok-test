package com.penny.lomboktest.entity;

import lombok.Builder;
import lombok.ToString;

/**
 * @author 0-Vector
 * @date 2019/11/29 13:15
 */
@Builder
@ToString
public class Student6 extends Person {

    private Integer id = 0;

    @Builder.Default
    private String name = "penny";

    private String password;

    private boolean female;

    public static void main(String[] args) {
        System.out.println(Student6.builder().id(1).password("123").female(true).build());
    }
}
