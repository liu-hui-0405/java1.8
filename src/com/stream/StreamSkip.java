package com.stream;

import java.util.Arrays;

/**
 * @ClassName StreamSkip
 * @Description
 * @Author lh
 * @Date 2019-07-15 14:11
 **/
public class StreamSkip {
    public static void main(String[] args) {
        int[] array = {3,5,10,15};
        Arrays.stream(array).skip(2).forEach(s -> System.out.println(s+ " "));
    }
}
