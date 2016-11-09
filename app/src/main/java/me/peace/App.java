package me.peace;

import android.app.Application;

import me.peace.weex.WXConfig;

/**
 * Created by User_Kira on 2016/10/13.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiTypeInstaller.install();
        WXConfig.init(this);
    }

}
