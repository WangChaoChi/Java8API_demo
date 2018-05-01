package com.wcc.compar;

import java.util.Comparator;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/12 14:52
 */
public class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        }
        return 0;
    }
}
