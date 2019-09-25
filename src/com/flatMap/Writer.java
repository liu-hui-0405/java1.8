package com.flatMap;

import java.util.List;

/**
 * @ClassName Writer
 * @Description
 * @Author lh
 * @Date 2019-07-16 17:15
 **/
public class Writer {
    private String name;
    private List<Book> books;
    public Writer(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
