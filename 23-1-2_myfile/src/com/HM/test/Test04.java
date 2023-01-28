package com.HM.test;

import java.io.File;

/*
需求：
    删除一个多级文件夹
 */
public class Test04 {
    public static void main(String[] args) {

        File file = new File("F:\\JavaLearningRoad\\Java_Learning\\23-1-2_myfile\\src\\com\\com.HM.note.HM\\test\\aaa");
        delete(file);

    }


    public static void delete(File src){
        File[] files = src.listFiles();
        if (files!=null){
            for (File file : files) {
                if (file.isFile()){
                    file.delete();
                }else {
                    delete(file);
                }
            }
        }
        src.delete();
    }
}
