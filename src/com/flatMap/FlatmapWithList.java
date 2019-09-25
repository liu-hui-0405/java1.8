package com.flatMap;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FlatmapWithList
 * @Description
 * @Author lh
 * @Date 2019-07-16 17:27
 **/
public class FlatmapWithList {
    public static void main(String[] args) {
            List<Book> books = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
            Writer w1 = new Writer("Mohan", books);
            books = Arrays.asList(new Book(30, "XXX"), new Book(15, "ZZZ"));
            Writer w2 = new Writer("Sohan", books);
            List<Writer> writers = Arrays.asList(w1, w2);
            System.out.println(writers.toString());

            Book book = writers.stream().flatMap(w -> w.getBooks().stream()).max(new BookComparator()).get();
            System.out.println("Name:"+book.getName()+", Price:"+ book.getPrice() );

    }
}
