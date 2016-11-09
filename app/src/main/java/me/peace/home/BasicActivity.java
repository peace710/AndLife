package me.peace.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;
import me.peace.R;
import me.peace.basic.activity.LifeCyclesActivity;
import me.peace.basic.js.JavaScriptActivity;
import me.peace.basic.service.LotteryActivity;
import me.peace.common.RecyclerViewLine;
import me.peace.data.Data;
import me.peace.items.TextItem;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class BasicActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private static final Data DATAS[] = {
            new Data(R.string.javascript, JSActivity.class),
            new Data(R.string.intent_service, LotteryActivity.class),
            new Data(R.string.animation, AnimationActivity.class),
            new Data(R.string.activity_life_cycles, LifeCyclesActivity.class)
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
            items.add(new TextItem(getString(dat.resId),dat.cls));
        }
        return items;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        recyclerView = null;
    }
}
