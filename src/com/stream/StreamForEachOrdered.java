package com.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StreamForEachOrdered
 * @Description
 * @Author lh
 * @Date 2019-07-15 11:50
 **/
public class StreamForEachOrdered {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("-----forEach()-----");
        list.stream().parallel().forEach(s -> System.out.println(s));
        System.out.println("-----forEachOrdered-----");
        list.stream().parallel().forEachOrdered(s -> System.out.println(s));
    }
}
