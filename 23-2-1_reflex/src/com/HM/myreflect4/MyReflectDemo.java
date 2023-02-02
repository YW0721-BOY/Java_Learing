package com.HM.myreflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*
         * Class类中用于获取成员方法的方法
         *      Method[] getMethods():
         *      Method[] getDeclaredMethods():
         *      Method getMethod(String name,Class<?>…… )
         *
         * Method类中用于创建对象的方法
         *      Object invoke(Object obj,Object…… args):运行方法
         *      参数1：用obj对象调用方法
         *      参数2：调用方法的传递的参数（如果没有就不写）
         *      返回值：方法的返回值（如果没有就不写）
         *
         *  获取指定的单一方法
         *  获取方法的修饰符
         *  获取方法的名字
         *  获取方法的形参
         *  获取方法抛出的异常
         *  获取方法的返回值
         */

        //1.获取class字节码文件对象
        Class<?> clazz = Class.forName("com.HM.myreflect4.Student");

        //包含父类中所有公共方法
       /* Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/
        //不能获取父类里面的，但是本类的所有的方法都可以，包括private修饰的
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        //获取指定的单一方法
        Method m =clazz.getDeclaredMethod("eat",String.class);

        //获取方法的修饰符

        //获取方法的名字

        //获取方法的形参


        //方法运行
        Parameter[] parameters=m.getParameters();
        Student s =new Student();

        m.setAccessible(true);
        m.invoke(s,"汉堡");
        //参数1s：表示方法的调用者
        //参数2"汉堡包"：表示在调用方法的时候传递的实际参数




    }
}
