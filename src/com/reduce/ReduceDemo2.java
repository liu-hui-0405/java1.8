package com.reduce;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ReduceDemo2
 * @Description
 * @Author lh
 * @Date 2019-07-15 18:06
 **/
public class ReduceDemo2 {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(2, 3, 4);
        //(2+2)*(2+3)*(2+4)=4*5*6
        int res = list2.parallelStream().reduce(2, (s1, s2) -> s1 + s2, (p, q) -> p * q);
        System.out.println(res);

        // List<Integer> list = Arrays.asList(2,3,4,5,6);
        // Integer value =  list
        //         .parallelStream()
        //         .reduce(2, (s1, s2) -> {
        //             //不改变初始的i,而是返回一个新的i
        //             System.out.println(String.format("s1=%s, s2=%s, result=%s, thread name:%s", s1,s2,s1*s2, Thread.currentThread().getName()));
        //             return s1 * s2;
        //         }, (p,q) -> {
        //             System.out.println(String.format("p=%s, q=%s, total=%s, thread name:%s", p,q,p+q, Thread.currentThread().getName()));
        //             return p + q;
        //         });
        // System.out.println(value);
    }
}
