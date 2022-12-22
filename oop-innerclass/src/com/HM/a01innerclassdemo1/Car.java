package com.HM.a01innerclassdemo1;

public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public void show(Car this){
        System.out.println(carName);
        Engine e =new Engine();
    }
    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }


}
