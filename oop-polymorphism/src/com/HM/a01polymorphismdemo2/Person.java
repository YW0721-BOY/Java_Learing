package com.HM.a01polymorphismdemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something){
        if(a instanceof Dog){
            Dog b =(Dog) a;
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+b.getAttribute()+b.getAge()+"岁的狗狗");
            b.eat("骨头");
            b.lookHome();
        }else if(a instanceof Cat){
            Cat d =(Cat) a;
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getAttribute()+d.getAge()+"岁的猫咪");
            d.eat("鱼");
            d.catchMouse();
        }
    }
}
