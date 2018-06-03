package com.wcc.io;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 21:52
 */
public class SystemErrDemo {
    public static void main(String[] args) throws Exception{
        System.err.println("Error");
        int num = -1;
        while ((num =System.in.read())!='\n') {
            System.out.print((char) num);
        }
    }
}
