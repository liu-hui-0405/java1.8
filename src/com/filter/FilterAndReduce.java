package com.filter;

import java.util.List;

/**
 * @ClassName FilterAndReduce
 * @Description
 * @Author lh
 * @Date 2019-07-15 16:27
 **/
public class FilterAndReduce {
    public static void main(String[] args) {
        List<User> list = User.getUsers();
        list.stream().filter(u -> u.getName().endsWith("sh"))
                .mapToInt(u -> u.getAge())
                .reduce((x,y) -> x + y)
                .ifPresent(s -> System.out.println("Sum of age of users ending name with 'sh': "+ s));
    }
}
