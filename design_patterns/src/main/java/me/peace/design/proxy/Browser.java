package me.peace.design.proxy;

/**
 * Created by User_Kira on 2016/10/19.
 */

public class Browser implements WebFunction{
    @Override
    public void request(String url){
        System.out.println("Loading " + url);
    }
}
