package com.HM.a01myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        /*
            public boolean createNewFile()     创建一个新的空的文件夹
            public boolean mkdir()             创建单级文件夹
            public boolean mkdirs()            创建多级文件夹
            public boolean delete()            删除文件、空文件夹
         */

        File f1 = new File("F:\\JavaLearningRoad\\Java_Learning\\23-1-2_myfile\\src\\com\\com.HM.note.HM\\test\\a.txt");
        //1.当前路径没有就创建成功 true   有文件就false
        //2.父级路径不存在，方法会有异常
        //3.createNewFile()创建的一定是文件，如果路径中不包含后缀就创建一个没有后缀的文件
        boolean b = f1.createNewFile();
        System.out.println(b);


        File f2 =new File("F:\\JavaLearningRoad\\Java_Learning\\23-1-2_myfile\\src\\com\\com.HM.note.HM\\test\\aaa");
        //1.windows中路径唯一
        //2.只能创建单级文件夹
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);

        //mkdirs底层有mkdir


    }
}
