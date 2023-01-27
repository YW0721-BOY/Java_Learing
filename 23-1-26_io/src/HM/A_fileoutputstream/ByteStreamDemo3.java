package HM.A_fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    /*
    void write(int b)                       一次写一个字节数据
    void write(byte[] b)                    一次写一个字节数组数据
    void write(byte[] b,int off,int len)    一次写一个字节数组的部分数据
    参数一：数组  参数二：起始索引  参数三：个数
     */
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("23-1-26_io\\test.txt");
        byte[] bytes = {97, 98, 99, 100, 101};
        fos.write(97);
        fos.write(bytes);
        fos.write(bytes,3,2);
        fos.close();
    }
}




