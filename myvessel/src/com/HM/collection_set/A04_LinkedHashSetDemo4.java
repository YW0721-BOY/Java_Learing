package com.HM.collection_set;

import java.util.LinkedHashSet;
//有序、不重复、无索引
public class A04_LinkedHashSetDemo4 {
    public static void main(String[] args) {
        Student s1 =new Student("张三",23);
        Student s2 =new Student("李四",24);
        Student s3 =new Student("王五",25);
        Student s4 =new Student("张三",23);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);

        System.out.println(lhs);
    }
}
