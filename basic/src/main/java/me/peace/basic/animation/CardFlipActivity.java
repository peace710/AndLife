package me.peace.basic.animation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/27.
 */

public class CardFlipActivity extends AppCompatActivity {
    private boolean isShowingBack = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_flip);

        if (null == savedInstanceState){
            getFragmentManager().beginTransaction().add(R.id.container,new CardFrontFragment()).commit();
        }
        flipCard();
    }

    private void flipCard(){
        if (isShowingBack){
            getFragmentManager().popBackStack();
            return;
        }

        isShowingBack = true;
        getFragmentManager().beginTransaction().
                setCustomAnimations(R.animator.card_flip_right_in,
                        R.animator.card_flip_right_out,
                        R.animator.card_flip_left_in,
                        R.animator.card_flip_left_out).
                replace(R.id.container,new CardBackFragment()).addToBackStack(null).commit();
    }

    public static class CardFrontFragment extends Fragment {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_card_front,container,false);
        }
    }

    public static class CardBackFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_card_back,container,false);
        }
    }
}


