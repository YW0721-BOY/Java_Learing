package com.HM.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {

        Collection arrayList =new ArrayList();
        arrayList.add("zhangsan");
        arrayList.add("lisi");
        arrayList.add("jack");

        Iterator iterator =arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
