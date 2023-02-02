package com.HM.Mydynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 类的作用：
*       创建一个代理
 */
public class ProxyUtil {
    /*
     * 方法得作用：
     *          给一个明星得对象，创建一个代理
     *
     * 形参：
     *     被代理得明星对象
     * 返回值：
     *     给明星创建的代理
     *
     * 需求：
     *  外边的人想要大明星唱一首歌
     *  1.获取代理的对象
     *          代理的对象=ProxyUtil.createProxy(大明星的对象);
     *  2.再调用代理的唱歌方法
     *          代理对象.唱歌的方法();
     *
     */

    public static Star createProxy(BigStar bigStar){
        /* java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：
         *
         * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interface, InvocationHandler h)
         * 参数1：用于指定用哪个类加载器，去加载生成的代理类
         * 参数2：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
         * 参数3：用来指定生成的代理对象要干什么事情
         */

        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),   //参数1：用于指定用哪个类加载器，去加载生成的代理类
                new Class[]{Star.class},            //参数2：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
                new InvocationHandler() {           //参数3：用来指定生成的代理对象要干什么事情
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                         * 参数1：代理的对象
                         * 参数2：要运行的方法
                         * 参数3：要调用sing方法时，传递的实参
                         *
                         */
                        if ("sing".equals(method.getName())){
                            System.out.println("准备话筒，收钱");
                        }else if("dance".equals(method.getName())){
                            System.out.println("准备舞台，收钱");
                        }

                        //去找大明星开始唱歌或者跳舞
                        //调用明星的方法
                        return method.invoke(bigStar,args);
                    }
                }
        );
        return star;
    }
}
