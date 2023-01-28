package com.HM.F_test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test01 {
    public static void main(String[] args) throws IOException {
        /*
            需求：
                需多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
         */

        //1.序列化多个对象
        Student s1 =new Student("zhangsan",18,"南京");
        Student s2 =new Student("wangwu",20,"北京");
        Student s3 =new Student("lisi",22,"重庆");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("23-1-26_io\\test.txt"));

        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();


    }

}
