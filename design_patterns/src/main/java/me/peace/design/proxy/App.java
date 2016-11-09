package me.peace.design.proxy;

/**
 * Created by User_Kira on 2016/10/19.
 */

public class App implements Function {
    private String name;

    public App(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is  running!");
    }
}
