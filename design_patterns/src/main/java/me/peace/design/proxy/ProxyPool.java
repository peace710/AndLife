package me.peace.design.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by User_Kira on 2016/10/19.
 */

public class ProxyPool {
    private ProxyPool(){
        throw new IllegalStateException();
    }

    static <T> T create(Object obj){
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),new ProxyInvocationHandler(obj));
    }
}
