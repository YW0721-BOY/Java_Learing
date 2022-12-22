package a01text;

/*
定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
 */

public class Test3 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(123));
        System.out.println(Integer.toBinaryString(123));


    }
    public static String toBinaryString(int number){

        StringBuilder sb = new StringBuilder();

        while (true){
            if (number ==0){
                break;
            }
            int remaindar = number %2;
            sb.insert(0,remaindar);
            number=number/2;
        }
        return sb.toString();
    }
}
