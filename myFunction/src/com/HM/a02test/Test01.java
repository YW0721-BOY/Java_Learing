package com.HM.a02test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    /*
    *练习1：集合中存储一些字符串的数据，比如：张三，23
    *      收集到Student类型的数组当中
     */

    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"张三，23","李四，24","王五，18","麻二，20");

        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
