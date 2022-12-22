package com.HM.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周芷若", "赵敏","张三丰");

        list.stream()
                .filter(s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));


        System.out.println("======================");
        list.stream()
                .limit(2)
                .forEach(s -> System.out.println(s));

        System.out.println("======================");
        list.stream()
                .skip(2)
                .forEach(s -> System.out.println(s));

        System.out.println("=====================");
        list.stream().skip(1)
                .limit(3)
                .forEach(s -> System.out.println(s));




    }
}
