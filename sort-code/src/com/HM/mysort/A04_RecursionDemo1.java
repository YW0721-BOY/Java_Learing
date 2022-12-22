package com.HM.mysort;

public class A04_RecursionDemo1 {
    /*
    需求：利用递归求1-100之间的和
    100+99+98+……+1
     */
    public static void main(String[] args) {

        System.out.println(getSum(100));
        System.out.println(getFactorial(5));

    }
    public static int getSum(int number){
        if (number ==1){
            return 1;
        }
        return number+getSum(number-1);
    }
    public static int getFactorial(int number){
        if (number==1){
            return 1;
        }
        return number*getFactorial(number-1);
    }
}
