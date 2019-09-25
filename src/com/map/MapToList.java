package com.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName MapToList
 * @Description
 * @Author lh
 * @Date 2019-07-15 15:35
 **/
public class MapToList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(111, "Lalkrishna");
        map.put(154, "Atal");
        map.put(30, "Narendra");
        map.put(200, "Amit");

        List<User> userList = map.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey()))
                .map(m -> new User(m.getKey(), m.getValue())).collect(Collectors.toList());
        userList.forEach(u -> System.out.println("id:" + u.getId() + ", name:" + u.getName()));
    }
}
class User {
    private int id;
    private String name;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}