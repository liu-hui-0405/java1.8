package com.concat;

import java.util.stream.Stream;

/**
 * @ClassName ConcatStreamsDemo
 * @Description
 * @Author lh
 * @Date 2019-07-01 15:52
 **/
public class ConcatStreamsDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("AA", "BB", "CC");
        Stream<String> s2 = Stream.of("AA", "BB", "DD");
        Stream<String> s = Stream.concat(s1, s2);
        s.forEach(e->System.out.print(e+" "));

        //distinct()去重
        s1 = Stream.of("AA", "BB", "CC");
        s2 = Stream.of("AA", "BB", "DD");
        System.out.println("\nRemove duplicates using distinct()");
        s = Stream.concat(s1, s2).distinct();
        s.forEach(e->System.out.print(e+" "));
    }
}
