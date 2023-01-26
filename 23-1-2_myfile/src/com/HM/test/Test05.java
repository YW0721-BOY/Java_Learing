package com.HM.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
需求：
    统计一个文件夹中每种文件的个数并打印
    （考虑子文件夹）


    File 递归 Map集合
 */
public class Test05 {
    public static void main(String[] args) {
        File file = new File("F:\\JavaLearningRoad\\Java_Learning\\23-1-2_myfile");
        HashMap<String, Integer> map = getCount(file);
        System.out.println(map);
    }


    /*
    *作用：
    *   统计一个文件夹中每种文件的个数
    *参数：
    *   要统计的那个文件夹
    *返回值：
    *   用来统计map集合
    *   键：后缀名 值：次数
     */
    public static HashMap<String,Integer> getCount(File src){
        HashMap<String,Integer> hm =new HashMap<>();

        File[] files = src.listFiles();

        for (File file : files) {
            if (file.isFile()){
                String name = file.getName();
                String[] arr = name.split("\\.");
                if (arr.length>=2){
                    String endName=arr[arr.length-1];
                    if (hm.containsKey(endName)){
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName,count);
                    }else {
                        hm.put(endName,1);
                    }
                }
            }else {
                HashMap<String, Integer> sonMap = getCount(file);

                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {

                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (hm.containsKey(key)){
                        int count = hm.get(key);
                        count+=value;
                        hm.put(key,count);
                    }else {
                        hm.put(key,value);
                    }

                }
            }
        }
    return hm;
    }
}
