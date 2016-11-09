package me.peace.design.observer;

/**
 * Created by User_Kira on 2016/10/20.
 */

public class QQSecurityGuards implements Observer<Integer>{
    @Override
    public void update(Integer integer) {
        int currentMemory = integer.intValue();
        int memory = ComputerData.MEMORY - currentMemory;
        if (memory <= ComputerData.LOW_MEMORY){
            System.out.println("QQSecurityGuards:内存不足,当前可用内存为" + memory + "MB,请关闭一些应用释放内存!");
        }else if (memory <= ComputerData.NORMAL_MEMORY){
            System.out.println("QQSecurityGuards:内存使用正常,当前可用内存为" + memory + "MB");
        }else if (memory <= ComputerData.MEMORY){
            System.out.println("QQSecurityGuards:系统运行十分流畅,当前可用内存为" + memory + "MB");
        }
    }
}
