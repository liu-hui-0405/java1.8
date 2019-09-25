package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @ClassName FunctionDemo
 * @Description
 * @Author lh
 * @Date 2019-07-10 18:01
 **/
public class FunctionDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("Ram",20));
        list.add(new Student("Shyam",22));
        list.add(new Student("Kabir",18));

        System.out.println("-------Simple use of function-------");
        // Simple use of function
        for (Student student : list) {
            System.out.println(student.customShow(s -> s.getName() + ":" + s.getAge()));
        }

        //声明函数方法一
        Function<Student, String> styleOne = s -> {
            String result =  "Name:"+s.getName() +" and Age:"+s.getAge();
            return result;
        };

        //声明函数方法二
        Function<Student, String> styleTwo = s ->
                "Name:"+s.getName() +" and Age:"+s.getAge();

        System.out.println("-------print value by style one-------");
        //使用方法一函数打印list的值
        for (Student student : list) {
            System.out.println(student.customShow(styleOne));
        }

        System.out.println("-------print value by style two-------");
        //使用方法二函数打印list的值
        for(Student st: list){
            System.out.println(st.customShow(styleTwo));
        }
    }
}
