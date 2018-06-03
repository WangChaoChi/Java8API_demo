package com.wcc.io;

import java.io.Serializable;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 17:49
 */
public class User implements Serializable {
    private static final long serialVersionUID=1L;

    private transient int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
