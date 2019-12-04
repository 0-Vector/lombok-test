package com.penny.lomboktest.entity;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 0-Vector
 * @date 2019/11/29 13:15
 */
@Log
//@Slf4j
//@CommonsLog
//@Log4j
//@Log4j2
public class Student7 extends Person {

    private Integer id;

    private String name;

    private String password;

    private boolean female;

    public static void main(String[] args) {
        log.info("==== ok =====");
    }
}
