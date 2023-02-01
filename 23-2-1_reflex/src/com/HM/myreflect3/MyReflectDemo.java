package com.HM.myreflect3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        /*
         * Class类中用于获取成员变量的方法
         *      Field[] getFields():    返回所有公共成员变量对象的数组
         *      Field[] getDeclaredFields():    返回所有成员变量对象的数组
         *      Field getField():      返回单个公共成员变量对象
         *      Field getDeclaredField():      返回单个成员变量对象
         *
         * Field类中用于创建对象的方法
         *      void set(Object obj,Object value): 赋值
         *      Object get(Object obj)             获取值
         */

        Class<?> clazz = Class.forName("com.HM.myreflect3.Student");

        //Field[] fields = clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field field = clazz.getField("gender");
        System.out.println(field);

        // 获取单个成员变量
        Field declaredField = clazz.getDeclaredField("name");
        System.out.println(declaredField);

        //获取权限修饰符
        int modifiers =declaredField.getModifiers();
        System.out.println(modifiers);

        //获取成员变量的名字
        String name = declaredField.getName();
        System.out.println(name);

        //获取成员变量的类型
        Class<?> type = declaredField.getType();
        System.out.println(type);

        //获取成员变量记录的值
        Student zhangsan = new Student("zhangsan", 19);
        declaredField.setAccessible(true);
        Object value = declaredField.get(zhangsan);
        System.out.println(value);

        //修改对象里面记录的值


        declaredField.set(zhangsan,"lisi");

        System.out.println(zhangsan);


    }
}
