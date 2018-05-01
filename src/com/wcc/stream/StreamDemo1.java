package com.wcc.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/21 23:32
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> optional = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(Integer::sum);//.forEach(System.out::println);
        System.out.println(optional.get());
        nums = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList());
        System.out.println(nums);

    }
}
