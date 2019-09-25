package com.reduce;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ReduceToList
 * @Description
 * @Author lh
 * @Date 2019-07-16 11:43
 **/
public class ReduceToList {
    public static void main(String[] args) {
        //Reduce Array to String.
        String[] array = {"Mohan", "Sohan", "Mahesh"};
        Arrays.stream(array).reduce((x, y) -> x + "," + y)
                .ifPresent(s -> System.out.println("Array to String: " + s));
        //Reduce List to String.
        List<String> list = Arrays.asList("Mohan", "Sohan", "Mahesh");
        list.stream().reduce((x, y) -> x + "," + y)
                .ifPresent(s -> System.out.println("List to String: " + s));
    }
}
