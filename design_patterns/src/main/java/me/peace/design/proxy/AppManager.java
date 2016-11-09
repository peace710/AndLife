package me.peace.design.proxy;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by User_Kira on 2016/10/19.
 */

public class AppManager implements Function {
    private App delegate;

    public AppManager(App delegate){
        this.delegate = delegate;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("App starts at " + new Date(startTime));
        delegate.run();
    }
}
