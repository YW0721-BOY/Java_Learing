package com.HM.A_fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    /*
    *需求，写出一段文字到本地文件。（暂时不写中文）
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("23-1-26_io\\test.txt");
        fos.write(97);
        fos.close();
    }
}




