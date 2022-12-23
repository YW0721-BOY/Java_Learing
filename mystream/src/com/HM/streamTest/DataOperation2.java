package com.HM.streamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* 现在有两个ArrayList集合，
* 第一集合中：存储6名男演员的名字和年龄。第二个集合中：存储6名女演员的名字和年龄。
* 姓名和年龄中间用逗号隔开。比如：张三-23
* 要求完成如下操作：
*               1.男演员只要名字为3个字的前两人
*               2.女演员只要姓杨的，并且不要第一个
*               3.把过滤后的男演员姓名和女演员姓名合并到一起
*               4.将上一步的演员信息封装成Actor对象
*               5.将所有的演员对象都保存到List集合中
* 备注：演员类Actor,属性只有一个：name,age
 */
public class DataOperation2 {
    public static void main(String[] args) {
        ArrayList<String> manList =new ArrayList<>();
        Collections.addAll(manList,"王一博-22","易烊千玺-18","肖战-23","鹿晗-25","吴亦凡-31","黄子韬-32");
        ArrayList<String> womanList =new ArrayList<>();
        Collections.addAll(womanList,"刘诗诗-22","杨颖-18","张子枫-23","杨幂-22","唐嫣-31","李莎旻子-32");

        Stream<String> stream1 = manList.stream()
                        .filter(s -> s.split("-")[0].length() == 3)
                .limit(2);


        Stream<String> stream2 = womanList.stream()
                .filter(s -> s.split("-")[0].startsWith("杨"))
                .skip(1);

//        Stream.concat(stream1,stream2).map(new Function<String, Actor>() {
//            @Override
//            public Actor apply(String s) {
//
//                String name =s.split("-")[0];
//                int age=Integer.parseInt(s.split("-")[1]);
//                return new Actor(name,age);
//            }
//        }).forEach(s -> System.out.println(s));

//        Stream.concat(stream1,stream2)
//                .map(s->new Actor(s.split("-")[0],Integer.parseInt(s.split("-")[1])))
//                .forEach(s -> System.out.println(s));

        Map<String, Integer> map = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split("-")[0], Integer.parseInt(s.split("-")[1])))
                .collect(Collectors.toMap(new Function<Actor, String>() {
                    @Override
                    public String apply(Actor actor) {
                        return actor.getName();
                    }
                }, new Function<Actor, Integer>() {
                    @Override
                    public Integer apply(Actor actor) {
                        return actor.getAge();
                    }
                }));

        System.out.println(map);


    }
}
