package com.wcc.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 17:32
 */
public class DataStream {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("f4.local"));
        dos.writeInt(100);
        //dos.writeInt(200);
        dos.writeDouble(0.0011);
        dos.writeUTF("hello");
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("f4.local"));
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
