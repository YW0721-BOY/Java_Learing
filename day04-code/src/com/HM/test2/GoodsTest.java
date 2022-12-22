package com.HM.test2;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 =new Goods("001","iPhone13pro",8899.00,999);
        Goods g2 =new Goods("002","iPhone14pro",18899.00,99);
        Goods g3 =new Goods("003","iPhone15pro",28899.00,9);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods =arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
