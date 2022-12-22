package a01text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/*
请使用代码实现计算你活了多久
 */
public class Test4 {
    public static void main(String[] args) throws ParseException {

        //JDK7
        //规则：只要对时间进行或判断，都需要先获取当前时间的毫秒值
        String birthday = "2001年7月21日";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        Long birthdayTime = date.getTime();

        Long todayTime = System.currentTimeMillis();

        Long time =todayTime-birthdayTime;
        System.out.println(time/1000/60/60/24);


        //JDK8
        LocalDate ld1 =LocalDate.of(2001,7,21);
        LocalDate ld2 =LocalDate.now();

        Long days=ChronoUnit.DAYS.between(ld1,ld2);
        System.out.println(days);
    }
}
