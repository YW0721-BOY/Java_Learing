package com.HM.B_fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
拷贝的核心思想：边读边写
 */
public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
       /*
        * 练习：文件拷贝
        *      把 F:\JavaLearningRoad\\test.txt 拷贝到当前模块下
        */

        FileInputStream fis = new FileInputStream("F:\\JavaLearningRoad\\test.txt");
        FileOutputStream fos =new FileOutputStream("23-1-26_io\\test.txt");

        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
            System.out.println(len);
        }
        fis.close();
        fos.close();
    }
}
