package com.HM.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        ArrayList<Student> arrayList=new ArrayList<>();
        boolean flag=true;
        while (flag){
            menu();
            System.out.print("请输入您的选择：");
            int key=sc.nextInt();
            switch (key){
                case 1:
                    Student s =new Student();
                    System.out.println("输入id:");
                    String id= sc.next();
                    s.setId(id);
                    System.out.println("输入姓名：");
                    String name= sc.next();
                    s.setName(name);
                    System.out.println("输入年龄：");
                    int age = sc.nextInt();
                    s.setAge(age);
                    System.out.println("输入地址：");
                    String address =sc.next();
                    s.setAddress(address);

                    Until.add(s,arrayList);
                    break;
                case 2:
                    System.out.println("请输入你要删除学生的id");
                    id=sc.next();
                    Until.delete(id,arrayList);
                    break;
                case 3:
                    s =new Student();
                    System.out.println("输入id:");
                    id= sc.next();
                    s.setId(id);
                    System.out.println("输入姓名：");
                    name= sc.next();
                    s.setName(name);
                    System.out.println("输入年龄：");
                    age = sc.nextInt();
                    s.setAge(age);
                    System.out.println("输入地址：");
                    address =sc.next();
                    s.setAddress(address);

                    Until.update(s,arrayList);
                case 4:
                    Until.print(arrayList);
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("未识别key");
            }
        }


    }

    public static void menu(){
        System.out.println("----------学生管理系统----------");
        System.out.println("1.添加信息");
        System.out.println("2.删除信息");
        System.out.println("3.修改信息");
        System.out.println("4.查询信息");
        System.out.println("5---退出");
    }

}



