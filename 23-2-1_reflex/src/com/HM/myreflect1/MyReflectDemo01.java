package com.HM.myreflect1;

public class MyReflectDemo01 {
    /*
     * 获取Class对象的三种方式
     * 1. Class.forName("全类名");
     * 2. 类名.class
     * 3. 对象.getClass();
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = Class.forName("com.HM.myreflect1.Student");

        System.out.println(clazz1);

        Class<Student> clazz2 = Student.class;
        System.out.println(clazz2);

        Student s = new Student();
        System.out.println(s.getClass());


    }
}
