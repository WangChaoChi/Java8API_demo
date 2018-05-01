package com.wcc.compar;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/12 13:57
 */
public class User implements Comparable<User> {
    int age;

    @Override
    public int compareTo(User o) {
        if (age > o.age) {
            return 1;
        } else if (age < o.age) {
            return -1;
        }
        return 0;
    }
}
