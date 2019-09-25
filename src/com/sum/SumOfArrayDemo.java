package com.sum;
import java.util.Arrays;

/**
 * @ClassName SumOfArrayDemo
 * @Description
 * @Author lh
 * @Date 2019-07-16 14:46
 **/
public class SumOfArrayDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("--Using IntStream.sum()--");
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

        System.out.println("--Using Stream.reduce() with IntBinaryOperator--");
        sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        System.out.println("--Using Stream.reduce() with Integer.sum()--");
        sum = Arrays.stream(array).reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println("--Using custom method--");
        sum = Arrays.stream(array).reduce(0, StatisticsUtility::addIntData);
        System.out.println(sum);
    }
}
