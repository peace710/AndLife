package me.peace.basic.animation;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.AutoTransition;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/24.
 */
@TargetApi(19)
public class TransitionActivity extends AppCompatActivity {
    private static final int MODE_FADE = 0;
    private static final int MODE_AUTO  = 1;
    private static final int MODE_CHANGE_BOUNDS  = 2;
    private static final int MODE_SET  = 3;
    private int mode = MODE_FADE;

    private Scene scene;
    private Scene anotherScene;
    private ViewGroup sceneRoot;
    private boolean isScene = true;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        sceneRoot = (ViewGroup)findViewById(R.id.scene_root);
        scene = Scene.getSceneForLayout(sceneRoot,R.layout.layout_scene,this);
        anotherScene = Scene.getSceneForLayout(sceneRoot,R.layout.layout_another_scene,this);


        sceneRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Transition transition  = null;
                if (isScene) {
                    if (MODE_FADE == mode) {
                        transition = new Fade();
                        mode = MODE_AUTO;
                    }else  if (MODE_AUTO== mode){
                        transition = new AutoTransition();
                        mode = MODE_CHANGE_BOUNDS;
                    }else if (MODE_CHANGE_BOUNDS == mode){
                        transition = new ChangeBounds();
                        mode = MODE_SET;
                    }else if (MODE_SET == mode){
                        mode = MODE_FADE;
                        TransitionSet set = new TransitionSet();
                        set.addTransition(new Fade()).addTransition(new ChangeBounds()).addTransition(new AutoTransition());
                        set.setDuration(3000L);
                        set.setInterpolator(new BounceInterpolator());
                        TransitionManager.go(anotherScene, set);
                        return;
                    }
                    transition.setDuration(3000L);
                    transition.setInterpolator(new BounceInterpolator());
                    TransitionManager.go(anotherScene, transition);
                }else{
                    TransitionManager.go(scene);
                }
                isScene = !isScene;
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sceneRoot = null;
        anotherScene = null;
        scene = null;
    }
}
