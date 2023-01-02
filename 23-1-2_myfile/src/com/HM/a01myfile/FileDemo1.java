package com.HM.a01myfile;

import java.io.File;
/*
1.File是啥？
    ·File-文件，在java中File对象用来表示路径，可以是具体文件，也可以是文件夹。
    ·可以存在，也可以不用存在。
2.绝对路径和相对路径区别？
    ·绝对路径带盘符。  例如：F:\\JavaLearningRoad\\test.txt。
    ·相对路径不带盘符，默认在当前项目下去找。 例如JavaLearningRoad\\test.txt。
    ·当别人使用你的项目时，如果是绝对路径，别人就无法访问，因为不能保证他下载这个项目的路径跟你的完全一样，
    ·相对路径就没有这种烦恼，直接在项目下去寻找你这个文件。
3.File的构造方法的作用？
    ·根据文件路径创键文件对象
    ·根据父路径字符串和子路径名字符串创建文件对象
    ·根据父路径对应文件对象和子路径名字符串创建对象
 */

public class FileDemo1 {
    public static void main(String[] args) {
        /*
        *public File(String pathname)               根据文件路径创键文件对象
        *public File(String parent, String child)   根据父路径字符串和子路径名字符串创建文件对象
        *public File(File parent,String child)      根据父路径对应文件对象和子路径名字符串创建对象
         */


        //1.根据文件路径创键文件对象
        String str="F:\\JavaLearningRoad\\test.txt";
        File f1 =new File(str);
        System.out.println(f1);

        //2.父级路径:F:\\JavaLearningRoad\\test.txt
        //子级路径：test.txt
        String parent="F:\\JavaLearningRoad";
        String child="test.txt";
        File f2 =new File(parent,child);
        System.out.println(f2);

        //3.把一个File表示的路径和String表示路径进行拼接
        File parent2= new File("F:\\JavaLearningRoad");
        String child2="test.txt";

        File f4 =new File(parent2,child2);
        System.out.println(f4);

    }
}
