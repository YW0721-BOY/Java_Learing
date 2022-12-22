package com.test;

public class Test1 {
    public static void main(String[] args) {
        int i=0;
//        System.out.println((i++));
//        System.out.println(++i);
        int j = (i++) - (++i);
        System.out.println(j);
        if (j!=0){
            ++i;
            System.out.println(i++);
        }
        int a;
        for (a = 0; a < 3; a++) {
            //System.out.print(a+" ");
        }
        System.out.print(a+" ");
        System.out.println();
        int b;
        for (b = 0; b < 3; ++b) {
            //System.out.print(b+" ");
        }
        System.out.println(b);
    }
    Integer a=-1;
//    if(){
//
//    }
}
