package com.HM.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1.创建Map集合的对象
        Map<String,String> map =new HashMap<>();

        map.put("尹志平","小龙女");
        map.put("郭靖","穆念慈");
        map.put("欧阳克","黄蓉");


        //通过键找值
        //获取所有的键，把这些键放到一个单列集合
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //System.out.print(key+" ");
            String value = map.get(key);
            System.out.println("增强for遍历:"+key+"->"+value);
        }
        System.out.println("-----------------");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key =iterator.next();
            System.out.println("迭代器遍历:"+key+"->"+map.get(key));
        }

        System.out.println("-----------------");

        keys.forEach((s)-> System.out.println("Lambda遍历:"+s+"->"+map.get(s)));
    }
}
