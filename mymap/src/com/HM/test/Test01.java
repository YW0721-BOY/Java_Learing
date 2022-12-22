package com.HM.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test01 {
    public static void main(String[] args) {
        HashMap<Student,String> hm =new HashMap<>();

        Student s1 =new Student("张三","19","男");
        Student s2 =new Student("李四","20","女");
        Student s3 =new Student("王五","21","男");
        Student s4 =new Student("张三","19","男");

        hm.put(s1,"成都");
        hm.put(s2,"云南");
        hm.put(s3,"北京");
        hm.put(s4,"上海");

        System.out.println(hm);

        System.out.println();

        hm.forEach((key,value)-> {
            System.out.println(key+"--->"+value);
            }
        );

        System.out.println("-------------------");

        Set<Student> keys=hm.keySet();
        for (Student key : keys) {
            System.out.println(key +"》》》"+hm.get(key));
        }

        System.out.println("-------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+">>>>"+entry.getValue());
        }

    }
}
