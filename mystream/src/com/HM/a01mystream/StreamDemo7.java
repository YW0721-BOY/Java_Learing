package com.HM.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "周芷若", "赵敏","张三丰","张强","张良","张无忌","周芷若");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张三丰","张强","张良");

        list1.stream().distinct().forEach(s -> System.out.println(s));

        Stream.concat(list1.stream(),list2.stream()).distinct().forEach(s -> System.out.println(s));
    }
}
