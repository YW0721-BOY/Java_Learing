package com.HM.a02test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Test02 {
    /*
    *创建集合添加学生对象,学生对象属性：name,age
    * 只获取姓名并放到数组当中（使用方法引用）
     */
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        Collections.addAll(list,new Student("TOM",13),new Student("jack",20));

        String[] array = list.stream().map(Student::getName).toArray(String[]::new);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
