package com.marverenic.colors.activity;

import android.app.Activity;

import com.marverenic.colors.ColorTheme;
import com.marverenic.colors.Colors;

public final class ColorsActivityDelegate {

    private Activity mActivity;
    private ColorTheme mTheme;

    public ColorsActivityDelegate(Activity parent) {
        mActivity = parent;
    }

    public void onCreate() {
        mTheme = Colors.getTheme();
        Colors.theme(mActivity);
    }

    public void onResume() {
        if (!Colors.getTheme().equals(mTheme)) {
            mActivity.recreate();
        }
    }

}
