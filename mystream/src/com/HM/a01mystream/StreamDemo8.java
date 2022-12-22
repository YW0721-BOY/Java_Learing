package com.HM.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌-15", "周芷若-14", "赵敏-13", "张三丰-20", "张强-12", "张良-15", "张无忌-12", "周芷若-20");

        list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return null;
            }
        }).forEach(s -> System.out.println(s));

        list1.stream().map((String s) -> {
                    String[] arr = s.split("-");
                    String ageString = arr[1];
                    int age = Integer.parseInt(ageString);
                    return age;
                }
        ).forEach(s -> System.out.println(s));
    }
}
