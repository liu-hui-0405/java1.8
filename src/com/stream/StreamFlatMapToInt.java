package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @ClassName StreamFlatMapToInt
 * @Description
 * @Author lh
 * @Date 2019-07-16 16:54
 **/
public class StreamFlatMapToInt {
    public static void main(String[] args) {
        int[][] data = {{1,2},{3,4},{5,6}};
        IntStream intStream = Arrays.stream(data).flatMapToInt(x -> Arrays.stream(x));
        System.out.println(intStream.sum());

        int[] m = {4,8,9};
        IntDemoPerson p1 = new IntDemoPerson("Ram", m);
        int[] n = {2,7,8};
        IntDemoPerson p2 = new IntDemoPerson("Shyam", n);
        List<IntDemoPerson> list = Arrays.asList(p1, p2);
        IntStream stream = list.stream().flatMapToInt(x -> Arrays.stream(x.getLuckyNum()));
        System.out.println(stream.max().getAsInt());
    }
}

class IntDemoPerson {
    private String name;
    private int[] luckyNum;

    public IntDemoPerson(String name, int[] luckyNum) {
        this.name = name;
        this.luckyNum = luckyNum;
    }

    public String getName() {
        return name;
    }

    public int[] getLuckyNum() {
        return luckyNum;
    }
}
