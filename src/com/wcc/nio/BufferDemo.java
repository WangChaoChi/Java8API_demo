package com.wcc.nio;

import java.nio.ByteBuffer;

/**
 * @author wangcc
 * @decription:
 * @date 2018/7/1 15:17
 */
public class BufferDemo {
    //创建ByteBuffer
    public static void main(String[] args) {
        ByteBuffer b1 = ByteBuffer.allocate(10);//在java虚拟机内存中分配大小
        ByteBuffer b2 = ByteBuffer.wrap(new byte[]{1, 2, 3});
        //在操作系统中分配大小，ByteBuffer特有的创建方法
        ByteBuffer b3 = ByteBuffer.allocateDirect(10);

        int limit = b1.limit();
        for (int i = 0; i < limit; i++) {
            b1.put(i,(byte) i);
        }

        for (int i = 0; i < limit; i++) {
            System.out.println(b1.position()+":"+b1.get());
        }
    }
}
