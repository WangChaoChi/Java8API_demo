package com.wcc.compar;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/12 14:04
 */
public class ComparUser {
    public static void main(String[] args) {
        User u1 = new User();
        u1.age = 18;
        User u2 = new User();
        u2.age = 20;

        if (u1.compareTo(u2) > 0) {
            System.out.println("u1年龄大");
        } else if (u1.compareTo(u2) < 0) {
            System.out.println("u1年龄小");
        } else {
            System.out.println("一样大");
        }
    }
}
