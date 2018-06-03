package com.wcc.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 14:26
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        try (FileOutputStream os = new FileOutputStream("f3.txt")) {
            os.write("Hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
