package com.sum;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName SumOfListDemo
 * @Description
 * @Author lh
 * @Date 2019-07-16 14:52
 **/
public class SumOfListDemo {
    public static void main(String[] args) {
        List<Line> list = new ArrayList<>();
        list.add(new Line(1));
        list.add(new Line(2));
        list.add(new Line(3));
        list.add(new Line(4));

        System.out.println("--UsIng IntStream.sum()--");
        int sum = list.stream().mapToInt(Line::getLength).sum();
        // int sum = list.stream().map(Line::getLength).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("--Using Collectors.summingInt()--");
        sum = list.stream().collect(Collectors.summingInt(Line::getLength));
        // sum = list.stream().map(Line::getLength).collect(Collectors.summingInt(i -> i));
        System.out.println(sum);

        System.out.println("--Using summarizingInt()--");
        IntSummaryStatistics sta = list.stream().collect(Collectors.summarizingInt(Line::getLength));
        System.out.println(sta.getSum());

        System.out.println("--Using Stream.reduce() with combiner--");
        sum = list.parallelStream().reduce(0, (a, b) -> a + b.getLength(), (x, y) -> x + y);
        System.out.println(sum);
    }
}
