package me.peace.basic.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/11/8.
 */

public class ActivityOne extends LifeCycles {
    @Override
    public String getActivityName() {
        return "ActivityA";
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void jumpToActivity(View v){
        String mode = getMode();
        if (FULL.equalsIgnoreCase(mode)) {
            jump(ActivityAnother.class);
        }else if (PART.equalsIgnoreCase(mode)){
            jump(ActivityAnotherPart.class);
        }
    }

    private String getMode(){
        return getIntent().getStringExtra(KEY_MODE);
    }
}
