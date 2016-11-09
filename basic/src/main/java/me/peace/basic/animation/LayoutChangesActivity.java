package me.peace.basic.animation;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.lang.ref.WeakReference;
import java.util.Random;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/27.
 */

public class LayoutChangesActivity extends AppCompatActivity {
    private ScrollView scrollview;
    private LinearLayout container;
    private ScrollHandler scrollHandler;
    private int duration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_changes);
        scrollview = (ScrollView) findViewById(R.id.scrollview);
        container = (LinearLayout)findViewById(R.id.container);
        scrollHandler = new ScrollHandler(this);
        duration = getResources().getInteger(R.integer.anim_time);
        addLayoutTransition();
    }

    private void addLayoutTransition(){
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setInterpolator(LayoutTransition.APPEARING,new AccelerateInterpolator());
        layoutTransition.setInterpolator(LayoutTransition.DISAPPEARING,new DecelerateInterpolator());
        layoutTransition.setAnimator(LayoutTransition.APPEARING, generateSet(LayoutTransition.APPEARING));
        layoutTransition.setAnimator(LayoutTransition.DISAPPEARING, generateSet(LayoutTransition.DISAPPEARING));
        layoutTransition.setDuration(duration);
        container.setLayoutTransition(layoutTransition);
    }

    private AnimatorSet generateSet(int transtionType){
        AnimatorSet set = new AnimatorSet();
        if (LayoutTransition.APPEARING == transtionType) {
            set.playTogether(generateObjectAnimator("scaleX", 0f, 1f),generateObjectAnimator("scaleY",0f, 1f),generateObjectAnimator("alpha", 0f, 1f));
        }else if (LayoutTransition.DISAPPEARING == transtionType) {
            set.playTogether(generateObjectAnimator("scaleX", 1f, 0f),generateObjectAnimator("scaleY", 1f, 0f),generateObjectAnimator("alpha", 1f, 0f));
        }
        return set;
    }

    private ObjectAnimator generateObjectAnimator(String propertyName,float start,float end){
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setPropertyName(propertyName);
        objectAnimator.setFloatValues(start,end);
        return  objectAnimator;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        scrollview = null;
        container = null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout_changes,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.add_button){
            addChild();
        }else if (id == R.id.remove_button){
            removeChild();
        }
        return super.onOptionsItemSelected(item);
    }

    private void addChild() {
        String text = "button" + new Random().nextInt(100);
        Button button = new Button(this);
        button.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        button.setGravity(Gravity.CENTER);
        button.setText(text);
        button.setAlpha(0f);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.removeView(v);
            }
        });
        container.addView(button);
        scrollHandler.sendEmptyMessageDelayed(0,duration);
    }

    private void removeChild() {
        int size = container.getChildCount();
        if (size > 0){
            container.removeViewAt(size - 1);
        }
    }

    public static class ScrollHandler extends Handler{
        private WeakReference<LayoutChangesActivity> reference;

        public ScrollHandler(LayoutChangesActivity activity){
            reference = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            reference.get().scrollview.fullScroll(ScrollView.FOCUS_DOWN);
        }
    }
}
