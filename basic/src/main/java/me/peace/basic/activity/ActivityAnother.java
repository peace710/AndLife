package me.peace.basic.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/11/8.
 */

public class ActivityAnother extends LifeCycles {
    @Override
    public String getActivityName() {
        return "ActivityB";
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        setTitle(getString(R.string.activity_another));
    }
}
