package com.filter;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName FilterFindFirstAndForEach
 * @Description
 * @Author lh
 * @Date 2019-07-15 15:56
 **/
public class FilterFindFirstAndForEach {
    public static void main(String[] args) {
        List<User> list = User.getUsers();
        //TODO orElse()
        User user = list.stream().filter(u -> u.getName().endsWith("sh"))
                .findFirst().orElse(null);
        System.out.println("Using findFirst() ---");
        System.out.println(user.getName());

        list.stream().filter(u -> u.getName().endsWith("sh"))
                .forEach(u -> System.out.println(u.getName()));
        System.out.println("Using forEach() ---");
        System.out.println("-----------");

        Optional<User> first = list.stream().filter(u -> u.getName().endsWith("x")).findFirst();
        System.out.println(first.orElse(null));
    }
}
