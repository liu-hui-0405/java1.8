package com.concat;

/**
 * @ClassName Book
 * @Description
 * @Author lh
 * @Date 2019-07-01 16:03
 **/
public class Book {

    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        final Book book = (Book) obj;
        if (this == book) {
            return true;
        } else {
            return (this.name.equals(book.name) && this.price == book.price);
        }
    }
    @Override
    public int hashCode() {
        int hashno = 7;
        hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
        return hashno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
