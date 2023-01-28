package com.HM.C_mycharset;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {

        FileWriter fw =new FileWriter("23-1-26_io\\test.txt");

        //fw.write(25105);

        fw.write("字符输出流???");


        fw.close();
    }
}
