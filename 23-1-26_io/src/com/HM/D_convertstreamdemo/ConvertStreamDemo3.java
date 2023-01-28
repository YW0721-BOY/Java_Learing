package com.HM.D_convertstreamdemo;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
       /*
            将本地文件中的GBK文件，转成UTF-8
        */

        //1.JDK11以前的方案
        InputStreamReader isr =new InputStreamReader(new FileInputStream("23-1-26_io\\test.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("23-1-26_io\\a.txt"), "UTF-8");

        int ch;
        while((ch= isr.read())!=-1){
           osw.write(ch);
        }
        isr.close();
        osw.close();

       /* FileReader fr =new FileReader("23-1-26\\test.txt", Charset.forName("GBK"));
        FileWriter fw =new FileWriter("23-1-26_io\\test.txt",Charset.forName("UTF-8"));

        int b;
        while ((b=fr.read())!=-1){
            fw.write(b);
        }

        fr.close();
        fw.close();*/
    }
}
