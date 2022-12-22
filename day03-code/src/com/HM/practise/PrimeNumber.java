package com.HM.practise;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=1;
        int m=5;
        int count=0;
        for (int i=n;i<=m;i++){
            if(judge(i)){
                count++;
            }
        }
        System.out.println(n+"~"+m+"之间的质数有："+count+"个");

    }

    public static boolean judge(int n){
        boolean flag=true;
        for (int i=2;i< n;i++){
            if(n%i==0){
                flag =false;
            }
        }
        return flag;
    }
}
