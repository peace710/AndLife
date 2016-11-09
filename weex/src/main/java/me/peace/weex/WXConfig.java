package me.peace.weex;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import me.peace.weex.adapter.WeexImageAdapter;
import me.peace.weex.component.RichText;
import me.peace.weex.module.CommonModule;

/**
 * Created by User_Kira on 2016/10/28.
 */

public class WXConfig {
    //module
    private static final String COMMON_MODULE = "commonModule";
    //component
    private static final String RICH_TEXT = "richtext";

    //javascript_key
    public static final String JS_ACTION = "action";
    public static final String JS_COMMON = "common";
    public static final String JS_DATA_BINDING = "databinding";
    public static final String JS_TECH_LIST = "tech-list";
    public static final String JS_IN_TEMPLATE = "in-template";
    public static final String JS_COMPUTED_PROP = "computed-prop";
    public static final String JS_IF = "if";
    public static final String JS_STATIC = "static";
    public static final String JS_STYLE_CLASS = "style-class";
    public static final String JS_EVENT = "event";
    public static final String JS_REPEAT = "repeat";
    public static final String JS_REPEAT_EXTEND = "repeat-extend";
    public static final String JS_RENDER_LOGIC_CONTROL = "render-logic-control";
    public static final String JS_COMPOSED_COMPONENT = "composed-component";
    public static final String JS_COMPOSED_COMPONENT_EXTEND = "composed-component-extend";
    public static final String JS_FIND_AN_ELEMENT = "find-an-element";
    public static final String JS_CHILD_PARENT = "child-parent";
    public static final String JS_PARENT_CHILD = "parent-child";
    public static final String JS_PARENT_CHILDS = "parent-childs";
    public static final String JS_BROTHER = "brother";

    public static void init(Application application){
        //初始化WXSDK
        InitConfig config = new InitConfig.Builder().setImgAdapter(new WeexImageAdapter()).build();
        WXSDKEngine.initialize(application,config);
        try {
            //module
            WXSDKEngine.registerModule(COMMON_MODULE, CommonModule.class);

            //component
            WXSDKEngine.registerComponent(RICH_TEXT, RichText.class);

            //javascript
            WXJavaScriptPool.register(JS_ACTION, "weex-action.js");
            WXJavaScriptPool.register(JS_COMMON,"common.js");
            WXJavaScriptPool.register(JS_DATA_BINDING,"databinding.js");
            WXJavaScriptPool.register(JS_TECH_LIST, "tech-list.js");
            WXJavaScriptPool.register(JS_IN_TEMPLATE,"in-template.js");
            WXJavaScriptPool.register(JS_COMPUTED_PROP, "computed-properties.js");
            WXJavaScriptPool.register(JS_IF, "if.js");
            WXJavaScriptPool.register(JS_STATIC,"static.js");
            WXJavaScriptPool.register(JS_STYLE_CLASS, "style-class.js");
            WXJavaScriptPool.register(JS_EVENT, "event.js");
            WXJavaScriptPool.register(JS_REPEAT,"repeat.js");
            WXJavaScriptPool.register(JS_REPEAT_EXTEND,"repeat-extend.js");
            WXJavaScriptPool.register(JS_RENDER_LOGIC_CONTROL,"render-logic-control.js");
            WXJavaScriptPool.register(JS_COMPOSED_COMPONENT,"composed-component.js");
            WXJavaScriptPool.register(JS_COMPOSED_COMPONENT_EXTEND,"composed-component-extend.js");
            WXJavaScriptPool.register(JS_FIND_AN_ELEMENT,"find-an-element.js");
            WXJavaScriptPool.register(JS_CHILD_PARENT,"communicate-between-components/child-parent.js");
            WXJavaScriptPool.register(JS_PARENT_CHILD,"communicate-between-components/parent-child.js");
            WXJavaScriptPool.register(JS_PARENT_CHILDS,"communicate-between-components/parent-childs.js");
            WXJavaScriptPool.register(JS_BROTHER,"communicate-between-components/brother.js");
        } catch (WXException e) {
            e.printStackTrace();
        }
    }
}
