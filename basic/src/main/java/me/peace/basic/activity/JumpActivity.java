package me.peace.basic.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;

import java.util.List;

/**
 * Created by User_Kira on 2016/11/8.
 */

public class JumpActivity extends AppCompatActivity {
    public static final String KEY_MODE = "mode";
    public static final String FULL = "full";
    public static final String PART = "part";

    protected void jump(Class clazz){
        jump(clazz,"");
    }

    protected void jump(Class clazz,String mode){
        Intent intent = new Intent(this,clazz);
        if (!TextUtils.isEmpty(mode)) {
            intent.putExtra(KEY_MODE, mode);
        }
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        if (isIntentSafe){
            startActivity(intent);
        }
    }

}
