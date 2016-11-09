package me.peace.basic.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class LotteryReceiver extends BroadcastReceiver {
    public LotteryReceiver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
         String action = intent.getAction();
         if (Lottery.BROADCAST_ACTION.equalsIgnoreCase(action)){
             String data = intent.getStringExtra(Lottery.KEY_RESULT);
             if (!TextUtils.isEmpty(data)){
                 Toast.makeText(context,data,Toast.LENGTH_LONG).show();
                 NotificationController builder = new NotificationController(context);
                 builder.setTitle(context.getString(R.string.lottery_results)).setText(data).setSmallIcon(R.drawable.ic_launcher).nofity(LotteryActivity.class);
             }
         }
    }
}
