package com.concat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName ConcatListsDemo
 * @Description
 * @Author lh
 * @Date 2019-07-01 16:03
 **/
public class ConcatListsDemo {
    public static void main(String[] args) {
        List<Book> list1 = new ArrayList<>();
        List<Book> list2 = new ArrayList<>();

        list1.add(new Book("Core Java", 200));
        list1.add(new Book("Spring MVC", 300));
        list1.add(new Book("Learning Freemarker", 150));

        list2.add(new Book("Core Java", 200));
        list2.add(new Book("Spring MVC", 300));
        list2.add(new Book("Learning Hibernate", 400));

        List<Book> bookList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        bookList.forEach(b -> System.out.println(b.getName() + " " + b.getPrice()));

        //去重
        System.out.println("--Remove duplicates using distinct()--");
        bookList = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        bookList.forEach(b->System.out.println(b.getName()+" "+ b.getPrice()));
    }
}
