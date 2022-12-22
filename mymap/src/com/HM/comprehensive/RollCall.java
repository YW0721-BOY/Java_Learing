package com.HM.comprehensive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RollCall {
    /*
    需求：班级里有N个学生，实现随机点名器
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"范闲","范建","范统","杜子娟","杜其言","阿猫","阿狗");

        Random r =new Random();
        int index = r.nextInt(list.size());

        System.out.println(list.get(index ));

        //Collections.shuffle(list);

    }
}
