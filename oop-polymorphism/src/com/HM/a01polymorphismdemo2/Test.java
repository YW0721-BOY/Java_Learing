package com.HM.a01polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        Animal a =new Dog("2","黑颜色的");
        Animal b =new Cat("3","灰颜色的");

        Person lw=new Person("老王",30);
        Person ll=new Person("老李",25);

        lw.keepPet(a,"骨头");
        ll.keepPet(b,"鱼");
    }
}
