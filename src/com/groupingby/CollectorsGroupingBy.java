package com.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", "A", 20);
        Student s2 = new Student("Shyam", "B", 22);
        Student s3 = new Student("Mohan", "A", 22);
        Student s4 = new Student("Mahesh", "C", 20);
        Student s5 = new Student("Krishna", "B", 21);
        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
        //Group Student on the basis of ClassName
        System.out.println("----Group Student on the basis of ClassName----");
        Map<String, List<Student>> stdByClass = list.stream()
                .collect(Collectors.groupingBy(Student::getClassName));

        stdByClass.forEach((k, v) -> System.out.println("Key:" + k + "  " +
                ((List<Student>) v).stream().map(m -> m.getName()).collect(Collectors.joining(","))));

        //Group Student on the basis of age
        System.out.println("----Group Student on the basis of age----");
        Map<Integer, List<Student>> stdByAge = list.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        stdByAge.forEach((k, v) -> System.out.println("Key:" + k + "  " +
                ((List<Student>) v).stream().map(m -> m.getName()).collect(Collectors.joining(","))));
    }
}
