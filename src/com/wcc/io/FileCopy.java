package com.wcc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 14:33
 */
public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("d:/apache-maven-3.3.3.rar");
             FileOutputStream fos =new FileOutputStream("e:/test.rar")) {
            byte[] data = new byte[2048];
            int length = 0;
            while ((length = fin.read(data, 0, data.length)) != -1) {
                fos.write(data,0,length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
