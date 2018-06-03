package com.wcc.io;

import java.io.File;
import java.io.PrintStream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 21:57
 */
public class RedirectDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("Out.txt");
        PrintStream p = new PrintStream(file);
        System.setOut(p);
        System.out.println("Hello");
    }
}
