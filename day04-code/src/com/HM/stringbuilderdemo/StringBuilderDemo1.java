package com.HM.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("StringBuilder的内容是可变的");
        for (int i = 0; i < 10000000; i++) {
            sb.append("abc");
        }

        System.out.println(sb);
    }
}
