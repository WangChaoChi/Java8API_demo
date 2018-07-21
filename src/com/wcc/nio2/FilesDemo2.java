package com.wcc.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;

public class FilesDemo2 {

    public static void main(String[] args) throws Exception{

        Path src = Paths.get("f1.txt");

        Path des = Paths.get("E:\\new.txt");
        Files.copy(src, des,StandardCopyOption.REPLACE_EXISTING);

        FileTime ft = Files.getLastModifiedTime(src);
        System.out.println(ft.toMillis());
        System.out.println(ft);

        System.out.println(Files.probeContentType(src));

        Files.lines(src).forEach(System.out::println);
        System.out.println("---------------------------");

        String str = new String(Files.readAllBytes(src));
        System.out.println(str);
        System.out.println("-------------------------");

        Files.readAllLines(src).stream().forEach(System.out::println);

        Files.write(src, "Hello".getBytes(), StandardOpenOption.APPEND);

    }
}
