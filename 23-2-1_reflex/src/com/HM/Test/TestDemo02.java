package com.HM.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
         * 跟配置文件结合动态创建
         * 反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
         */

        //1.读取配置文件的信息
        Properties prop=new Properties();
        FileInputStream fis = new FileInputStream("23-2-1_reflex\\prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        //2.获取全类名
        String className = (String) prop.get("classname");
        String methodName = (String) prop.get("method");

        System.out.println(className);
        System.out.println(methodName);

        //利用反射创建对象并运行构造方法
        Class<?> clazz = Class.forName(className);

        //获取构造方法
        Constructor<?> con = clazz.getDeclaredConstructor(String.class,int.class);
        con.setAccessible(true);
        Object o = con.newInstance("XI",20);
        System.out.println(o);

        //获取成员方法
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        Object invoke = method.invoke(o);//？为啥这儿是null
        System.out.println(invoke);


    }
}

class Student01{
    private String name;
    private int age;


    public Student01() {
    }

    public Student01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study(){
        System.out.println("学生正在学习！");
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

    public String toString() {
        return "Student01{name = " + name + ", age = " + age + "}";
    }
}

class Teacher01 {
    private String name;
    private int salary;

    public Teacher01() {
    }

    public Teacher01(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public  void teach(){
        System.out.println("老师正在教书");
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
        return "Teacher01{name = " + name + ", salary = " + salary + "}";
    }
}


