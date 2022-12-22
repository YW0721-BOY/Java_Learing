package com.HM.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        /*
           单列集合         default Stream<E> stream()
           双列集合         无
           数组           public static <T> Stream<T[] array>
           一堆零散数据     public static <T> Stream<T> of(T... values)
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
//        Stream<String> stream = list.stream();

//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        list.stream().forEach(s -> System.out.println(s));
    }
}
