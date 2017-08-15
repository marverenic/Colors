package com.marverenic.colors.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;

import com.marverenic.colors.ColorTheme;
import com.marverenic.colors.Colors;

public final class ColorsActivityDelegate {

    private Activity mActivity;
    private ColorTheme mTheme;
    private String mTaskName;
    private Bitmap mTaskIcon;

    public ColorsActivityDelegate(Activity parent) {
        this(parent, null, null);
    }

    public ColorsActivityDelegate(Activity parent, @Nullable String taskName,
                                  @Nullable Bitmap taskIcon) {
        mActivity = parent;
        mTaskName = taskName;
        mTaskIcon = taskIcon;
    }

    public void onCreate() {
        mTheme = Colors.getTheme();
        Colors.theme(mActivity, mTaskName, mTaskIcon);
    }

    public void onResume() {
        if (!Colors.getTheme().equals(mTheme)) {
            mActivity.recreate();
        }
    }

}
