package com.HM.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        //1.创建Map集合的对象
        Map<String,String> map =new HashMap<>();

        map.put("银河之力","盖小伦");
        map.put("吊车尾","鸣人");
        map.put("银河以北,吾彦最美","天使彦");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey()+">>>"+entry.getValue());
        }

        System.out.println("--------------------");
        Iterator iterator =entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");

        entrySet.forEach((entry)->
                System.out.println(entry.getKey()+"--->"+entry.getValue()));

    }
}
