package com.HM.a01mymap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A09_TreeMap {
    public static void main(String[] args) {
        /*
        需求：字符串”aababcabcdabcde“
            请统计字符串中每一个字符出现的次数，并按照以下格式输出
            输出的结果：
                a(5)b(4)c(3)d(2)e(1)
         */

        String str ="aababcabcdabcde";
        char[] chars = str.toCharArray();

        TreeMap<Character,Integer> treeMap =new TreeMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (treeMap.containsKey(chars[i])){
                int count =treeMap.get(chars[i]);
                count++;
                treeMap.put(chars[i],count);
            }else {
                treeMap.put(chars[i],1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = treeMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry.getKey()+"("+entry.getValue()+")");
        }


    }
}
