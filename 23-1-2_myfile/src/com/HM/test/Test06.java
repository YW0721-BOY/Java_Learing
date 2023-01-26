package com.HM.test;
/*
需求：统计一个文件夹的总大小
 */

import java.io.File;

public class Test06 {
    public static void main(String[] args) {
        File file = new File("F:\\JavaLearningRoad\\Java_Learning");
        System.out.println(getLen(file));

    }

    public static long getLen(File src){
        long len =0;
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                len+=file.length();
            }else {
                len+=getLen(file);
            }
        }
        return len;
    }
}
