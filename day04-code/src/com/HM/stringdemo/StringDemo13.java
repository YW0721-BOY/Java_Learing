package com.HM.stringdemo;

public class StringDemo13 {
    public static void main(String[] args) {
        String talk ="你玩的真好，以后不要玩了,SB";
        String[] arr={"TMD","SB","MLGB"};

        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"****");
        }

        System.out.println(talk);
    }
}
