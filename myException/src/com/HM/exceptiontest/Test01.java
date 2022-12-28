package com.HM.exceptiontest;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GirlFriend girlFriend = new GirlFriend();


        while (true) {
            try {
                System.out.println("输入姓名：");
                String name =scanner.nextLine();
                girlFriend.setName(name);
                System.out.println("输入年龄：");
                int age=Integer.parseInt(scanner.nextLine());
                girlFriend.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误，请输入数字：");
            } catch (RuntimeException e){
                System.out.println("姓名的长度或者年龄范围有误");
            }
        }


    }
}
