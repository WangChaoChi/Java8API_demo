package com.wcc.nio;

import com.wcc.io.RandomAccessFileDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/**
 * @author wangcc
 * @decription:
 * @date 2018/7/1 18:14
 */
public class ChannelDemo {
    public static void main(String[] args) throws Exception {
        //流和通道之间的互相转换
        FileInputStream fis = new FileInputStream("f2.txt");
        ReadableByteChannel rbc = Channels.newChannel(fis);
        InputStream is = Channels.newInputStream(rbc);

        FileChannel fc = fis.getChannel();//通过InputStream得到的Channel为只读通道

        RandomAccessFile raf1 = new RandomAccessFile("", "r");
        FileChannel fc1 = raf1.getChannel();//只读

        RandomAccessFile raf2 = new RandomAccessFile("", "r");
        FileChannel fc2 = raf2.getChannel();//读写



    }
}
