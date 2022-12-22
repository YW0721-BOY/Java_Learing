package com.HM.comprehensive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AutomaticRollCall {
    /*
        班级里有N个学生
        要求：
            70%的概率随机到男生
            30%的概率随机到女生

            "孙悟空","唐僧","猪八戒","沙僧",
                "如来佛祖","观音菩萨","唐太宗","玉皇大帝",
                "王后", "丫鬟","王母娘娘","阎王",
                "哪吒","木吒", "托塔天王","七仙女","小白龙"
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        Collections.shuffle(list);
        Random r = new Random();

        int index = r.nextInt(list.size());
        int number = list.get(index);

        ArrayList<String> manList = new ArrayList<>();
        Collections.addAll(manList, "孙悟空", "唐僧", "猪八戒", "沙僧",
                "如来佛祖", "唐太宗", "玉皇大帝", "阎王", "木吒", "托塔天王");

        ArrayList<String> womenList = new ArrayList<>();
        Collections.addAll(womenList, "观音菩萨", "王后", "丫鬟", "王母娘娘", "哪吒", "七仙女", "小白龙");

        if (number == 1) {
            Collections.shuffle(manList);
            System.out.println(manList.get(0));
        } else {
            Collections.shuffle(womenList);
            System.out.println(womenList.get(0));
        }


    }


}
