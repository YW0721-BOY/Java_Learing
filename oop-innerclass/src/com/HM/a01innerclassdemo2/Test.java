package com.HM.a01innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        Outer.Inter oi=new Outer().new Inter();

        oi.show();

    }
}
