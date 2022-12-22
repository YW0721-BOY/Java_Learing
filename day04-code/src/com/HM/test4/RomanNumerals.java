package com.HM.test4;

import java.util.Scanner;

/*
*键盘录入一个字符串
* 要求1：长度为小于等于9
* 要求2：只能是数字
* 将内容变成罗马数字
* 下面是阿拉伯数字跟罗马数字的对比关系
* Ⅰ-1、Ⅱ-2、Ⅲ-3、Ⅳ-4、Ⅴ-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9
* 注意点:
* 罗马数字里面是没有0的
* 如果键盘录入的数字包含0、可以变成”“（长度为0的字符串）
 */
public class RomanNumerals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        while (true) {
            System.out.println("录入一个字符串（长度为小于等于9、只能是数字）");
            s = sc.next();
            boolean flag=checkStr(s);
            if (!flag){
                System.out.println("当前字符不符合题目要求！请重新输入!");
                continue;
            }else {
                break;
            }
        }

        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int number = s.charAt(i)-48;
            String sr=changeRoman(number);
            sb.append(sr);
        }

        System.out.println(sb.toString());



    }
    public static boolean checkStr(String str){
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c<'0'||c>'9')
            {
                return false;
            }
        }
        return true;
    }

    public static String changeRoman(int number){
        String[] arr ={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[number];

    }
}
