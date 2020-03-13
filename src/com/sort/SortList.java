package com.sort;
import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName SortList
 * @Description
 * @Author lh
 * @Date 2019-07-15 14:43
 **/
public class SortList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(4, "Nilesh", 10));
        list.add(new Student(3, "Nilesh", 10));

        System.out.println("---Natural Sorting by Name---");
        list.stream().sorted().collect(Collectors.toList())
                .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Natural Sorting by Name in reverse order---");
        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
                .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age---");
        list.stream().sorted(Comparator.comparing(Student :: getAge)).collect(Collectors.toList())
                .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age with reverse order---");
        list.stream().sorted(Comparator.comparing(Student :: getAge).reversed()).collect(Collectors.toList())
                .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---含null值排序---");
        list.add(null);
        Collections.sort(list, Comparator.nullsFirst(Comparator.comparing(Student :: getAge).thenComparing(Student::getId)));
        list.forEach(System.out :: println);
    }
}
