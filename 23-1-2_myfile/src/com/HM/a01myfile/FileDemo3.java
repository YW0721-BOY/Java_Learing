package com.HM.a01myfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
  length()只能获取文件大小，无法获取文件夹大小
 */

public class FileDemo3 {
    /*
        public long length()             返回文件大小
        public String getAbsolutePath()  返回文件的绝对路径
        public String getPath()          返回定义文件时使用的路径
        public String getName()          返回文件的名称，带后缀

        public long lastModified()       返回最后一次修改文件的时间（时间毫秒值）
     */

    public static void main(String[] args) {
        File f1=new File("F:\\JavaLearningRoad\\test.txt");
        System.out.println("文件大小（字节数量）："+f1.length());
        System.out.println("文件的绝对路径："+f1.getAbsolutePath());
        System.out.println("定义文件时使用的路径："+f1.getPath());
        System.out.println("文件的名称，带后缀:"+f1.getName());



        System.out.println("最后一次修改文件的时间（时间毫秒值）:"+f1.lastModified());

        //如何把时间的毫秒值变成字符串表示的时间？
        System.out.println("--------------------");

        Date date =new Date(f1.lastModified());
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sd.format(date));
    }
}
