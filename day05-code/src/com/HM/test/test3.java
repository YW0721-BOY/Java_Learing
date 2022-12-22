package com.HM.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        ArrayList<User> arrayList =new ArrayList<>();

        arrayList.add(new User(0,"jack","12345"));
        Scanner sc =new Scanner(System.in);
        System.out.println("你要查询的id:");
        int id=sc.nextInt();
        if (getUser(id,arrayList)){
            System.out.println(arrayList.get(id));
        }else {
            System.out.println("没有此用户");
        }
    }

    public static boolean getUser(int id, ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==id){
                return true;
            }
        }
        return false;
    }
}
