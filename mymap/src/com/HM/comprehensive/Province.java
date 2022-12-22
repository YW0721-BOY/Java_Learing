package com.HM.comprehensive;

import java.util.*;

public class Province {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> hashMap =new HashMap<>();

        ArrayList<String> city1 =new ArrayList<>();
        Collections.addAll(city1,"南京市","扬州市","苏州市","无锡市","常州市");
        ArrayList<String> city2 =new ArrayList<>();
        Collections.addAll(city2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        ArrayList<String> city3 =new ArrayList<>();
        Collections.addAll(city3,"石家庄市","唐山市","邢台市","保定市","张家口市");

        hashMap.put("江苏省",city1);
        hashMap.put("湖北省",city2);
        hashMap.put("河北省",city3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hashMap.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            ArrayList<String> value = entry.getValue();
            StringJoiner sj=new StringJoiner(", ","","");
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(entry.getKey()+" = "+sj);
        }
    }

}
