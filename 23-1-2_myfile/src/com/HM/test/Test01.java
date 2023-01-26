package com.HM.test;

import java.io.File;
import java.io.IOException;

/*
    需求：在当前模块下的test文件夹中创建一个a.txt
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\JavaLearningRoad\\Java_Learning\\23-1-2_myfile\\src\\com\\HM\\test\\a.txt");
        boolean newFile = file.createNewFile();

        System.out.println(newFile);
    }

}
