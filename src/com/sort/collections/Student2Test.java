package com.sort.collections;

import java.util.*;

/**
 * 第二种：Comparator比较器接口。
 * 我们若需要控制某个类的次序，而该类本身不支持排序(即没有实现Comparable接口)；我们可以建立一个“比较器”来进行排序。这个“比较器”只需要实现Comparator接口即可。
 *
 * Collections.sort(list, new PriceComparator())
 *
 * 参数一：需要排序的list
 * 参数二：比较器，实现Comparator接口的类，返回一个int型的值，就相当于一个标志，告诉sort方法按什么顺序来对list进行排序。
 * Comparator是个接口，可重写compare()及equals()这两个方法,用于比较功能；如果是null的话，就是使用元素的默认顺序，如a,b,c,d,e,f,g，就是a,b,c,d,e,f,g这样，当然数字也是这样的。
 *
 * compare（a,b）方法:根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。
 * equals（obj）方法：仅当指定的对象也是一个 Comparator，并且强行实施与此 Comparator 相同的排序时才返回 true。
 */
public class Student2Test {
    public static void main(String[] args) {
        //第一种方法示例：
        List<String> lists = Arrays.asList("5", "2", "6");
        //lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序
        Collections.sort(lists);
        System.out.println(lists);

        //第一种方法示例：
        List<Student2> students = new ArrayList<Student2>(){{
            add(new Student2(1, 20));
            add(new Student2(2, 19));
            add(new Student2(3, 21));
        }};
        Collections.sort(students, new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                /**
                 * 升序排的话就是第一个参数.compareTo(第二个参数);
                 * 降序排的话就是第二个参数.compareTo(第一个参数);
                 */
                return o2.getAge().compareTo(o1.getAge());
                //return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(students);
    }
}
