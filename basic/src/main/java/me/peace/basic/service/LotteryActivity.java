package me.peace.basic.service;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class LotteryActivity extends AppCompatActivity {
    private ViewStub viewStub;
    private TextView lotteryResults;
    private LotteryReceiver receiver;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_lottery);
        register();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (null != intent) {
            String data = intent.getStringExtra(Lottery.KEY_RESULT);
            if (!TextUtils.isEmpty(data)) {
                inflate();
                lotteryResults.setText(data);
            }
        }
    }

    private void register(){
        IntentFilter filter = new IntentFilter(Lottery.BROADCAST_ACTION);
        receiver = new LotteryReceiver();
        LocalBroadcastManager.getInstance(this).registerReceiver(receiver,filter);
    }

    private void unregister(){
        LocalBroadcastManager.getInstance(this).unregisterReceiver(receiver);
        receiver = null;
    }

    public void drawLottery(View v){
        Intent intent = new Intent(this,LotteryService.class);
        intent.putExtra(Lottery.KEY_LENGTH,10);
        startService(intent);
    }

    private void inflate(){
        if (null == viewStub) {
            viewStub = (ViewStub) findViewById(R.id.stub_view);
            View view = viewStub.inflate();
            view.setVisibility(View.VISIBLE);
            lotteryResults = (TextView) view.findViewById(R.id.lottery_results);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregister();
        viewStub = null;
        lotteryResults = null;
    }
}
