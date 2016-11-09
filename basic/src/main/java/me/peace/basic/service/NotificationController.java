package me.peace.basic.service;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.NotificationCompat;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class NotificationController {
    private NotificationCompat.Builder builder = null;
    private TaskStackBuilder stackBuilder = null;
    private Context context = null;
    private Intent intent = null;

    public NotificationController(Context context){
        this.context = context;
        builder = new NotificationCompat.Builder(context);
        stackBuilder = TaskStackBuilder.create(context);
        intent = new Intent();
    }

    public NotificationController setTitle(String title){
        builder.setContentTitle(title);
        return this;
    }

    public NotificationController setText(String text){
        builder.setContentText(text);
        intent.putExtra(Lottery.KEY_RESULT,text);
        return this;
    }

    public NotificationController setSmallIcon(@DrawableRes int resId){
        builder.setSmallIcon(resId);
        return this;
    }

    public void nofity(Class cls){
        intent.setClass(context,cls);
        stackBuilder.addParentStack(cls);
        stackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);
        builder.setAutoCancel(true);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(Lottery.LOTTERY_ID,builder.build());
    }
}
