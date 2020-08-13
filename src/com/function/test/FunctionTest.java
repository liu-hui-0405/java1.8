package com.function.test;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @ClassName: Function
 * @Description: Function<T, R> => R apply(T t);
 *                接受一个输入参数，返回一个结果
 * @Author: LH
 * @CreateDate: 2020/8/13
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/8/13
 * @UpdateRemark: UpdateRemark
 */
public class FunctionTest {
    public static void main(String[] args) {
        // 使用map方法，泛型的第一个参数是转换前的类型，第二个是转化后的类型
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();//获取每个字符串的长度，并且返回
            }
        };

        Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
        Stream<Integer> stream1 = stream.map(function);
        stream1.forEach(System.out::println);

        //stream.map(s -> s.length()).forEach(System.out::println);
    }
}
