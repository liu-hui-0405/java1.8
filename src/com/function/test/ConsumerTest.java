package com.function.test;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @ClassName: ConsumerTest
 * @Description: Consumer<T> => void accept(T t);
 *              consumer接口就是一个消费型的接口，接受一个输入参数，无返回值
 *              https://blog.csdn.net/sihai12345/article/details/99374583
 * @Author: LH
 * @CreateDate: 2020/8/13
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/8/13
 * @UpdateRemark: UpdateRemark
 */
public class ConsumerTest {
    public static void main(String[] args) {
        //1、 使用consumer接口实现方法
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Stream<String> stream = Stream.of("aaa", "bbb", "ddd", "ccc", "fff");
        stream.forEach(consumer);

        System.out.println("********************");


        //2、 使用lambda表达式，forEach方法需要的就是一个Consumer接口
        stream = Stream.of("aaa", "bbb", "ddd", "ccc", "fff");
        Consumer<String> consumer1 = (s) -> System.out.println(s);//lambda表达式返回的就是一个Consumer接口
        stream.forEach(consumer1);
        //更直接的方式
        //stream.forEach((s) -> System.out.println(s));

        System.out.println("********************");


        //3、 使用方法引用，方法引用也是一个consumer
        stream = Stream.of("aaa", "bbb", "ddd", "ccc", "fff");
        Consumer consumer2 = System.out::println;
        stream.forEach(consumer2);
        //更直接的方式
        //stream.forEach(System.out::println);
    }

}
