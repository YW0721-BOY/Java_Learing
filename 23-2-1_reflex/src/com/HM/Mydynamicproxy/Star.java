package com.HM.Mydynamicproxy;

public interface Star {
    //我们可以把所有想要被代理的方法写在接口
    public abstract String sing(String name);
    public abstract void dance();
}
