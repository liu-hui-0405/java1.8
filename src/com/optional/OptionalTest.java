package com.optional;

import java.util.Optional;

/**
 * @ClassName OptionalTest
 * @Description
 * @Author lh
 * @Date 2019-10-23 09:46
 **/
public class OptionalTest {
    public static void main(String[] args) {
        // 1、创建一个包装对象值为空的Optional对象
        Optional<User> optUser= Optional.empty();
        // 2、创建包装对象值非空的Optional对象
        Optional<User> optUser1 = Optional.of(new User(1, "小明"));
        // 3、创建包装对象值允许为空的Optional对象
        Optional<User> optUser2 = Optional.ofNullable(null);
        // System.out.println(optUser2.get());
        optUser2.ifPresent(o -> System.out.println("----------" + o.getName()));
        String s = optUser2.filter(u -> u.getId() > 2).map(o -> o.getName()).orElse("小花");
        System.out.println("---" + s);
        // String s2 = optUser2.map(o -> o.getName()).orElseThrow(RuntimeException::new);
    }
}
