package com.penny.lomboktest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author 0-Vector
 * @date 2019/11/29 13:15
 */
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Student8 extends Person {

    private final Integer id = 0;

    private String name;

    private String password;

    private boolean female;

}
