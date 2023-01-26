package com.HM.test;

import java.io.File;

/*
    需求：
        定义一个方法找某一个文件夹中，是否有以avi结尾的电影
        (暂时不考虑子文件夹)
 */
public class Test02 {
    public static void main(String[] args) {
      File file = new File("F:\\JavaLearningRoad\\Java_Learning\\23-1-2_myfile\\src\\com\\HM\\test");
      haveAVI(file);

    }

    /*
    *作用：用来查找某一个文件夹中，是否有avi结尾的电影
    *形参：要查找的文件夹
    *返回值：查找的结果  存在true 不存在false
     */

    public static boolean haveAVI(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".avi")) {
                return true;
            }
        }
        return false;
    }
}
