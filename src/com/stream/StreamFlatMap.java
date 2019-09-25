package com.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName StreamFlatMap
 * @Description
 * @Author lh
 * @Date 2019-07-15 11:18
 **/
public class StreamFlatMap {
    public static void main(String[] args) {
        //测试一
        Integer[][] data = {{1,2},{3,4},{5,6}};

        // flatMap与map的区别在于 flatMap是将一个流中的每个值都转成一个个流，然后再将这些流扁平化成为一个流 。
        Arrays.stream(data).flatMap(x -> Arrays.stream(x))
                .filter(i -> i >= 3)
                .forEach(s -> System.out.println(s + ""));
        // Stream<Integer[]> stream = Arrays.stream(data);
        // Stream<Integer> integerStream = stream.flatMap(x -> Arrays.stream(x));
        // integerStream.filter(i -> i >= 3).forEach(s -> System.out.println(s + " "));

        //测试二
        List<String> strs = Arrays.asList("好,好,学", "习,天,天", "向,上");

        List<String[]> strArray = strs.stream().map(str -> str.split(",")).collect(Collectors.toList());
        //strArray => [["好","好","学"],["习","天","天"],["向","上"]]

        List<String> strList = strs.stream().map(str -> str.split(",")).flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println("strList => " + strList);
    }
}
