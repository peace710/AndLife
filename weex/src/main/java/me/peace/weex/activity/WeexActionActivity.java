package me.peace.weex.activity;

import android.text.TextUtils;

import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.utils.WXFileUtils;

import me.peace.weex.R;
import me.peace.weex.WXJavaScriptPool;

/**
 * Created by User_Kira on 2016/10/28.
 */

public class WeexActionActivity extends WeexActivity {
    private static final String KEY_ADDON = "addon";

    @Override
    protected int offerContentViewId() {
        return R.layout.activity_action_weex;
    }

    @Override
    protected void initWXSDKInstance() {
        super.initWXSDKInstance();
        /**
         * WXHelloWorld 可以替换成自定义的字符串，针对埋点有效。
         * template 是.we transform 后的 js文件。
         * option 可以为空，或者通过option传入 js需要的参数。例如bundle js的地址等。
         * jsonInitData 可以为空。
         * width 为-1 默认全屏，可以自己定制。
         * height =-1 默认全屏，可以自己定制。
         */
        String addon = getIntent().getStringExtra(KEY_ADDON);
        if (!TextUtils.isEmpty(addon)) {
            String javaScript = WXJavaScriptPool.getPath(addon);
            if (!TextUtils.isEmpty(javaScript)) {
                getWxsdkInstance().render(getString(R.string.weex), WXFileUtils.loadAsset(javaScript, this), null, null, -1, -1, WXRenderStrategy.APPEND_ASYNC);
            }
        }
    }
}
