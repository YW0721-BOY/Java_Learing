package com.HM.A_fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    /*
     * 字节输出流的细节：
     *            1.创建字节输出流对象
     *                  细节一：参数是字符串表示的路径或者是File对象都是可以的
     *                  细节二：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
     *                  细节三：如果文件已经存在，则会清空文件
     *            2.写数据
     *                  细节一：write方法的参数是整数，实际上写到文件的是整数在ASCII上对应的字符
     *            3.释放资源
     *                  每次使用完都要释放资源
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("23-1-26_io\\test.txt");
        fos.write(97);
        fos.close();
    }
}




