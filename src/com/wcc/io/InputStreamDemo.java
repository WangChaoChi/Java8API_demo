package com.wcc.io;

import java.io.FileInputStream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 14:11
 */
public class InputStreamDemo {
    public static void main(String[] args) throws Exception{
       /* FileInputStream fis = new FileInputStream("f2.txt");
        int data = fis.read();
        byte byteDate;
        while (data != -1) {
            byteDate=(byte) data;
            System.out.println((char) byteDate);
            data = fis.read();
        }
        fis.close();*/

       //try with resource 的写法
        try (FileInputStream fis = new FileInputStream("f2.txt")){
            byte byteDate;
            while ((byteDate=(byte) fis.read()) != -1) {
                System.out.println((char) byteDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
