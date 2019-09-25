package com.function;

import java.util.function.Function;

/**
 * @ClassName Student
 * @Description
 * @Author lh
 * @Date 2019-07-10 17:57
 **/
public class Student {

    private String name;

    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String customShow(Function<Student,String> fun){
        return fun.apply(this);
    }
}
