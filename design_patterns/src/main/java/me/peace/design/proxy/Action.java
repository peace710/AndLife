package me.peace.design.proxy;

/**
 * Created by User_Kira on 2016/10/19.
 */
//代理模式
public class Action {
    public static void main(String args[]){
        //静态代理
        App app = new App("QQ");
        AppManager manager = new AppManager(app);
        manager.run();

        //动态代理
        WebFunction proxyBrowser = ProxyPool.create(new Browser());
        proxyBrowser.request("http://www.baidu.com");
        proxyBrowser.request("http://www.taobao.com");
        proxyBrowser.request("http://www.google.com");
    }
}
