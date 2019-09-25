package com.filter;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FilterAndCollect
 * @Description
 * @Author lh
 * @Date 2019-07-15 16:25
 **/
public class FilterAndCollect {
    public static void main(String[] args) {
        List<User> list = User.getUsers();
        long count = list.stream().filter(u -> u.getName().endsWith("sh")) //20 30 10
                .collect(Collectors.counting());
        System.out.println("Number of users ending name with 'sh': "+ count);

        Double aveResult = list.stream().filter(u -> u.getName().endsWith("sh"))
                .collect(Collectors.averagingInt(User::getAge));
        System.out.println("Average:" + aveResult);

        // Collectors.summarizingInt 汇总所有信息包括数量、求和、平均值、最小值、最大值；
        IntSummaryStatistics sta = list.stream().filter(u -> u.getName().endsWith("sh"))
                .collect(Collectors.summarizingInt(User::getAge));
        System.out.println(sta);
    }
}
