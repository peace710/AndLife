package me.peace.design.observer;

/**
 * Created by User_Kira on 2016/10/20.
 */

public class ComputerData {
    private ComputerData(){
        throw new IllegalStateException();
    }

    public static final int MEMORY = 4096;
    public static final int LOW_MEMORY = 512;
    public static final int NORMAL_MEMORY = 2048;
}
