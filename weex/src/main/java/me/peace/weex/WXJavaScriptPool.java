package me.peace.weex;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;

import java.util.HashMap;

/**
 * Created by User_Kira on 2016/10/31.
 */

public class WXJavaScriptPool {
    private static final String TAG = WXJavaScriptPool.class.getSimpleName();
    private static HashMap<String,String> javaScriptPaths = new HashMap<>();

    public static synchronized void register(@NonNull String key,@NonNull String path){
        String value = javaScriptPaths.put(key,path);
        if (!TextUtils.isEmpty(value)){
            Log.w(TAG,value + "is replaced by " + path + ",key is " + key);
        }
    }

    public static String getPath(@NonNull String key){
        return javaScriptPaths.get(key);
    }

}
