package com.HM.assigningopreator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println(a+=b);
        System.out.println(b);

        //细节：
        //+=，-=，*=，/=，%=底层都隐藏了一个强制类型转换
        short s =1;
        s+=1;
        System.out.println(s);
    }
}
