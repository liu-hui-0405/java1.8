package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName ListToMapTest
 * @Description
 * @Author lh
 * @Date 2019-07-01 09:12
 **/
public class ListToMapTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList();
        list.add(new Person(1001, "小A"));
        list.add(new Person(1002, "小B"));
        list.add(new Person(1003, "小C"));
        // 一、key值不重复
        Map<Integer, String> map = list.stream().collect(
                Collectors.toMap(Person::getId, Person::getName));
        // Map<Integer, Person> map = list.stream().collect(
        //         Collectors.toMap(Person::getId, Function.identity()));
        System.out.println("key值不重复情况下，list->map:" + map);

        // 二、key值重复
        list.add(new Person(1003, "小D"));
        // 1.重复时用后面的value 覆盖前面的value
        Map<Integer, String> map2 = list.stream().collect(
                Collectors.toMap(Person::getId, Person::getName, (v1, v2) -> v2));
        System.out.println("重复时用后面的value 覆盖前面的value，list->map:" + map2);
        //2.重复时将前面的value 和后面的value拼接起来
        Map<Integer, String> map3 = list.stream().collect(
                Collectors.toMap(Person::getId, Person::getName,(v1 , v2)-> v1+","+v2 ));
        System.out.println("重复时将前面的value 和后面的value拼接起来，list->map:" + map3);

        // 三、value为空
        list.add(new Person(1004, null));
        Map<Integer, List<String>> map4 = list.stream().collect(Collectors.toMap(Person::getId,
                p -> {
                    ArrayList<String> getNameList = new ArrayList<>();
                    getNameList.add(p.getName());
                    return getNameList;
                },
                // (List<String> value1, List<String> value2) -> {
                //     value1.addAll(value2);
                //     return value1;
                // }
                (v1, v2) -> v2
        ));
        System.out.println("value为空，list->map:" + map4);
    }
}
