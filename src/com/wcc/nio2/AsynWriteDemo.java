package com.wcc.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AsynWriteDemo {

    private static class Attachment{
        private Path path;
        private ByteBuffer byteBuffer;
        private AsynchronousFileChannel channel;
    }

    private static class WriteHandler implements CompletionHandler<Integer, Attachment> {
        //异步操作成功时调用
        @Override
        public void completed(Integer result, Attachment attachment) {
            try {
                attachment.channel.close();
                System.out.println("写数据完成");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //异步操作失败时调用
        @Override
        public void failed(Throwable exc, Attachment attachment) {
            try {
                System.out.println(exc.getMessage());
                attachment.channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws Exception {
        Path path = Paths.get("aw.txt");
        AsynchronousFileChannel afc = AsynchronousFileChannel.open(path,
                StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        Attachment attachment = new Attachment();
        attachment.path = path;
        attachment.byteBuffer = getByteBuffer();
        attachment.channel = afc;

        afc.write(getByteBuffer(),0,attachment,new WriteHandler());
        Thread.sleep(5000);
        System.out.println("完成");
    }

    private static ByteBuffer getByteBuffer(){
        return ByteBuffer.wrap("Hello".getBytes());
    }
}
