package com.wcc.io;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.SplittableRandom;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 21:26
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        String fileName = "f6.txt";
        init(fileName);
        read(fileName);
        read(fileName);
        read(fileName);

    }

    private static void read(String fileName)throws Exception {
        RandomAccessFile f = new RandomAccessFile(fileName,"rw");
        int num =f.readInt();
        String name = f.readUTF();
        System.out.println(num+","+name);
        long p = f.getFilePointer();
        f.seek(0);
        num = f.readInt();
        num++;
        f.seek(0);
        f.writeInt(num);
        f.seek(p);
    }

    private static void init(String fileName) throws Exception {
        RandomAccessFile f = new RandomAccessFile(fileName,"rw");
        f.writeInt(200);
        f.writeUTF("wcc");
        f.close();
    }
}
