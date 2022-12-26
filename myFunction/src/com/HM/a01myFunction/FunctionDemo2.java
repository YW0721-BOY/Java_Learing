package com.HM.a01myFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        /*
        * 方法引用（引用静态方法）
        * 格式
        *       类：：方法名
        * 需求：
        *   集合中有以下数字，要求把他们都变成int类型
        * 1，2，3，4，5
         */
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }
        }).forEach(s-> System.out.println(s));

        list.stream().map(Integer::parseInt)
                .forEach(s-> System.out.println(s));

    }
}
