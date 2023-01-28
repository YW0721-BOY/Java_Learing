package com.HM.C_mycharset;

import java.io.FileReader;
import java.io.IOException;

public class MyCharsetDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("23-1-26_io\\test.txt");

        char[] chars = new char[2];


        int ch;
        while ((ch=fileReader.read(chars))!=-1){
            System.out.print(new String(chars,0,ch));
        }
        fileReader.close();
    }
}
