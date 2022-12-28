package com.HM.a01myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        /*
        *异常作用一：异常是用来查询bug的关键参考信息
        *异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
         */

        //NullPointerException
        Student[] arr = new Student[3];
        String name =arr[0].getName();
        System.out.println(name);

        //ArrayIndexOutOfBoundsException
        Student2 stu =new Student2("张三-23");
        System.out.println(stu);
    }
}
