package me.peace.basic.animation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/27.
 */

public class ScreenSlidePageFragment extends Fragment {
    private static final String KEY_INDEX = "index";

    public static ScreenSlidePageFragment newInstance(int index){
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_INDEX,index);
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_screen_slide_page,container,false);
        int index = getArguments().getInt(KEY_INDEX,0);
        rootView.setBackgroundColor(getActivity().getResources().getIntArray(R.array.colors)[index]);
        return rootView;
    }
}
