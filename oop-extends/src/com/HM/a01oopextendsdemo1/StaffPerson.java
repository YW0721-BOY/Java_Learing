package com.HM.a01oopextendsdemo1;

public class StaffPerson extends Employee{

    public StaffPerson() {
    }

    public StaffPerson(String name, String salary, String address) {
        super(name, salary, address);
    }

    public void work(){
        System.out.println(getName()+"干好了自己的工作");
    }

}
