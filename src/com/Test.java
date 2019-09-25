package com;
import com.collection.Person;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName Test
 * @Description
 * @Author lh
 * @Date 2019-07-02 17:24
 **/
public class Test {
    public static void main(String[] args) {

        String s = null;
        System.out.println(s.split(","));


        BigDecimal a = BigDecimal.valueOf(1);
        System.out.println(a.divide(BigDecimal.valueOf(100)));

        // int i = 123223232;
        // System.out.println(new Long(i));
        // System.out.println(Long.parseLong(String.valueOf(i)));

        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(100, "Sohan"));
        list.add(new Person(300, "Mahesh"));
        LinkedHashMap<Integer, String> map = list.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName,
                        (x, y) -> x+", "+ y, LinkedHashMap::new));
        map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
    }
}
