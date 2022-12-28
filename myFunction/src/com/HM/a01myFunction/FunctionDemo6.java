package com.HM.a01myFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionDemo6 {
    public static void main(String[] args) {
        /*
        方法引用（数组的构造方法）
        目的：创建一个指定类型的数组
        需求：集合中存储一些整数，收集到数组中
         */

        ArrayList<Integer> list =new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8);

        /*
        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
         */
        Integer[] array =list.stream().toArray(Integer[]::new);



        System.out.println(array);
    }
}
