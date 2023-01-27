package HM.B_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    public int read(byte[] buffer)     一次读一个字节数组数据
 */
public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("23-1-26_io\\test.txt");

        byte[] bytes = new byte[2];
        //一次读取多个字节数据，具体读了多少，跟数组的长度有关
        //返回值，本次读取到了多少个字节数据
        int len = fis.read(bytes);
        System.out.println(len);

        String str=new String(bytes,0,len);
        System.out.println(str);



        fis.close();
    }
}
