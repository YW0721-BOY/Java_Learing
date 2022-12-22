package com.HM.a01polymorphismdemo2;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String age, String attribute) {
        super(age, attribute);
    }

    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getAttribute()+"的狗两只腿死死地抱着"+something+"吃");

    }
    public void lookHome(){
        System.out.println("狗狗看家");
    }

}
