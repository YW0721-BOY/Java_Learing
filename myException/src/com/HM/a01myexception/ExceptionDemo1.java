package com.HM.a01myexception;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
* 编译时异常（在编译阶段，必须要手动处理，否则代码报错）
* 运行时异常（在编译阶段是不需要处理的，是代码运行时出现的异常）
 */

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //编译时异常(提醒程序员检查本地信息)
        /*
        String time ="2019年1月1日";
        SimpleDateFormat sdf =new SimpleDateFormat("YYYY年MM月DD日");
        Date date = sdf.parse(time);
        System.out.println(date);
         */

        //运行时异常（代码出错而导致程序出现问题）
        int[] arr ={1,2,3,4,5};
        System.out.println(arr[10]);
    }
}
