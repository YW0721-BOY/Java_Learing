package com.HM.a02test;

import java.util.ArrayList;
import java.util.Collections;

public class Test03 {
    /*
     *创建集合添加学生对象,学生对象属性：name,age
     *把姓名和年龄拼接成：张三-23的字符串，并放到数组中
     */
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        Collections.addAll(list,new Student("TOM",13),new Student("jack",20));

        String[] strings = list.stream().map(Student::toString).toArray(String[]::new);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

}
