package com.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName User
 * @Description
 * @Author lh
 * @Date 2019-07-15 15:55
 **/
public class User {
    private int id;
    private String name;
    private int age;
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static List<User> getUsers() {
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "Dinesh", 20));
        list.add(new User(2, "Kamal", 30));
        list.add(new User(3, "Vijay", 20));
        list.add(new User(4, "Ramesh", 30));
        list.add(new User(5, "Mahesh", 10));
        return list;
    }
}
