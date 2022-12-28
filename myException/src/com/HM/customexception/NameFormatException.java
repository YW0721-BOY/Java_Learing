package com.HM.customexception;

public class NameFormatException extends RuntimeException{
    //技巧：
    //NameFormat：当前异常的名字

    //运行时：RuntimeException 核心 就表示由于参数错误而导致的问题
    //编译时：Exception 核心 提醒程序员检查本地信息

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
