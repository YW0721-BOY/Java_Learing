package com.HM.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        /*
        V put(K key,V value)    添加元素
        V remove(Object key)    根据键删除键值对元素
        void clear()            移除所有的键值对元素
        boolean containsKey(Object key)     判断集合是否包含指定的键
        boolean containsValue(Object value) 判断集合是否包含指定的值
        boolean isEmpty()                   判断集合是否为空
        int size()                          集合的长度，也就是集合中键值对的个数
         */

        Map<String,String> m =new HashMap<>();

        m.put("郭靖","黄蓉");
        m.put("韦小宝","沐剑屏");
        m.put("尹志平","小龙女");

        System.out.println(m);
        String value = m.put("韦小宝","双儿");
        System.out.println(value);

        System.out.println(m);

        m.remove("郭靖");
        System.out.println(m);

        //m.clear();

        boolean keyResult=m.containsKey("郭靖2");
        System.out.println(keyResult);

        boolean valueResult = m.containsValue("小龙女");
        System.out.println(valueResult);

        boolean result =m.isEmpty();
        System.out.println(result);
    }

}
