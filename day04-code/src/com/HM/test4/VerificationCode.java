package com.HM.test4;
/*
*生成验证码
* 内容：可以是小写字母，也可以是大写字母，还可以是数字
* 规则：
* 长度为5
* 内容中是四位字母，1位数字，
* 其中数字只有1位，但是可以出现再任意的位置
 */

import java.util.Random;

public class VerificationCode {
    public static void main(String[] args) {
        
        char[] arr = new char[52];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (i<26) {
                arr[i] = (char) (97 + i);
            }else {
                arr[i]=(char)(65+index);
                index++;
            }
        }

        Random r =new Random();
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int arrIndex =r.nextInt(arr.length);
            sb.append(arr[arrIndex]);
        }

        int x =r.nextInt(9);
        sb.append(x);

        System.out.println("验证码是"+Disturbance(sb.toString().toCharArray()));


    }

    public static String Disturbance(char[] arr){
        char temp;
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            int index= r.nextInt(arr.length);
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        String result =new String(arr);
        return result;
    }


}
