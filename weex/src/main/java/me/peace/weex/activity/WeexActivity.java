package me.peace.weex.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;

/**
 * Created by User_Kira on 2016/10/28.
 */

public abstract class WeexActivity extends AppCompatActivity implements IWXRenderListener {
    private WXSDKInstance wxsdkInstance;

    protected abstract int offerContentViewId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(offerContentViewId());
        initWXSDKInstance();
    }

    //初始化WXSDKInstance
    protected void initWXSDKInstance(){
        wxsdkInstance = new WXSDKInstance(this);
        wxsdkInstance.registerRenderListener(this);
    }

    public WXSDKInstance getWxsdkInstance() {
        return wxsdkInstance;
    }

    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {
        setContentView(view);
    }

    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (null != wxsdkInstance){
            wxsdkInstance.onActivityResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (null != wxsdkInstance){
            wxsdkInstance.onActivityPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (null != wxsdkInstance){
            wxsdkInstance.onActivityStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != wxsdkInstance){
            wxsdkInstance.onActivityDestroy();
        }
    }
}
