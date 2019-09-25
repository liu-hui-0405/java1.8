package com.flatMap;

/**
 * @ClassName Book
 * @Description
 * @Author lh
 * @Date 2019-07-16 17:25
 **/
public class Book {
    private int price;
    private String name;
    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
