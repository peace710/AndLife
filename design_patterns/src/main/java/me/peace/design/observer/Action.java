package me.peace.design.observer;

import java.util.Random;

/**
 * Created by User_Kira on 2016/10/20.
 */

public class Action {
    public static void main(String[] args){
        SecurityGuards guards = new SecurityGuards();
        QQSecurityGuards securityGuards = new QQSecurityGuards();
        Computer computer = new Computer();
        computer.install(guards);
        computer.install(securityGuards);
        int currentMemory = new Random().nextInt(4096);
        computer.setMemory(currentMemory);
        computer.notifyUpdate();
        computer.uninstall(guards);
        computer.uninstall(securityGuards);
    }
}
