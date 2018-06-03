package com.wcc.io;

import java.beans.DesignMode;
import java.io.File;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/2 19:09
 */
public class FileDemo {
    public static void main(String[] args) throws Exception{
       /* //得到用户工作空间
        System.out.println(System.getProperty("user.dir"));
        //对于没有给定目录的文件会在工作空间中创建
        File f1 = new File("f1.txt");
        System.out.println(f1.exists());
        if (!f1.exists()) {
            System.out.println(f1.createNewFile());;
        }
        f1.renameTo(new File("f2.txt"));

        //得到临时文件目录
        System.out.println(System.getProperty("java.io.tmpdir"));
        //创建临时文件设置前缀和后缀
        File.createTempFile("prefix", "suffix");*/
        File src = new File("src/com/wcc/stream");
        for (String str : src.list()) {
            System.out.println(str);
        }

       /* File file = new File("src/com/wcc/stream");
        for (File f : file.listFiles()) {
            System.out.println(f.getPath());
            System.out.println(f.getAbsoluteFile());
        }*/

        File fileList = new File("src/com/wcc/stream");
        File[] files = fileList.listFiles(file->file.getName().endsWith("Demo.java"));
        for (File f : files) {
            System.out.println(f.getPath());
            System.out.println(f.getAbsoluteFile());
        }
    }
}
