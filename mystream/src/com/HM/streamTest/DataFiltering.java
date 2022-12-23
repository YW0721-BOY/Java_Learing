package com.HM.streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
  定义一个集合，并添加一些整数1，2，3，4，5，6，7，8，9，10
  过滤奇数，只留下偶数
  并将结果保存起来
 */
public class DataFiltering {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        List<Integer> integerList = list.stream()
                .filter(s-> s % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(integerList);
    }
}
