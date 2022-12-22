package com.HM.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();

        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("输入姓名：");
            String name =sc.next();
            s.setName(name);

            System.out.println("输入年龄：");
            int age =sc.nextInt();
            s.setAge(age);

            list.add(s);
        }


        System.out.println(list);
    }
}
