package com.HM.D_convertstreamdemo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        *   利用转换流按照指定字符编码写出
        *
         */
       /* OutputStreamWriter gbk = new OutputStreamWriter(new FileOutputStream("23-1-26_io\\test.txt"), "GBK");

        gbk.write("你好你好");

        gbk.close();*/

        /*FileWriter fw = new FileWriter("23-1-26_io\\test.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();
        */

    }
}
