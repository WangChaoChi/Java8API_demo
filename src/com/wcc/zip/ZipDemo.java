package com.wcc.zip;

import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages_zh_CN;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.*;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/17 16:00
 */
public class ZipDemo {
    public static void main(String[] args) throws Exception{
//        createZip();
//        unzip();
//        ziplist();
        ziplist2();
    }

    /**
     * 创建zip文件
     * @throws Exception
     */
    private static void createZip()throws Exception{
        //zip文件输出目标
        try (ZipOutputStream zos =new ZipOutputStream(new FileOutputStream("text.zip"))){
            //设置相关属性
            zos.setLevel(Deflater.BEST_COMPRESSION);
            List<String> files = new ArrayList<>();
            files.add("f2.txt");
            files.add("f3.txt");
            inputZipEntry(files,zos);
        }
    }

    /**
     * 把文件设置入zipEntry中
     * @param fileNames
     * @param zos
     * @throws Exception
     */
    private static void inputZipEntry(List<String> fileNames,ZipOutputStream zos) throws Exception{
        for (String fileName:fileNames) {
            //准备压缩条目(名称不一定是文件名，可以任意名称)
            ZipEntry ze1 = new ZipEntry(fileName);
            zos.putNextEntry(ze1);//条目设置入输出流

            //将文件写入到ZipEntry中
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
            byte[] buffer = new byte[1024];//缓冲
            int len = -1;//读取长度
            while ((len =bis.read(buffer,0,buffer.length))!=-1) {
                zos.write(buffer,0,len);
            }
            bis.close();
        }
        zos.closeEntry();
    }

    /**
     * 解压zip文件
     */
    private static void unzip() throws Exception{
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("text.zip"))) {
            ZipEntry ze = null;
            while ((ze =zis.getNextEntry())!=null) {
                String name = ze.getName();
                String path = "unzipTest" + File.separator + name;
                File file = new File(path);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int len = -1;
                while ((len = zis.read(buffer, 0, buffer.length)) != -1) {
                    bos.write(buffer, 0, len);
                }
                bos.close();
            }
        }
    }

    /**
     * 读取压缩文件信息;写法一
     * @throws Exception
     */
    public static void ziplist() throws Exception{
        ZipFile file = new ZipFile("text.zip");
        Enumeration<? extends ZipEntry> e = file.entries();
        while (e.hasMoreElements()) {
            ZipEntry entry=e.nextElement();
            System.out.println(entry.getName());
        }
    }

    /**
     * 读取压缩文件信息；方法二,java8写法
     * @throws Exception
     */
    public static void ziplist2() throws Exception{
        ZipFile file = new ZipFile("text.zip");
        file.stream().forEach(entry -> System.out.println(entry.getName()));
    }
}
