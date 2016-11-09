package me.peace.basic.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.peace.basic.utils.SharedPreferencesUtils;

/**
 * Created by User_Kira on 2016/11/8.
 */

public abstract class LifeCycles extends JumpActivity {
    public abstract String getActivityName();
    private SharedPreferencesUtils sp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = new SharedPreferencesUtils(getApplication(),SharedPreferencesUtils.SP_ACTIVITY_LIFE_CYCLES);
        sp.append(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES,"onCreate(" + getActivityName() +")") ;
    }

    @Override
    protected void onStart() {
        super.onStart();
        sp.append(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES,"onStart(" + getActivityName() +")") ;
    }

    @Override
    protected void onResume() {
        super.onResume();
        sp.append(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES,"onResume(" + getActivityName() +")") ;
    }

    @Override
    protected void onPause() {
        sp.append(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES,"onPause(" + getActivityName() +")") ;
        super.onPause();
    }

    @Override
    protected void onStop() {
        sp.append(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES,"onStop(" + getActivityName() +")") ;
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        sp.append(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES,"onDestroy(" + getActivityName() +")") ;
        sp.destroy();
        sp = null;
        super.onDestroy();
    }

}
