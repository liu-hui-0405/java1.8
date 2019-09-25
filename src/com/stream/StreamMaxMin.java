package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName StreamMaxMin
 * @Description
 * @Author lh
 * @Date 2019-07-15 13:48
 **/
public class StreamMaxMin {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("G","B","F","E");
        String max = list.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println("Max:"+ max);
        String min = list.stream().min(Comparator.comparing(String::valueOf)).get();
        System.out.println("Min:"+ min);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
