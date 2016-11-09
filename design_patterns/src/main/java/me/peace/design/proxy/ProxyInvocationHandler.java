package me.peace.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by User_Kira on 2016/10/19.
 */

public class ProxyInvocationHandler implements InvocationHandler {
   private Object delegate;

    public ProxyInvocationHandler(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String url = args[0].toString();
        System.out.println("Check the url:" + url);
        if (!url.toString().contains("taobao")) {
            return method.invoke(delegate, args);
        }
        System.out.println("No permission to request the website!");
        return null;
    }

}
