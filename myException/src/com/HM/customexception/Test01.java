package com.HM.customexception;

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
            } catch (NumberFormatException e){
                e.printStackTrace();
            }catch (NameFormatException e){
                e.printStackTrace();
            }catch (AgeOutBoundsException e){
                e.printStackTrace();
            }
        }
        System.out.println(girlFriend);

    }
}
