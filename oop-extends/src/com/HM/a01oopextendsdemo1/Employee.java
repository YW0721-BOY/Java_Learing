package com.HM.a01oopextendsdemo1;

public class Employee {
    private String name;
    private String salary;
    private String address;

    public Employee() {
    }

    public Employee(String name, String salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void eat(){
        System.out.println(name+"吃饭");
    }
    public void work(){
        System.out.println("工作");
    }
}
