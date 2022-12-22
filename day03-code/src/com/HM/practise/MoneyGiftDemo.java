package com.HM.practise;

import com.HM.test.Test2;

import java.util.Random;
import java.util.concurrent.TimeoutException;

/*
* 一个大V直播抽奖，奖品是现金红包，分别有{2，588，888，1000，10000}五种奖金。
* 请用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
*
 */
public class MoneyGiftDemo {
    public static void main(String[] args) {

        int[] arr ={1,588,888,1000,10000};
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            int indexRandom= r.nextInt(arr.length);
            int temp=arr[i];
            arr[i] =arr[indexRandom];
            arr[indexRandom]=temp;
        }

        Test2.printArr(arr);
    }
}
