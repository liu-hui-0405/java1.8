package com.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName Test
 * @Description
 * @Author lh
 * @Date 2019-06-28 17:12
 **/
public class MapToListTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "aaa");
        map.put(10, "a");
        map.put(26, "aaaa");
        map.put(11, "aa");
        System.out.println("--Convert Map Values to List--");
        List<String> valueList = map.values().stream().collect(Collectors.toList());
        valueList.forEach(n-> System.out.println(n));

        System.out.println("--Convert Map Values to List using sort--");
        List<String> sortedValueList = map.values().stream().sorted().collect(Collectors.toList());
        // List<String> sortedValueList = map.values().stream().sorted().
        //         reduce(Collectors.toList()).subList(0,2);
        sortedValueList.forEach(n -> System.out.println(n));

        System.out.println("--Convert Map keys to List--");
        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        keyList.forEach(System.out::println);

        System.out.println("--Convert Map keys to List using sort--");
        List<Integer> sortedKeyList = map.keySet().stream().sorted().collect(Collectors.toList());
        sortedKeyList.forEach(System.out::println);
    }
}
