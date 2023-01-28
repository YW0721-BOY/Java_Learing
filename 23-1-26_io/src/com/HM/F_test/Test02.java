package com.HM.F_test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test02 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        *   创建反序列化流的对象
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("23-1-26_io\\test.txt"));

        List<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student.toString());
        }
        ois.close();
    }
}
