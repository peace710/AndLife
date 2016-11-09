package me.peace.basic.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * Created by User_Kira on 2016/11/8.
 */

public class SharedPreferencesUtils {
    public static final String SP_ACTIVITY_LIFE_CYCLES = "activity_life_cycles";
    public static final String KEY_ACTIVITY_LIFE_CYCLES = "life_cycles";


    private String spName;
    private Context context;

    public SharedPreferencesUtils(Context context,String spName){
        this.context = context;
        this.spName = spName;
    }

    public boolean write(String key, String value){
        if (null != context && !TextUtils.isEmpty(spName) && !TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
            SharedPreferences sp = context.getSharedPreferences(spName, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(key, value);
            return editor.commit();
        }
        return false;
    }

    public String read(String key){
        if (null != context && !TextUtils.isEmpty(spName) && !TextUtils.isEmpty(key)) {
            SharedPreferences sp = context.getSharedPreferences(spName, Context.MODE_PRIVATE);
            return sp.getString(key,"");
        }
        return "";
    }

    public boolean append(String key,String value){
        String content = read(key);
        StringBuffer sb = new StringBuffer(content);
        sb.append("\n").append(value);
        return write(key,sb.toString());
    }

    public void remove(String key){
        if (null != context && !TextUtils.isEmpty(spName) && !TextUtils.isEmpty(key)) {
            SharedPreferences sp = context.getSharedPreferences(spName, Context.MODE_PRIVATE);
            sp.edit().remove(key);
        }
    }

    public void destroy(){
        this.spName = null;
        this.context = null;
    }
}
