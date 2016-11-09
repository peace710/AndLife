package me.peace.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.Fragment;

import java.util.List;

/**
 * Created by User_Kira on 2016/10/13.
 */

public class Router {
    public static void go(Context context, Intent intent){
        PackageManager packageManager = context.getPackageManager();
        List activities = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        if (isIntentSafe){
            context.startActivity(intent);
        }
    }

    public static void goResult(Activity activity, Intent intent, int requestCode){
        PackageManager packageManager = activity.getPackageManager();
        if (null != intent.resolveActivity(packageManager)){
            activity.startActivityForResult(intent,requestCode);
        }
    }

    public static void goResult(Fragment fragment,Intent intent, int requestCode){
        goResult(fragment.getActivity(),intent,requestCode);
    }

}
