package me.peace.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;
import me.peace.R;
import me.peace.basic.js.JavaScriptActivity;
import me.peace.basic.js.ReactActivity;
import me.peace.common.RecyclerViewLine;
import me.peace.data.Data;
import me.peace.items.TextItem;
import me.peace.weex.WXConfig;
import me.peace.weex.activity.WeexActionActivity;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class WeexCommunicateActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private static final Data DATAS[] = {
            new Data(R.string.weex_child_parent, WeexActionActivity.class, WXConfig.JS_CHILD_PARENT),
            new Data(R.string.weex_parent_child, WeexActionActivity.class,WXConfig.JS_PARENT_CHILD),
            new Data(R.string.weex_parent_childs, WeexActionActivity.class,WXConfig.JS_PARENT_CHILDS),
            new Data(R.string.weex_brother, WeexActionActivity.class,WXConfig.JS_BROTHER)
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
