package com.kiwilss.threetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.kiwilss.threetest.activity.RadioGroupActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new TextView(this);

    }

    public void radiogroupListener(View view) {
        goTo(RadioGroupActivity.class);

    }


    public void goTo(Class clz){
        startActivity(new Intent(this,clz));
    }

}
