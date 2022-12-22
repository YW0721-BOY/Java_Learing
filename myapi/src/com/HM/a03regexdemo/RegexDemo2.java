package com.HM.a03regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        /*需求
            请编写正则表达式验证用户输入的手机号码是否满足要求
            请编写正则表达式验证用户输入的邮箱号码是否满足要求
            请编写正则表达式验证用户输入的电话号码是否满足要求

         验证手机号码  13312345678
         验证座机号码  020-2334332
         验证邮箱号码  3232456@qq.com

         */

        String regex1= "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("13212343341".matches(regex1));
        System.out.println("1311234567".matches(regex1));
        System.out.println("131123456712".matches(regex1));

        System.out.println("------------------------------");

        String regex2 ="0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("020-23242".matches(regex2));
        System.out.println("0202324242".matches(regex2));
        System.out.println("0721324242".matches(regex2));
        System.out.println("0721324242a".matches(regex2));

        System.out.println("------------------------------");

        String regex3 ="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";

        System.out.println("12345@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.com".matches(regex3));
        System.out.println("dlei00090@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));


    }

}
