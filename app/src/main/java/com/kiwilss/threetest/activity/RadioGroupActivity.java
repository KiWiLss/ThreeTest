package com.kiwilss.threetest.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.kiwilss.threetest.R;
import com.kiwilss.threetest.fragment.FragmentOne;

import java.util.ArrayList;

/**
 * Created by kiwilss on 2017/11/4.
 */

public class RadioGroupActivity extends AppCompatActivity {

    private RadioGroup mRg;
    private RadioButton mRbOne;
    private RadioButton mRbTwo;
    private ArrayList<Fragment> mFgList;
    private FragmentManager mFM;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiogroup);
        initView();
        initEvent();
        initFragment();
        mFM = getSupportFragmentManager();
    }

    private void initFragment() {
        mFgList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            //activity向fragment传递参数
            FragmentOne fragmentOne = new FragmentOne();
            Bundle bundle = new Bundle();
            bundle.putString("key","Hello Kitty"+i);
            fragmentOne.setArguments(bundle);
            mFgList.add(fragmentOne);
        }

    }

    private void initEvent() {
        mRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.rb_radio_one:
                        Toast.makeText(RadioGroupActivity.this, "1", Toast.LENGTH_SHORT).show();
                        changeFragment(0);
                        mRbOne.setSelected(true);
                        mRbTwo.setSelected(false);
                        break;
                    case R.id.rb_radio_two:
                        Toast.makeText(RadioGroupActivity.this, "2", Toast.LENGTH_SHORT).show();
                        changeFragment(1);
                        mRbOne.setSelected(false);
                        mRbTwo.setSelected(true);
                        break;
                }


            }
        });


    }
    Fragment mCurrentFg;
    private void changeFragment(int i) {
        FragmentTransaction ft = mFM.beginTransaction();
        if (mCurrentFg==null){
            ft.add(R.id.fl_radio_fl,mFgList.get(i)).commit();
        }else {
            if (mFgList.get(i).isAdded()) {

                ft.hide(mCurrentFg).show(mFgList.get(i)).commit();

            }else {
                ft.hide(mCurrentFg).add(R.id.fl_radio_fl,mFgList.get(i)).commit();
            }
        }
        mCurrentFg=mFgList.get(i);

    }

    private void initView() {
        mRg = (RadioGroup) findViewById(R.id.rg_radio_rg);
        mRbOne = (RadioButton) findViewById(R.id.rb_radio_one);
        mRbTwo = (RadioButton) findViewById(R.id.rb_radio_two);
    }
}
