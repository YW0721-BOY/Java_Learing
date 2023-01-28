package com.HM.B_fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
拷贝的核心思想：边读边写
 */
public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
       /*
        * 练习：文件拷贝
        *      把 F:\JavaLearningRoad\\test.txt 拷贝到当前模块
        * 注意：
        *       选择一个比较小的文件，不要太大
        */

        FileInputStream fis =new FileInputStream("F:\\JavaLearningRoad\\test.txt");
        FileOutputStream fos =new FileOutputStream("23-1-26_io\\test.txt");

        int b;
        while ((b=fis.read())!=-1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
