package com.penny.lomboktest.entity;

import lombok.*;

/**
 * @author 0-Vector
 * @date 2019/11/29 13:15
 */

//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor(staticName = "getInstance")
public class Student4 extends Person {

    private final Integer id = 0;

    private @NonNull String name;

    private String password;

    private static String sid;

}
