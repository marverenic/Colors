package com.marverenic.colors.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class ColorsActivity extends Activity {

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
