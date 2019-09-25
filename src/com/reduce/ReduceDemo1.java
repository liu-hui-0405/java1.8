package com.reduce;

import java.util.Arrays;

/**
 * @ClassName ReduceDemo1
 * @Description
 * @Author lh
 * @Date 2019-07-15 17:41
 **/
public class ReduceDemo1 {
    public static void main(String[] args) {
        int[] array = {23,43,56,97,32};
        Arrays.stream(array).reduce((x, y) -> x + y).ifPresent(System.out::println);
        Arrays.stream(array).reduce(Integer::sum).ifPresent(System.out::println);
        Arrays.stream(array).reduce(StatisticsUtility::addIntData).ifPresent(System.out::println);
    }
}
