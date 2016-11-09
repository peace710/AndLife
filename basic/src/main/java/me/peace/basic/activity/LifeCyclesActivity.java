package me.peace.basic.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import me.peace.basic.R;
import me.peace.basic.utils.SharedPreferencesUtils;

/**
 * Created by User_Kira on 2016/11/8.
 */

public class LifeCyclesActivity extends JumpActivity {
    private TextView activityLifeCycles;
    private SharedPreferencesUtils sp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycles);
        setTitle(getString(R.string.activity_life_cycles));
        init();
    }

    private void init(){
        activityLifeCycles = (TextView)findViewById(R.id.activity_life_cycles);
        sp = new SharedPreferencesUtils(this,SharedPreferencesUtils.SP_ACTIVITY_LIFE_CYCLES);
    }

    public void fullJump(View v){
        jump(getString(R.string.activity_full),FULL);
    }

    public void partJump(View v){
        jump(getString(R.string.activity_part),PART);
    }

    private void jump(String desc,String mode){
        activityLifeCycles.setText("");
        sp.remove(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES);
        sp.write(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES,getString(R.string.activity_a_2_activity_b));
        sp.append(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES,desc);
        jump(ActivityOne.class,mode);
    }

    public void showLifeCycles(View v){
        String s = sp.read(SharedPreferencesUtils.KEY_ACTIVITY_LIFE_CYCLES);
        activityLifeCycles.setText(s);
    }


    @Override
    protected void onDestroy() {
        activityLifeCycles = null;
        sp.destroy();
        sp = null;
        super.onDestroy();
    }
}
