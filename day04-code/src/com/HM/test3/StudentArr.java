package com.HM.test3;

import java.util.Scanner;

public class StudentArr {
    public static void main(String[] args) {
        Student[] students=new Student[3];

        Student s1=new Student(100,"Jack",18);
        Student s2=new Student(101,"Tom",20);
        Student s3=new Student(102,"Andy",18);

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        Student s4=new Student(104,"Kim",21);
        boolean flag=judge(students,s4.getId());
        if (!flag){
            Student[] newStuArr=add(students,s4);
            printf(newStuArr);
        }else {
            System.out.println("请修改id,id不能重复");
        }

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入要删除的id：");
        int id=sc.nextInt();
        if (!(delete(students,id))){
            System.out.println("删除失败");
        }
        printf(students);

    }

    public static boolean delete(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null) {
                if (arr[i].getId() == id) {
                    arr[i]=null;
                    return true;
                }
            }
        }
        return false;
    }

    public static void printf(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null) {
                System.out.println(arr[i].getId() + "," +
                        arr[i].getName() + "," +
                        arr[i].getAge());
            }
        }
    }

    public static boolean judge(Student[] students,int id){
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null) {
                if (students[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Student[] add(Student[] arr,Student s){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        if (count==arr.length){
            Student[] newStuArr =new Student[++count];
            for (int i = 0; i < newStuArr.length; i++) {
                if (i<arr.length){
                    newStuArr[i]=arr[i];
                }else
                    newStuArr[i]=s;
            }
            return newStuArr;
        }else {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==null){
                    arr[i]=s;
                    break;
                }
            }
            return arr;
        }
    }
}
