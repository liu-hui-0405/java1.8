package com.flatMap;

import java.util.Comparator;

/**
 * @ClassName BookComparator
 * @Description
 * @Author lh
 * @Date 2019-07-16 17:26
 **/
public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getPrice() > b2.getPrice()) {
            return 1;
        } else if (b1.getPrice() == b2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
