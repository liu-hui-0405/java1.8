package com.sort.collections;

public class Student implements Comparable<Student>{
    private Integer id;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //return this.age.compareTo(o.getAge()); //升序
        //return o.getAge().compareTo(this.age); //倒序
        //return o.getAge() - this.age; //倒序
        return this.age - o.getAge(); //升序
    }
}
