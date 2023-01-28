package com.HM.C_mycharset;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyCharsetDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("23-1-26_io\\test.txt");

        fileReader.read();


        int ch;
        while ((ch=fileReader.read())!=-1){
            System.out.print((char)ch);
        }
        fileReader.close();
    }
}
