package me.peace.basic.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class LotteryService extends IntentService {
    public LotteryService() {
        super("LotteryService");
    }

    @Override
    protected void onHandleIntent(Intent data) {
        int length = data.getIntExtra(Lottery.KEY_LENGTH,Lottery.DEAFAULT_LENGTH);
        String result = drawLottery(Lottery.RANGE,length);
        Intent intent = new Intent(Lottery.BROADCAST_ACTION);
        intent.putExtra(Lottery.KEY_RESULT,result);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private String drawLottery(int range,int length){
        ArrayList<String> pool = new ArrayList<>();
        for (int i = 0 ; i < range ;i++){
            pool.add(String.format("%02d",i));
        }
        Collections.shuffle(pool);
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < length ; i++){
            int count = pool.size();
            int index = new Random().nextInt(count);
            sb.append(pool.remove(index) + " ");
        }
        return sb.toString();
    }
}
