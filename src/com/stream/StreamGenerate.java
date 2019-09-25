package com.stream;

import java.util.stream.Stream;

/**
 * 返回一个无限流
 * @ClassName StreamGenerate
 * @Description
 * @Author lh
 * @Date 2019-07-15 12:00
 **/
public class StreamGenerate {
    public static void main(String[] args) {
        String str = "Hello World!";
        Stream.generate(str::toString).limit(5).forEach(s->System.out.println(s));
        Stream.iterate(0, i -> i + 2).limit(5).forEach(s -> System.out.println(s));
    }
}
