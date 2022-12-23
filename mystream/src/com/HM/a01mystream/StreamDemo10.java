package com.HM.a01mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

  /*
         list 有序，可重复
         set  无序,不重复

           collect(Collector collector)   收集流中的数据，放到集合中（List Set Map）
           注意点：
                如果我们要收集到Map集合中，键不能重复，否则会报错
         */

public class StreamDemo10 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-20", "赵敏-女-18", "张三丰-男-100");

        //收集到List集合
        //需求：把所有男性收集起来

        List<String> manList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(manList);

        //收集Set集合当中
        //需求：
        //我要把所有的男生收集起来
        Set<String> manSet = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(manSet);
        //收集Map集合当中
        //需求：我要把所有的男生收集起来,
        //键：姓名、值：年龄

        //张无忌-男-15
        Map<Object, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                /*
                 *   toMap: 参数一表示键的生成规则
                 *          参数二表示值的生成规则
                 *
                 * 参数一：
                 *       Function泛型一：表示流中每一个数据的类型
                 *               泛型二：表示Map集合中键的数据类型
                 *
                 *           方法apply形参：依次表示流里面的每一个数据
                 *                 方法体：生成键的代码
                 *                 返回值：已经生成的键
                 *
                 *
                 * 参数二：
                 *      Function泛型一：表示流中每一个数据的类型
                 *              泛型二：表示Map集合中值的数据类型
                 *
                 *       方法apply形参：依次表示流里面的每一个数据
                 *             方法体：生成值的代码
                 *             返回值：已经生成的值
                 *
                 *
                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

        System.out.println(map);

        //lambada
        Map<String, Integer> map1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));


        System.out.println(map1);
    }
}

/*
      总结：
      1.Stream流的作用
            结合了Lambda表达式，简化集合，数组的操作
      2.Stream的使用步骤
            获取Stream流对象
            使用中间方法处理数据
            使用终结方法处理数据

      3.如何获取Stream流对象
            单列集合：Collection中默认方法stream
            双列集合：不能直接获取
            数组：Arrays工具类型中的静态方法stream
            一堆零散的数据：Stream接口中的静态方法of

      4.常见方法
            中间方法：filte,limit,skip,distinct,concat,map
            终结方法：forEach,count,collect
 */