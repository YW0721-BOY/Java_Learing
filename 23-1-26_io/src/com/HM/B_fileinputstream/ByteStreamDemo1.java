package com.HM.B_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    /*
        需求：读取文件中的数据。（暂时不写中文）
    */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("23-1-26_io\\test.txt");

        /*int b1 =fis.read();
        System.out.println(b1);*/

        while (fis.read()!=-1){
            System.out.print((char)fis.read());
        }
        fis.close();
    }
}
