package com.HM.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> arrayList =new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("kim");

      for(String s:arrayList){
          System.out.println(s);
      }

        System.out.println();

        System.out.println(arrayList);

    }
}
