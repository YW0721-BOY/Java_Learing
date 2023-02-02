package com.HM.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class TestDemo01 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        /*
         * 保存信息：
         * 对于任意一个对象，都可以把对象所有的字段名和值，保存到文件当中
         */

        Student s = new Student("小A", 23, "女", 165.9, "吃饭");
        Teacher t = new Teacher("波妞",30000);

        saveObject(s);
        saveObject(t);


    }

    //把对象里面所有的成员变量名和值保存至本地文件
    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        Class objClass = obj.getClass();
        BufferedWriter bw = new BufferedWriter(new FileWriter("23-2-1_reflex\\src\\com\\HM\\Test\\a.txt",true));


        //获取全部成员变量
        Field[] fields = objClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);

            bw.write(name+"="+value);
            bw.newLine();
        }

        bw.close();
    }
}


class Student{
    private String name;
    private int age;
    private String gender;
    private double height;
    private String hobby;


    public Student() {
    }

    public Student(String name, int age, String gender, double height, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.hobby = hobby;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", height = " + height + ", hobby = " + hobby + "}";
    }
}

class Teacher{
    private String name;
    private int salary;


    public Teacher() {
    }

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Teacher{name = " + name + ", salary = " + salary + "}";
    }
}