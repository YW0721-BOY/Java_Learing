package a01text;

import java.time.LocalDate;
import java.util.Calendar;

/*
判断任意的一个年份是闰年还是平年
要求：用JDK7和JDK8两种方式判断
提示：
    二月有29天是闰年
    一年有365天是闰年
 */
public class Test5 {
    public static void main(String[] args) {
        //JDK7
        Calendar c=Calendar.getInstance();
        c.set(2000,2,1);//月份的范围：0~11

        c.add(Calendar.DAY_OF_MONTH,-1);
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        //jdk8
        LocalDate ld1=LocalDate.of(2000,3,1);
        LocalDate ld2=ld1.minusDays(1);

        int day2=ld2.getDayOfMonth();
        System.out.println(day2);


        System.out.println(ld1.isLeapYear());


    }
}
