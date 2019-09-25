package com.stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName StreamPeek
 * @Description
 * @Author lh
 * @Date 2019-07-15 14:00
 **/
public class StreamPeek {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C");
        list.stream().peek(s -> System.out.println(s + s)).collect(Collectors.toList());
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
