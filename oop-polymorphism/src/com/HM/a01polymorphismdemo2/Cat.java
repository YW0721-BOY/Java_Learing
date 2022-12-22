package com.HM.a01polymorphismdemo2;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String age, String attribute) {
        super(age, attribute);
    }

    @Override
    public void eat (String something){
        System.out.println(getAge()+"岁的"+getAttribute()+"的眯着眼睛侧着头吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
