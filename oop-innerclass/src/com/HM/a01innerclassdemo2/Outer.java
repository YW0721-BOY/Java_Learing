package com.HM.a01innerclassdemo2;

public class Outer {
    private int a=10;
    class Inter{
        private int a =20;

        public void show(){
            int a=30;
            System.out.println(Outer.this.a);//10
            System.out.println(this.a);//20
            System.out.println(a);//30
        }
    }
}
