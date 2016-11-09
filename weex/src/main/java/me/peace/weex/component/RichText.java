package me.peace.weex.component;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXDomObject;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;

/**
 * Created by User_Kira on 2016/10/31.
 */

public class RichText extends WXComponent {
    public RichText(WXSDKInstance instance, WXDomObject dom, WXVContainer parent, boolean isLazy) {
        super(instance, dom, parent, isLazy);
    }

    @Override
    protected View initComponentHostView(@NonNull Context context) {
        mHost = new TextView(context);
        ((TextView)mHost).setMovementMethod(LinkMovementMethod.getInstance());
        return mHost;
    }

    @WXComponentProp(name = "tel")
    public void setTelLink(String tel){
        SpannableString spannable = new SpannableString(tel);
        spannable.setSpan(new URLSpan("tel:" + tel),0,tel.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ((TextView)mHost).setText(spannable);
    }
}
