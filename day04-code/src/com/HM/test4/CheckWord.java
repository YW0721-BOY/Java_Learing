package com.HM.test4;

public class CheckWord {
    public static void main(String[] args) {
        String str="Hello World";


        int count =0;
        int i;
        for (i=str.length()-1;i>0;i--){
            if(str.charAt(i)==' '){
                break;
            }else count++;
        }

        System.out.println("最后一个单词是："+str.substring(i));
        System.out.println("最后一个单词的长度："+count);

    }


}
