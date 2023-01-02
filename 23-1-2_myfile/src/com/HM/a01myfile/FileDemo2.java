package com.HM.a01myfile;

import java.io.File;

public class FileDemo2 {

    /*
        public boolean isDirectory()    判断此路径是否为文件夹
        public boolean isFile()         判断此路径是否为文件
        public boolean exists()         判断此路径表示的File是否存在
     */


    public static void main(String[] args) {
        File f1=new File("F:\\JavaLearningRoad\\test.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println("--------------------------");

        File f2=new File("F:\\JavaLearningRoad");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        System.out.println("--------------------------");
        File f3=new File("F:\\abc");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());


    }
}
