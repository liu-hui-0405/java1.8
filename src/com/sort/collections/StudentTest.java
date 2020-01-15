package com.sort.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 第一种：Comparable 排序接口
 * 若一个类实现了Comparable接口，就意味着“该类支持排序”。 假设“有一个List列表(或数组)，里面的元素是实现了Comparable接口的类”，则该List列表(或数组)可以通过 Collections.sort（或 Arrays.sort）进行排序。
 * 此外，“实现Comparable接口的类的对象”可以用作“有序映射(如TreeMap)”中的键或“有序集合(TreeSet)”中的元素，而不需要指定比较器。
 */
public class StudentTest {
    public static void main(String[] args) {
        //第一种方法示例：
        List<String> lists = Arrays.asList("5", "2", "6");
        //lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序
        Collections.sort(lists);
        System.out.println(lists);

        //第一种方法示例：
        List<Student> students = new ArrayList<Student>(){{
            add(new Student(1, 20));
            add(new Student(2, 19));
            add(new Student(3, 21));
        }};
        Collections.sort(students);
        System.out.println(students);
    }
}
