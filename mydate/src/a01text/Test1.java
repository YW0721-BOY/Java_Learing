package a01text;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    /*
    键盘录入一些1~100之间的整数，并添加到集合中。
    直到集合中所有数据和超过200为止
     */

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        int sum=0;
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("请输入一个整数：");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if (num<1 || num>100){
                continue;
            }

            list.add(num);
            sum+=num;
            if (sum>200){
                System.out.println("已达到峰值");
                break;
            }
        }
    }
}
