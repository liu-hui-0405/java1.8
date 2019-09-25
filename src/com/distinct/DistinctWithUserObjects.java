package com.distinct;

import com.concat.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DistinctWithUserObjects
 * @Description
 * @Author lh
 * @Date 2019-07-01 17:13
 **/
public class DistinctWithUserObjects {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        {
            list.add(new Book("Core Java", 200));
            list.add(new Book("Core Java", 200));
            list.add(new Book("Learning Freemarker", 150));
            list.add(new Book("Spring MVC", 300));
            list.add(new Book("Spring MVC", 300));
        }
        long count = list.stream().distinct().count();
        System.out.println("No. of distinct books:"+count);
        list.stream().distinct().forEach(b -> System.out.println(b.getName()+ "," + b.getPrice()));
    }
}
