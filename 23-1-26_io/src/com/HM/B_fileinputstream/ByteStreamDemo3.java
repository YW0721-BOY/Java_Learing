package com.HM.B_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
         字节输入流循环读取；
         */

        FileInputStream fis =new FileInputStream("23-1-26_io\\a.txt");

        int b;
        while ((b=fis.read())!=-1){
            System.out.print((char)b);
        }

        fis.close();

    }
}
