package com.HM.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"风流倜傥","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces = {"美奂绝伦","沉鱼落雁","亭亭玉立","身材姣好","相貌平平","相貌简陋","惨不忍睹"};

    public Role() {
    }

    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender=gender;

        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r =new Random();
        if (gender=='男'){
            int index=r.nextInt(boyfaces.length);
            this.face=boyfaces[index];
        }else if (gender=='女'){
            int index= r.nextInt(girlfaces.length);
            this.face=girlfaces[index];
        }else {
            this.face="面向狰狞";
        }
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attach(Role role) {

        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);


        System.out.println(this.face+"的"+this.getName() + "攻击" + role.getName() + "造成了" + hurt + "点伤害,剩余血量：" + remainBlood + "点");
    }

    public void showRoleInfo(){
        System.out.println("姓名为："+getName());
        System.out.println("血量为："+getBlood());
        System.out.println("性别为："+getGender());
        System.out.println("颜值为："+getFace());
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }
}
