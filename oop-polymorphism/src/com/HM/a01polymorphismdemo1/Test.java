package com.HM.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Person ap=new Administrator("tim",35);
        Person tp=new Teacher("tony",29);
        Person sp=new Student("lisa",18);

        register(ap);
        register(tp);
        register(sp);

    }

    public static void register(Person p){
        p.show();
    }
}
