package com.HM.a01interfacedemo2;

public abstract class Players extends Person{

    public Players() {
    }

    public Players(String name, int age) {
        super(name, age);
    }

    public abstract void learn();
}
