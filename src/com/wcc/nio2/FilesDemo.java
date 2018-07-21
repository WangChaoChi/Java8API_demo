package com.wcc.nio2;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("f8.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        Path path1 = Paths.get("d1/d2/f3.txt");
//        Files.createDirectory(path1);
        Files.createDirectories(path1);

//        System.out.println(Files.createTempFile("ttt",".tmp").toRealPath());

//        Files.createSymbolicLink(Paths.get("C:\\f8.txt"), Paths.get("f8.txt"));
        System.out.println(Files.exists(Paths.get("C:\\f8.txt"), LinkOption.NOFOLLOW_LINKS));

        Files.delete(path);
    }


}
