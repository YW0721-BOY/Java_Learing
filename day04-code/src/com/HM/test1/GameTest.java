package com.HM.test1;

public class GameTest {
    public static void main(String[] args) {
        Role r1=new Role("乔峰",100,'男');

        Role r2=new Role("小龙女",100,'女');

        while (true){
            r1.attach(r2);

            if (r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O了"+r2.getName());
                break;
            }

            r2.attach(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+"K.O了"+r1.getName());
                break;
            }
        }
    }
}
