package com.HM.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int week=sc.nextInt();

        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("work hard!");
                break;
            case 6:
            case 7:
                System.out.println("holiday");
        }
    }
}
