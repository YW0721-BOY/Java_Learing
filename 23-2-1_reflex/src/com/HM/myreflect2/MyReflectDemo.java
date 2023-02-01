package com.HM.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
         * Class类中用于获取构造方法
         *      Constructor<?>[] getConstructors()                                   public修饰的所有构造方法
         *      Constructor<?>[] getDeclaredConstructors()                           所有的构造方法
         *      Constructor<T>[] getConstructor(Class<?>…… parameterTypes)           需要用public修饰的某个构造方法
         *      Constructor<T>[] getDeclaredConstructor(Class<?>…… parameterTypes)   不需要用public修饰的某个构造方法
         *
         * Constructor类中用于创建对象的方法
         *      T newInstance(Object…… initargs)
         *      setAccessible(boolean flag)
         */

        Class clazz1 = Class.forName("com.HM.myreflect2.Student");
/*
        Constructor[] cons = clazz1.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }*/

        /*Constructor[] dCons = clazz1.getDeclaredConstructors();
        for (Constructor dCon : dCons) {
            System.out.println(dCon);
        }*/

        /*Constructor dCons = clazz1.getDeclaredConstructor(String.class);
        System.out.println(dCons);*/

        Constructor con4 = clazz1.getDeclaredConstructor(String.class, int.class);
        /*int modifiers = con4.getModifiers();
        System.out.println(modifiers);

        Parameter[] parameters = con4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }*/


        //暴力反射：表示临时取消权限校验
        con4.setAccessible(true);
        Student stu =(Student) con4.newInstance("张三", 23);
        System.out.println(stu);


    }
}
