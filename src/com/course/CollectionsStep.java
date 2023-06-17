package com.course;
import com.course.OOP.User;
import java.util.*;

public class CollectionsStep {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        Map<String, String> map = new HashMap<>();
        map.put("key", "value1");
        map.put("keyy", "value2");
        map.put("abc", "value3");
        System.out.println(task4(map));

    }

    public static void task1() {
        Set<String> elements = new TreeSet<>();
        elements.add("test");
        elements.add("abc elements");
        System.out.println(elements);
    }

    public static void task2() {
        User user = new User("Anna Kuzmiak", "annwrt@gmail.com", "Admin");
        User user2 = new User("Anna Test", "anwrst+88@gmail.com", "Admin");
        User user3 = new User("Anna 3", "ann3@gmail.com", "Customer");
        User user4 = new User("Anna 4", "ann4@gmail.com", "Main Customer");

        HashMap<Integer, User> users = new HashMap<>();
        users.put(user.getId(), user);
        users.put(user2.getId(), user2);
        users.put(user3.getId(), user3);
        users.put(user4.getId(), user4);

        users.forEach(((id, userElement) -> {
            if (id % 2 == 0) userElement.printUserInfo();
        }));
    }

    public static void task3() {
        Set<String> namesSet = new HashSet<>(Arrays.asList("Olya", "Natasha", "Polina", "Vlad"));
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Bohdan", "Oleksandr", "Vlad", "Natasha"));
        namesSet.addAll(namesList);
        System.out.println(namesSet);
    }

    public static Map<String, String> task4(Map<String, String> map) {
        Map<String, String> result = new TreeMap<>();
        map.forEach((k, v) -> {
            if (k.length() == 3) result.put(k, v);
        });
        return result;
    }
}
