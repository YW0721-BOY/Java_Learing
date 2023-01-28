package com.HM.D_convertstreamdemo;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        *   利用转换流按照指定字符编码读取(JDK11时被淘汰了)
        *
        *   FileReader
        *
         */

       /* InputStreamReader isr = new InputStreamReader(new FileInputStream("23-1-26_io\\test.txt"));

        int ch;
        while ((ch=isr.read())!=-1){
            System.out.print((char) ch);
        }
        isr.close();*/

        /*FileReader fr =new FileReader("23-1-26_io\\test.txt", Charset.forName("GBK"));
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char) ch);
        }
        fr.close();
        jdk11是这个方法*/

    }
}
