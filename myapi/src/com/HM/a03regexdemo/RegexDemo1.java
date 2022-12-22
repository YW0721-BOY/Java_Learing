package com.HM.a03regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        /* 假如现在要求校验一个qq号码是否正确
            规则：6位及20位之内，0不能在开头，必须全部都是数字
            先使用目前所学知识完成检验需求
            然后体验正则表达式
         */
        String qq = "123456789";
        boolean flag=qq.matches("[1-9]\\d{5,19}");
        System.out.println(flag);

    }

    public static boolean checkQQ(String qq) {
        if (qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        if (qq.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
