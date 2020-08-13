package com.function.test;

import java.util.Random;
import java.util.function.Supplier;

/**
 * @ClassName: SupplierTest
 * @Description: Supplier<T> => T get();
 *               Supplier接口是一个供给型的接口，无输入参数，返回一个结果，
 * @Author: LH
 * @CreateDate: 2020/8/13
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/8/13
 * @UpdateRemark: UpdateRemark
 */
public class SupplierTest {
    public static void main(String[] args) {
        //1、 使用Supplier接口实现方法,只有一个get方法，无参数，返回一个值
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                //返回一个随机值
                return new Random().nextInt();
            }
        };
        System.out.println(supplier.get());

        System.out.println("********************");

        //2、 使用lambda表达式，
        supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());

        System.out.println("********************");

        //3、 使用方法引用
        Supplier<Double> supplier2 = Math::random;
        System.out.println(supplier2.get());

    }
}
