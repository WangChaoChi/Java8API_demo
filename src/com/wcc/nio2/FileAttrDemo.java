package com.wcc.nio2;

import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;

public class FileAttrDemo {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("C:");
        FileStore store = Files.getFileStore(path);
        System.out.println(store.supportsFileAttributeView(BasicFileAttributeView.class));
        System.out.println(store.supportsFileAttributeView(PosixFileAttributeView.class));
    }
}
