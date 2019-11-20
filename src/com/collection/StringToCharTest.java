package com.collection;

import java.util.Arrays;

/**
 * @ClassName StringToCharTest
 * @Description
 * @Author lh
 * @Date 2019-11-20 11:52
 **/
public class StringToCharTest {

    public static void main(String[] args) {
        // String -> char, char[]
        // 使用 String.charAt( index ) 方法，返回在index位置的char字符。(返回值：char )
        // 使用 String.toCharArray( ) 方法，将String 转化为 字符数组。(返回值：char[] )
        String str = "abc";
        char c = str.charAt(0);
        char [] stringArr = str.toCharArray();

        //char -> String
        String s1 = String.valueOf('c');
        String s2 = Character.toString('c');
        String s3 = "" + 'c';

        //char[] -> String
        char[] ch = {'a', 'b', 'c'};
        String str1 = String.valueOf(ch);
        String str2 = new String(ch);
        String str3 = Arrays.toString(ch);

    }
}
