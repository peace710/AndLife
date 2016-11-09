package me.peace.weex.module;

import android.text.TextUtils;
import android.widget.Toast;

import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;

/**
 * Created by User_Kira on 2016/10/31.
 */

public class CommonModule extends WXModule {
   @WXModuleAnno(runOnUIThread = true)
    public void toast(String msg){
       if (!TextUtils.isEmpty(msg)){
            Toast.makeText(mWXSDKInstance.getContext(),msg,Toast.LENGTH_LONG).show();
       }
   }
}
