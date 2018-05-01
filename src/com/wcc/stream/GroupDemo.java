package com.wcc.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/30 17:17
 */
public class GroupDemo {
    public static void main(String[] args) {
        Map<Persion.Gender, List<Persion>> group = Persion.persions().stream()
                .collect(Collectors.groupingBy(Persion::getGender));
        group.forEach((gender, persions) -> {
            System.out.println(gender);
            persions.forEach(System.out::println);
        });

        System.out.println("-------------------------------------");

        Map<Boolean, List<Persion>> partition = Persion.persions().stream()
                .collect(Collectors.partitioningBy(Persion::isMale));
        partition.forEach((gender, persions) -> {
            System.out.println(gender);
            persions.forEach(System.out::println);
        });
    }
}
