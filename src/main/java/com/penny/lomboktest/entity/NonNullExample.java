package com.penny.lomboktest.entity;

import lombok.NonNull;

/**
 * @author 0-Vector
 * @date 2019/12/03 11:15
 */
public class NonNullExample {
    private String name;
    public NonNullExample(@NonNull Student student) {
        this.name = student.getName();
    }
}
