package com.sum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName SumOfListOfArrayDemo
 * @Description
 * @Author lh
 * @Date 2019-07-16 15:25
 **/
public class SumOfListOfArrayDemo {
    public static void main(String[] args) {
        List<Integer[]> list = new ArrayList<>();
        Integer[] a1 = {1,1,1,1};
        list.add(a1);
        Integer[] a2 = {2,2,2,2};
        list.add(a2);

        System.out.println("--Using Collectors.summingInt()--");
        int sum = list.stream().flatMap(a -> Arrays.stream(a)).collect(Collectors.summingInt(i -> i));
        System.out.println(sum);

        System.out.println("--Using Collectors.summarizingInt()--");
        IntSummaryStatistics sta = list.stream().flatMap(a -> Arrays.stream(a)).collect(Collectors.summarizingInt(i -> i));
        System.out.println(sta.getSum());

        System.out.println("--Using IntStream.sum()--");
        sum = list.stream().flatMap(a -> Arrays.stream(a)).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
