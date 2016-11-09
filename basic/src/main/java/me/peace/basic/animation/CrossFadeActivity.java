package me.peace.basic.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/27.
 */

public class CrossFadeActivity extends AppCompatActivity {
    private View content;
    private View loadingView;
    private int shortAnimDuration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossfade);
        content = findViewById(R.id.content);
        loadingView = findViewById(R.id.loading);
        content.setVisibility(View.GONE);
        shortAnimDuration = 2000;
        crossfade();
    }

    private void crossfade(){
        content.setAlpha(0f);
        content.setVisibility(View.VISIBLE);
        content.animate().alpha(1f).setDuration(shortAnimDuration).setListener(null);

        loadingView.animate().alpha(0f).setDuration(shortAnimDuration).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                    loadingView.setVisibility(View.GONE);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        content = null;
        loadingView = null;
    }
}
