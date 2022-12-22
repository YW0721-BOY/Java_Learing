package com.HM.a01oopextendsdemo1;

public class Manage extends Employee{
    private String achievements;

    public Manage() {
    }

    public Manage(String name, String salary, String address, String achievements) {
        super(name, salary, address);
        this.achievements = achievements;
    }

    public void work(){
        System.out.println(getName()+"管理团队");
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }
}
