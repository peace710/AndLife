package me.peace.basic.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/27.
 */

public class ZoomActivity extends AppCompatActivity {

    private Animator currentAnimator;
    private ImageButton image;

    private int shortAnimDuration = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        image = (ImageButton)findViewById(R.id.image);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoom(image,R.drawable.image);
            }
        });
        shortAnimDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);
    }

    private void zoom(final ImageButton image, int resImage) {
        if (null != currentAnimator){
            currentAnimator.cancel();
        }

        final ImageView zoomImage = (ImageView)findViewById(R.id.zoom_image);
        zoomImage.setImageResource(resImage);

        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        Point globalOffset = new Point();

        image.getGlobalVisibleRect(startBounds);
        findViewById(R.id.container).getGlobalVisibleRect(finalBounds,globalOffset);
        startBounds.offset(-globalOffset.x,-globalOffset.y);
        finalBounds.offset(-globalOffset.x,-globalOffset.y);

        float startScale;
        if ((float)finalBounds.width() / finalBounds.height() > (float)startBounds.width() /startBounds.height()){
            startScale = (float)startBounds.height() / finalBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth = (startWidth - startBounds.width()) / 2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        }else{
            startScale = (float) startBounds.width() / finalBounds.width();
            float startHeight = startScale * finalBounds.height();
            float deltaHeight = (startHeight - startBounds.height()) / 2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;
        }

        image.setAlpha(0f);
        zoomImage.setVisibility(View.VISIBLE);
        zoomImage.setPivotX(0f);
        zoomImage.setPivotY(0f);

        AnimatorSet set = new AnimatorSet();
        set.play(ObjectAnimator.ofFloat(zoomImage,View.X,startBounds.left,finalBounds.left)).
                with(ObjectAnimator.ofFloat(zoomImage,View.Y,startBounds.top,finalBounds.top)).
                with(ObjectAnimator.ofFloat(zoomImage,View.SCALE_X,startScale,1f)).
                with(ObjectAnimator.ofFloat(zoomImage,View.SCALE_Y,startScale,1f));

        set.setDuration(shortAnimDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                currentAnimator = null;
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                currentAnimator = null;
            }
        });
        set.start();
        currentAnimator = set;

        final float startScaleFinal = startScale;
        zoomImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != currentAnimator){
                    currentAnimator.cancel();
                }

                AnimatorSet set = new AnimatorSet();
                set.play(ObjectAnimator.ofFloat(zoomImage,View.X,startBounds.left)).
                        with(ObjectAnimator.ofFloat(zoomImage,View.Y,startBounds.top)).
                        with(ObjectAnimator.ofFloat(zoomImage,View.SCALE_X,startScaleFinal)).
                        with(ObjectAnimator.ofFloat(zoomImage,View.SCALE_Y,startScaleFinal));

                set.setDuration(shortAnimDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animation) {
                        image.setAlpha(1f);
                        zoomImage.setVisibility(View.GONE);
                        currentAnimator = null;
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        image.setAlpha(1f);
                        zoomImage.setVisibility(View.GONE);
                        currentAnimator = null;
                    }
                });
                set.start();
                currentAnimator = set;
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        currentAnimator = null;
        image = null;
    }
}
