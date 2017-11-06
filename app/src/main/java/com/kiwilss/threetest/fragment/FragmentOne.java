package com.kiwilss.threetest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kiwilss.threetest.R;

/**
 * Created by kiwilss on 2017/11/4.
 */

public class FragmentOne extends Fragment {

    private TextView mTv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        mTv = view.findViewById(R.id.tv_fg_one);

        Bundle arguments = getArguments();
        String key = arguments.getString("key");
        Log.e("MMM", "onCreateView: "+key );
        mTv.setText(key);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
