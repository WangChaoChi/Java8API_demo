package com.wcc.nio;

import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wangcc
 * @decription:
 * @date 2018/7/1 19:41
 */
public class MapBufferDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("f2.txt");
        FileChannel fc = fis.getChannel();
        MappedByteBuffer mbp = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
        while (mbp.hasRemaining()) {
            System.out.println((char) mbp.get());
        }
    }

}
