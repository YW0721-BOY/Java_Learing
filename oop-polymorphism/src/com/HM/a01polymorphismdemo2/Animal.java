package com.HM.a01polymorphismdemo2;

public class Animal {
    private String age;
    private String attribute;

    public Animal() {
    }

    public Animal(String age, String attribute) {
        this.age = age;
        this.attribute = attribute;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void eat(String something){
        System.out.println("为了点儿"+something);
    }
}
