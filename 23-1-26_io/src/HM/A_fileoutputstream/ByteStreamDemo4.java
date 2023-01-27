package HM.A_fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
        换行写：
            再写一个换行符就可以了
            windows:   \r\n
            linux:   \n
            mac:     \r

        续写：
            如果想要续写，打开续写开关即可
            开关位置：创建对象的第二个参数
            默认false：表示关闭续写，此时创建对象会清空文件
            手动传递true：表示打开续写，此时创建对象不会清空文件
         */

        FileOutputStream fos = new FileOutputStream("23-1-26_io\\a.txt",true);

        //写 hello world
        String str ="hello world";
        byte[] arr = str.getBytes();
        fos.write(arr);

        String wrap="\r\n";
        fos.write(wrap.getBytes());

        String str2 ="666";
        fos.write(str2.getBytes());

        fos.close();
    }
}




