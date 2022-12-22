package com.HM.comprehensive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AutomaticRollCall2 {
    /*
    班级里有N个学生
    要求：
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开始第二轮点名
     */
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, "孙悟空", "唐僧", "猪八戒", "沙僧",
                "如来佛祖", "观音菩萨", "唐太宗", "玉皇大帝",
                "王后", "丫鬟", "王母娘娘", "阎王",
                "哪吒", "木吒", "托塔天王", "七仙女", "小白龙");

        ArrayList<String> arrayList2 =new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("=========第"+(i+1)+"轮循环============");
            int count = arrayList.size();
            for (int j = 0; j < count; j++) {
                int index = r.nextInt(arrayList.size());
                String name = arrayList.remove(index);
                arrayList2.add(name);
                System.out.println(name);
            }
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }

    }
}
