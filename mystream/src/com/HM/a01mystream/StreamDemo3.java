package com.HM.a01mystream;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {

        HashMap<String,Integer> hm =new HashMap<>();

        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        hm.keySet().stream().forEach(s -> System.out.println(s));

        hm.entrySet().stream().forEach(s-> System.out.println(s));
    }
}
