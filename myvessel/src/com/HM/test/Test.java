package com.HM.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

    }


//    public static void keepPet(ArrayList<?extends Cat> list){
//
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).eat();
//        }
//    }

//    public static void keepPet(ArrayList<? extends Dog> list){
//
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).eat();
//        }
//    }

    public static void keepPet(ArrayList<? extends Animal> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Dog){
                ((Dog) list.get(i)).eat();
            }else if (list.get(i) instanceof Cat){
                ((Cat) list.get(i)).eat();
            }
        }
    }
}
