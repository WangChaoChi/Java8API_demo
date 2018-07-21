package com.wcc.nio2;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemDemo {
    public static void main(String[] args)throws Exception {
        FileSystem fs = FileSystems.getDefault();
        System.out.println(fs.isReadOnly());
        System.out.println(fs.getSeparator());

        //文件系统存储设备：
        for (FileStore store: fs.getFileStores()) {
            System.out.printf("总空间：%s,未分配空间：%s,可用空间：%s,是否只读：%s,名称：%s,文件系统类型：%s\n",
                    store.getTotalSpace(),
                    store.getUnallocatedSpace(),
                    store.getUsableSpace(),
                    store.isReadOnly(),
                    store.name(),
                    store.type());
        }
        for (Path path: fs.getRootDirectories()) {
            System.out.println(path);
        }
    }
}
