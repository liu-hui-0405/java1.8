package com.function.test;

import java.util.function.Predicate;

/**
 * @ClassName: predicate
 * @Description: Supplier<T> => T get();
 *              Predicate接口是一个谓词型接口, 接受一个输入参数，返回布尔值
 * @Author: LH
 * @CreateDate: 2020/8/13
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/8/13
 * @UpdateRemark: UpdateRemark
 */
public class PredicateTest {
    public static void main(String[] args) {
        //1、 使用Predicate接口实现方法,只有一个test方法，传入一个参数，返回一个bool值
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 5) {
                    return true;
                }
                return false;
            }
        };
        System.out.println(predicate.test(6));

        System.out.println("********************");

        //2、 使用lambda表达式，
        predicate = (t) -> t > 5;
        System.out.println(predicate.test(1));
    }
}
