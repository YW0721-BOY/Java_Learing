package com.HM.E_objectStream;

import java.io.*;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
            需求：
                利用序列化流/对象操作输出流，把一个对象写到本地文件中
            构造方法:
                public ObjectInputStream(InputStream out)        把基本流变成高级流

            成员方法:
                public Object readObject()                       把序列化到本地文件中的对象，读取到程序中来
         */

        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("23-1-26_io\\a.txt"));

        Object o =ois.readObject();

        System.out.println(o.toString());
    }
}
