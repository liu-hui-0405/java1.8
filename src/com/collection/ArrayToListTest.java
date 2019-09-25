package com.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName ArrayToListTest
 * @Description
 * @Author lh
 * @Date 2019-07-01 11:44
 **/
public class ArrayToListTest {
    public static void main(String[] args) {

        String[] arrays = new String[]{"a", "b", "c"};
        List<String> listStrings = Stream.of(arrays).collect(Collectors.toList());
        // List<String> listStrings = Arrays.asList(arrays);
        // List<String> listStrings = new ArrayList<>(Arrays.asList(arrays));//可以add
        System.out.println("array->list:" + listStrings);
        // String[] toArray = listStrings.stream().toArray(String[]::new);
        String[] toArray = listStrings.toArray(new String[listStrings.size()]);
        System.out.print("list->array:");
        for (String s : toArray) {
            System.out.print(s + " ");
        }
    }
}
