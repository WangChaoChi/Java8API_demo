package com.wcc.io;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 16:12
 */
public class PipedStreamDemo {
    public static void main(String[] args) throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);
        new Thread(() -> produce(pos)).start();
        new Thread(() -> consume(pis)).start();
    }

    public static void produce(PipedOutputStream pos) {
        try {
            for (int i = 0; i < 50; i++) {
                pos.write(i);
                pos.flush();
                System.out.println("写入："+i);
                Thread.sleep(500);
            }
            pos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void consume(PipedInputStream pis){
        try {
            int num = -1;
            while ((num = pis.read()) != -1) {
                System.out.println("读取："+num);
            }
            pis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
