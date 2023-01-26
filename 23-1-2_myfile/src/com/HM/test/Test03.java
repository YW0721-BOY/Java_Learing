package com.HM.test;

import java.io.File;

/*
    需求：
        找到电脑当中所有以avi结尾的电影
        (考虑子文件夹)



    技巧：
        1.进入文件夹
        2.遍历数组
        3.判断
        4.判断
 */
public class Test03 {
    public static void main(String[] args) {
        findAVI();
    }


    public static void findAVI(){
        File[] files = File.listRoots();
        for (File file : files) {
            findAVI(file);
        }
    }

    public static void findAVI(File src) {

        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    if (name.endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else {
                    findAVI(file);
                }
            }
        }
    }
}
