package me.peace.basic.service;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class Lottery {
    private Lottery(){
        throw new IllegalStateException();
    }

    public static final int RANGE = 48;
    public static final int DEAFAULT_LENGTH = 8;
    public static final String KEY_LENGTH = "length";
    public static final String KEY_RESULT = "lottery_result";
    public static final String BROADCAST_ACTION = "me.peace.basic.service.LotteryReceiver";
    public static final int LOTTERY_ID = 1024;
}
