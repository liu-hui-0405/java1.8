package com.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName DistinctSimpleDemo
 * @Description
 * @Author lh
 * @Date 2019-07-01 17:09
 **/
public class DistinctSimpleDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
        long count = list.stream().distinct().count();
        System.out.println(count);
        String s = list.stream().distinct().collect(Collectors.joining(","));
        System.out.println(s);
        String s2 = list.stream().distinct().collect(Collectors.joining("|", "[", "]"));
        System.out.println(s2);
    }
}
