package com.HM.test;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            list.add(i+1);
        }
        System.out.println(list);
    }
}
