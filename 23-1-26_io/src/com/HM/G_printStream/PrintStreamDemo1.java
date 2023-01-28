package com.HM.G_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * 字节打印流
         */
        PrintStream ps = new PrintStream(new FileOutputStream("23-1-26_io\\test.txt"),true);

        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("%s爱上了%s","阿珍","阿强");

        ps.close();
    }
}
