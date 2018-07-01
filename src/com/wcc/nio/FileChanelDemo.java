package com.wcc.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wangcc
 * @decription:
 * @date 2018/7/1 19:03
 */
public class FileChanelDemo {
    public static void main(String[] args) throws Exception {
        reader();
        writer();
    }

    private static void writer() throws Exception{
        FileOutputStream fis = new FileOutputStream("f5.txt");
        FileChannel fc = fis.getChannel();
        String text = "abcdefg";
        ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
        fc.write(buffer);
    }

    private static void reader() throws IOException {
        FileInputStream fis = new FileInputStream("f2.txt");
        FileChannel fc = fis.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (fc.read(buffer) > 0) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            buffer.clear();
        }
    }
}
