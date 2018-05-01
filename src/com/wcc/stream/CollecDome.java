package com.wcc.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/30 11:34
 */
public class CollecDome {
    public static void main(String[] args) {
        List<String> names1 = Persion.persions().stream().map(Persion::getName).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(names1);
        List<String> names2 = Persion.persions().stream().map(Persion::getName).collect(Collectors.toList());
        System.out.println(names2);
        Set<String> names3 = Persion.persions().stream().map(Persion::getName).collect(Collectors.toSet());
        System.out.println(names3);
        SortedSet<String> names4 = Persion.persions().stream().map(Persion::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(names4);
        long num=Persion.persions().stream().map(Persion::getName).collect(Collectors.counting());
        System.out.println(num);
        Map<Integer,String> names5=Persion.persions().stream().collect(Collectors.toMap(Persion::getId, Persion::getName));
        System.out.println(names5);
        String names6=Persion.persions().stream().map(Persion::getName).collect(Collectors.joining("|"));
        System.out.println(names6);
    }
}
