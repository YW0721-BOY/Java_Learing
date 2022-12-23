package com.HM.a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {
        /*
            void forEach(Consumer action)  遍历
            long count()                   统计
            toArray()                      收集流中的数据，放到数组中
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张三丰");

        //void forEach(Consumer action) 遍历

        //Consumer的泛型：表示流中数据的类型
        //accept方法的形参s:依次表示流里面的每一个数据
        /*
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
         */

        list.stream().forEach(s-> System.out.println(s));

        list.stream().count();    //统计
        System.out.println(list.stream().count());

        //toArray()                  收集流中的数据，放到数组中
        Object[] arr =list.stream().toArray();
        System.out.println(Arrays.toString(arr));

        /*
        IntFunction的泛型：具体类型的数组
        apply的形参：流中数据的个数，要跟数组的长度保持一致
        apply的返回值：具体类型的数组
         */


        //toArray方法的参数的作用：负责创建一个指定类型的数组
        //toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组
        /*
        String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
         */
        String[] toArray = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(toArray));
    }
}
