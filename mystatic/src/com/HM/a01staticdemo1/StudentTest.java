package com.HM.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName="张三老师";
        Student s1 =new Student();
        s1.setAge(19);
        s1.setName("silk");
        s1.setGender("男");

        s1.study();
        s1.show();


        Student s2 =new Student();
        s2.setAge(20);
        s2.setName("baby");
        s2.setGender("女");

        s2.study();
        s2.show();


    }
}
