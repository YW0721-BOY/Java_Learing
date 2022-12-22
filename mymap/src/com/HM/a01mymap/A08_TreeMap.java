package com.HM.a01mymap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A08_TreeMap {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap =new TreeMap<>();

        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",21);
        Student s3=new Student("wangwu",21);

        treeMap.put(s1,"江苏");
        treeMap.put(s2,"四川");
        treeMap.put(s3,"广东");

        //System.out.println(treeMap);

        Set<Map.Entry<Student, String>> entries = treeMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+">>>"+entry.getValue());
        }
    }
}
