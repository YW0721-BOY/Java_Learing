package com.HM.a01mymap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A06_LinkedHashMapDemo6 {
    public static void main(String[] args) {
        /*
        LinkedHashMap:
            由键决定：
                有序、不重复、无索引。
             有序：保证存储和取出的顺序一致
             原理：底层数据结构依然是哈希表，只是每个键值对元素多了一个双链表的机制记录存储顺序
         */

        LinkedHashMap<String,Integer> linkedHashMap =new LinkedHashMap<>();

        linkedHashMap.put("a",123);
        linkedHashMap.put("a",153);
        linkedHashMap.put("c",243);
        linkedHashMap.put("d",113);
        linkedHashMap.put("e",223);

        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }


    }
}
