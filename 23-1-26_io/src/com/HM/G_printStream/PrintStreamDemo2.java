package com.HM.G_printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
         *字符打印流
         */
        PrintWriter pw =new PrintWriter(new FileWriter("23-1-26_io\\test.txt"),true);

        pw.println("今天是你的生日~啦啦啦啦");
        pw.print(true);
        pw.println();

        pw.close();
    }
}
