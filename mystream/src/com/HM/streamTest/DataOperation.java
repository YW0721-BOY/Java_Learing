package com.HM.streamTest;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* 创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
* "zhangsan,23"
* "lisi,24"
* "wangwu,25"
* 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
 */
public class DataOperation {

    public static void main(String[] args) {
        ArrayList<String> arrayLists =new ArrayList<>();
        arrayLists.add("zhangsan,23");
        arrayLists.add("lisi,24");
        arrayLists.add("wangwu,25");

        Map<String, Integer> map = arrayLists.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(map);
    }
}
