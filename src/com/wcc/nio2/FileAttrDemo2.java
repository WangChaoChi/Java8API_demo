package com.wcc.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Map;

public class FileAttrDemo2 {
    public static void main(String[] args)throws Exception {
        Path path = Paths.get("f1.txt");
        System.out.println(Files.getAttribute(path, "basic:size"));

        System.out.println(Files.getAttribute(path, "lastModifiedTime"));
        Files.setAttribute(path, "lastModifiedTime", FileTime.from(Instant.now()));
        System.out.println(Files.getAttribute(path, "lastModifiedTime"));

        BasicFileAttributes fa = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(fa.size());
        System.out.println(fa.creationTime());

        System.out.println("-------------------------------------");
        Map<String, Object> fa1 = Files.readAttributes(path, "size,lastModifiedTime");
        fa1.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        System.out.println("--------------------------------------");

        BasicFileAttributeView bfv = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes bf = bfv.readAttributes();
        System.out.println(bf.size());
        System.out.println(bf.creationTime());
    }
}
