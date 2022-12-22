package com.HM.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        Manage m =new Manage("Tom","10000","121号路","8000");

        StaffPerson sp= new StaffPerson("Jack","8000","1号路");

        m.eat();
        m.work();

        sp.eat();
        sp.work();

    }
}
