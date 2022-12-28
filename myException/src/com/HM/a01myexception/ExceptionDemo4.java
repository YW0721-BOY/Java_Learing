package com.HM.a01myexception;

/*
*如果try中可能会遇到多个问题，怎么执行？
*
*只要一个异常判定成功，就会直接跳出，后面的异常不会显示
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
            System.out.println(2/0);
            String s=null;
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }catch (ArithmeticException e){
            System.out.println("算数异常");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("会不会执行这条语句？");
    }
}
