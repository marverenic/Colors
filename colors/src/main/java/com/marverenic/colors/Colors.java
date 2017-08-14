package com.marverenic.colors;

import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;

public class Colors {

    private static ColorTheme sTheme;

    private Colors() {
        throw new RuntimeException("This class cannot be instantiated");
    }

    public static void theme(Activity activity) {
        if (sTheme == null) {
            throw new IllegalStateException("Theme has not been set");
        }

        if (activity instanceof AppCompatActivity) {
            AppCompatDelegate.setDefaultNightMode(sTheme.getNightMode().getAppcompatMode());
        }

        Resources.Theme theme = activity.getTheme();
        theme.applyStyle(sTheme.getPrimaryColor().getThemeRes(), true);
        theme.applyStyle(sTheme.getAccentColor().getThemeRes(), true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            applyTaskDescription(activity);
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private static void applyTaskDescription(Activity activity) {
        @ColorRes int primaryColorRes = sTheme.getPrimaryColor().getPrimaryColorRes();
        @ColorInt int primaryColor = ContextCompat.getColor(activity, primaryColorRes);

        TaskDescription taskDescription = new TaskDescription(null, null, primaryColor);
        activity.setTaskDescription(taskDescription);
    }

    public static void setTheme(@NonNull PrimaryColor primaryColor,
                                @NonNull AccentColor accentColor) {
        setTheme(new ColorTheme(primaryColor, accentColor));
    }

    public static void setTheme(@NonNull PrimaryColor primaryColor,
                                @NonNull AccentColor accentColor,
                                @NonNull NightMode nightMode) {
        setTheme(new ColorTheme(primaryColor, accentColor, nightMode));
    }

    public static void setTheme(@NonNull ColorTheme theme) {
        if (theme == null) {
            throw new IllegalArgumentException("theme cannot be null");
        }
        sTheme = theme;
    }

    public static ColorTheme getTheme() {
        return sTheme;
    }

}
