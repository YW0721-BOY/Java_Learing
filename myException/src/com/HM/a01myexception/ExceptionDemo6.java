package com.HM.a01myexception;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        /*
                public String getMessage()    返回此throwable的详细消息字符串

                public String toString()      返回此可抛出的简短描述

                public void printStackTrace() 在底层是利用System.err.printIn进行输出
                                              把异常的错误信息以红色字体输出在控制台
                                              仅仅只是打印信息，不会停止程序运行
         */
        int[] arr={1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);
            String string = e.toString();
            System.out.println(string);

        }


        System.out.println("看看我执行了么？");
    }
}
