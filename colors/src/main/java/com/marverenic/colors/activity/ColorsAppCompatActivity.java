package com.marverenic.colors.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ColorsAppCompatActivity extends AppCompatActivity {

    private ColorsActivityDelegate mDelegate = new ColorsActivityDelegate(this);

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDelegate.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mDelegate.onResume();
    }

}
