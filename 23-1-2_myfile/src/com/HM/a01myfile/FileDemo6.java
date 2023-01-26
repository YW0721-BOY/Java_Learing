package com.HM.a01myfile;

import java.io.File;

/*
    public File[] listFiles()      获取当前该路径下所有内容
    不存在返回null
    文件返回null
    空文件，返回长度为0的数组
    有内容的文件夹，将所有路径放在File数组返回
    有隐藏文件的文件夹，同样全部都返回

 */

public class FileDemo6 {
    public static void main(String[] args) {
        // public File[] listFiles()      获取当前该路径下所有内容


        File f1 = new File("F:\\JavaLearningRoad");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
