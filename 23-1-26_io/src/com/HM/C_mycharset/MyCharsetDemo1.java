package com.HM.C_mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class MyCharsetDemo1 {
    /*
    *Java 中编码的方法
    *       public byte[] getBytes()                        使用默认方式进行编码
    *       public byte[] getBytes(String charsetName)      使用指定方式进行编码
    *
    *Java 中解码的方式
    *       String(bytes[] bytes)                           使用默认方式进行编码
            String(bytes[] bytes,String charsetName)        使用指定方式进行编码
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str ="ai你哟";
        byte[] bytes1=str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] gbks = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));

        String s = new String(bytes1);
        System.out.println(s);

        String strs = new String(bytes1,"GBK");
        System.out.println(strs);


    }


}
