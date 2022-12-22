package com.HM.stringdemo;

import java.util.Scanner;

/*
 *已知正确的用户名和密码，请用程序实现模拟用户登录。
 * 总共给三次机会，登录之后，给出相应提示。
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String user ="admin";
        String password="123456";
        signIn(user,password);

    }

    public static void signIn(String u, String p) {
        Scanner sc = new Scanner(System.in);
        for (int i=3;i>0;i--) {
            System.out.println("请输入用户名：");
            String user = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if (!(u.equals(user)) || !(p.equals(password))) {
                System.out.println("用户名或密码错误,请重新输入!");
                if (i==1){
                    System.out.println("账户已被锁定");
                }else
                    System.out.println("您还有" + (i-1) + "次机会!");
            } else {
                System.out.println("登录成功");
                break;
            }
        }

    }
}
