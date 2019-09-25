package com.reduce;

import java.util.Arrays;

/**
 * @ClassName StreamReduce
 * @Description
 * @Author lh
 * @Date 2019-07-15 14:09
 **/
public class StreamReduce {
    public static void main(String[] args) {
        int[] array = {3,5,10,15};
        int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
        System.out.println("Sum:"+ sum);
    }
}
