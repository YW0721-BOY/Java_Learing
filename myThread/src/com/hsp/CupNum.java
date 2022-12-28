package com.hsp;

public class CupNum {
    public static void main(String[] args) {

        Runtime runtime =Runtime.getRuntime();
        int cupNum = runtime.availableProcessors();
        System.out.println(cupNum);//cpu个数
    }
}
