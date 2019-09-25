package com.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SortMapOfCustomObject
 * @Description
 * @Author lh
 * @Date 2019-07-15 15:08
 **/
public class SortMapOfCustomObject {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(1, "Mahesh", 12));
        map.put(2, new Student(2, "Suresh", 15));
        map.put(3, new Student(3, "Nilesh", 10));
        //Map Sorting by Value i.e student's natural ordering i.e by name
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> {
                    Integer key = e.getKey();
                    Student stu = e.getValue();
                    System.out.println("Key: " + key +", value: ("+ stu.getId() +", "+ stu.getName()+", "+ stu.getAge()+")");
                });
    }
}
