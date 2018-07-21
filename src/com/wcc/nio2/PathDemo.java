package com.wcc.nio2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path p1 = FileSystems.getDefault().getPath("G:\\my_workspace\\Java8API_demo\\f1.txt");
        System.out.println(p1);
        int count = p1.getNameCount();
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(p1.getName(i));
        }
        System.out.println(p1.getRoot());
        System.out.println(p1.getParent());
        System.out.println(p1.isAbsolute());

        System.out.println("---------------------------------");

        Path p2 = Paths.get("D:\\java\\..\\.\\se\\f3.txt");
        System.out.println(p2.normalize());

        Path p3 = Paths.get("hello\\f4.txt");
        System.out.println(p2.resolve(p3));

        Path p4 = Paths.get("D:\\java");
        System.out.println(p2.relativize(p4));
        System.out.println(p4.relativize(p2));

        System.out.println(p2.subpath(0,4));

        System.out.println(p2.startsWith(p4));
        System.out.println(p2.endsWith(Paths.get("se\\f3.txt")));
        System.out.println(p2.normalize().equals(Paths.get("D:\\SE\\f3.txt")));

    }
}
