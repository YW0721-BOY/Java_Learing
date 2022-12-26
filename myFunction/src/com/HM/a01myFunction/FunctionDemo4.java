package com.HM.a01myFunction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        /*
        方法引用（引用构造方法）
        格式
                类名::new
        目的：
                创建这个类的对象
        需求：
                集合里面存储姓名和年龄，要求封装成Student对象并收集到List集合中
         */

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张无忌，13","周芷若，15","赵敏，18","张强，20","张三丰，21");

//        List<Student> list1 = list.stream().map(new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//                String[] arr = s.split(",");
//                String name = arr[0];
//                int age = Integer.parseInt(arr[1]);
//                return new Student(name, age);
//            }
//        }).collect(Collectors.toList());
//        System.out.println(list1);

        List<Student> list2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(list2);

    }
}
