package com.HM.a01mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {
        //要求1：有多少个水仙花数。 100~999
        //要求2：判断一下为什么没有2位水仙花数
        //要求3：统计一下共有多少个4叶玫瑰数、五角星数

        int count=0;
        for (int i=100;i<=999;i++){
            int ge =i%10;
            int shi =i/10%10;
            int bai =i/100%10;

            double sum =Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3);

            if (i==sum){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println( );
        System.out.println(count);



    }


}
