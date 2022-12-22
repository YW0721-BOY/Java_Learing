package a01text;

/*
自己实现parseInt方法的效果，将字符串的数据转成整数
要求：
       字符串只能是数字不能有其他字符
       最少一位，最多10位
       0不能开头
 */

public class Test2 {
    public static void main(String[] args) {

        String str ="131423456";

        if (str.matches("[1-9]//d{0,9}")){
            System.out.println("数据正确，可以继续");

            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i)-'0';
                num=num*10+c;
            }
        }else {
            System.out.println("数据错误");
        }



    }

}
