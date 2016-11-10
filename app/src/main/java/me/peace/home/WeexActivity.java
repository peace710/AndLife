package me.peace.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;
import me.peace.R;
import me.peace.common.RecyclerViewLine;
import me.peace.data.Data;
import me.peace.items.TextItem;
import me.peace.weex.WXConfig;
import me.peace.weex.activity.WeexActionActivity;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class WeexActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private static final Data DATAS[] = {
            new Data(R.string.weex_hello, WeexActionActivity.class, WXConfig.JS_ACTION),
            new Data(R.string.weex_extends_to_android, WeexActionActivity.class, WXConfig.JS_COMMON),
            new Data(R.string.weex_data_binding, WeexActionActivity.class, WXConfig.JS_DATA_BINDING),
            new Data(R.string.weex_tech_list, WeexActionActivity.class, WXConfig.JS_TECH_LIST),
            new Data(R.string.weex_in_template, WeexActionActivity.class, WXConfig.JS_IN_TEMPLATE),
            new Data(R.string.weex_computed_properties,WeexActionActivity.class,WXConfig.JS_COMPUTED_PROP),
            new Data(R.string.weex_if,WeexActionActivity.class,WXConfig.JS_IF),
            new Data(R.string.weex_static,WeexActionActivity.class,WXConfig.JS_STATIC),
            new Data(R.string.weex_style_class,WeexActionActivity.class,WXConfig.JS_STYLE_CLASS),
            new Data(R.string.weex_event,WeexActionActivity.class,WXConfig.JS_EVENT),
            new Data(R.string.weex_repeat,WeexActionActivity.class,WXConfig.JS_REPEAT),
            new Data(R.string.weex_repeat_extend,WeexActionActivity.class,WXConfig.JS_REPEAT_EXTEND),
            new Data(R.string.weex_render_logic_control,WeexActionActivity.class,WXConfig.JS_RENDER_LOGIC_CONTROL),
            new Data(R.string.weex_composed_component,WeexActionActivity.class,WXConfig.JS_COMPOSED_COMPONENT),
            new Data(R.string.weex_composed_component_extend,WeexActionActivity.class,WXConfig.JS_COMPOSED_COMPONENT_EXTEND),
            new Data(R.string.weex_find_an_element,WeexActionActivity.class,WXConfig.JS_FIND_AN_ELEMENT),
            new Data(R.string.weex_communicate_between_components,WeexCommunicateActivity.class),
            new Data(R.string.weex_scroller,WeexActionActivity.class,WXConfig.JS_SCROLLER),
            new Data(R.string.weex_input,WeexActionActivity.class,WXConfig.JS_INPUT),
            new Data(R.string.weex_switch,WeexActionActivity.class,WXConfig.JS_SWITCH),
            new Data(R.string.weex_slider,WeexActionActivity.class,WXConfig.JS_SLIDER)

    };


    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setAdapter(new MultiTypeAdapter(loadItem()));
        recyclerView.addItemDecoration(new RecyclerViewLine.Builder().setSize(1).setColor(getResources().getColor(R.color.colorGrey)).build());
    }

    private Items loadItem(){
        Items items = new Items();
        for (Data dat : DATAS){
            items.add(new TextItem(getString(dat.resId),dat.cls,dat.addon));
        }
        return items;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        recyclerView = null;
    }
}
