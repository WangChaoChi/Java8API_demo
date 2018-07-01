package com.wcc.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @author wangcc
 * @decription:
 * @date 2018/7/1 20:27
 */
public class FileCopyDemo {
    public static void main(String[] args) throws Exception{
        //src:源文件；des：副本文件
        try (FileChannel src = new FileInputStream("f2.txt").getChannel();
        FileChannel des = new FileOutputStream("f2_bak.txt").getChannel()) {

            src.transferTo(0, src.size(), des);
            des.transferFrom(src, 0, src.size());
        }
    }
}
