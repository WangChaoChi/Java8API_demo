package com.wcc.nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * @author wangcc
 * @decription:
 * @date 2018/7/1 20:14
 */
public class FileLockDemo {
    public static void main(String[] args)throws Exception {
        RandomAccessFile raf = new RandomAccessFile("f2.txt", "rw");
        FileChannel fc = raf.getChannel();
//        FileLock fl = fc.lock();//排他锁
        FileLock fl = fc.lock(0,fc.size(),true);//共享锁
        System.out.println("锁定文件");
        Thread.sleep(5000);
        fl.release();//释放锁
    }
}
