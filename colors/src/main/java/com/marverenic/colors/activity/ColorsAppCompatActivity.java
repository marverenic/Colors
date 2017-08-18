package com.marverenic.colors.activity;

import android.app.ActivityManager.TaskDescription;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.marverenic.colors.AccentColor;
import com.marverenic.colors.Colors;
import com.marverenic.colors.NightMode;
import com.marverenic.colors.PrimaryColor;

/**
 * An extension of {@link AppCompatActivity} that automatically themes itself. You must call
 * {@link Colors#setTheme(PrimaryColor, AccentColor, NightMode)} or one of its overloads before
 * creating this Activity.
 *
 * @see ColorsActivity to extend from {@link android.app.Activity} instead. Not that night mode
 *      is only supported in AppCompatActivities with a theme that extends from
 *      {@code Theme.AppCompat.DayNight} or one of its children.
 * @see ColorsActivityDelegate
 */
public class ColorsAppCompatActivity extends AppCompatActivity {

    private ColorsActivityDelegate mDelegate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDelegate = new ColorsActivityDelegate(this, getTaskName(), getTaskIcon());
        mDelegate.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mDelegate.onResume();
    }

    /**
     * Override this method to customize this Activity's {@link TaskDescription}.
     * Only used on API 21+.
     * @return The name to show for this app on the recent apps page, or {@code null} to use the
     *         default task name
     */
    @Nullable
    protected String getTaskName() {
        return null;
    }

    /**
     * Override this method to customize this Activity's {@link TaskDescription}.
     * Only used on API 21+.
     * @return The icon to show for this app on the recent apps page, or {@code null} to use the
     *         default task icon
     */
    @Nullable
    protected Bitmap getTaskIcon() {
        return null;
    }

}
