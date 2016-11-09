package me.peace.design.observer;

/**
 * Created by User_Kira on 2016/10/20.
 */

public class SecurityGuards implements Observer<Integer> {
    @Override
    public void update(Integer integer) {
        int currentMemory = integer.intValue();
        int memory = ComputerData.MEMORY - currentMemory;
        if (memory <= ComputerData.LOW_MEMORY){
            System.out.println("SecurityGuards:系统内存使用紧张,请关闭一些应用释放内存!");
        }else if (memory <= ComputerData.NORMAL_MEMORY){
            System.out.println("SecurityGuards:系统运行很正常!");
        }else if (memory <= ComputerData.MEMORY){
            System.out.println("SecurityGuards:系统运行十分流畅!");
        }
    }
}
