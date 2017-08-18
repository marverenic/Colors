package com.marverenic.colors;

import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;

import com.marverenic.colors.activity.ColorsActivity;
import com.marverenic.colors.activity.ColorsActivityDelegate;
import com.marverenic.colors.activity.ColorsAppCompatActivity;

public final class Colors {

    private static ColorTheme sTheme;

    private Colors() {
        throw new RuntimeException("This class cannot be instantiated");
    }

    /**
     * Applies the current color scheme set by {@link #setTheme(ColorTheme)} to the provided
     * Activity. This must be called before inflating the Activity's content view.
     * @param activity The Activity to be themed
     * @throws IllegalStateException if a theme has not been specified
     * @see #theme(Activity, String, Bitmap) to customize the app's {@link TaskDescription}
     * @since 1.0
     */
    public static void theme(Activity activity) {
        theme(activity, null, null);
    }

    /**
     * Applies the current color scheme set by {@link #setTheme(ColorTheme)} to the provided
     * Activity and sets its {@link TaskDescription} with the provided values. This must be called
     * before inflating the Activity's content view.
     *
     * Most users should not call this method directly. Instead, you should use
     * {@link ColorsActivity}, {@link ColorsAppCompatActivity}, or {@link ColorsActivityDelegate}
     * to theme your activities.
     *
     * @param activity The Activity to be themed
     * @param taskName The name to show on the recent apps page for your application. If
     *                 {@code null}, then the default name will be used. Only applicable on API 21+.
     * @param taskIcon The icon to show on the recent apps page for your application. If
     *                 {@code null}, then the default icon will be used. Only applicable on API 21+.
     * @throws IllegalArgumentException if a theme has not been specified
     * @see #theme(Activity) if you don't need to customize your app's {@link TaskDescription}.
     * @since 1.1
     */
    public static void theme(Activity activity, @Nullable String taskName,
                             @Nullable Bitmap taskIcon) {

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
            applyTaskDescription(activity, taskName, taskIcon);
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private static void applyTaskDescription(Activity activity, @Nullable String taskName,
                                             @Nullable Bitmap taskIcon) {
        @ColorRes int primaryColorRes = sTheme.getPrimaryColor().getPrimaryColorRes();
        @ColorInt int primaryColor = ContextCompat.getColor(activity, primaryColorRes);

        TaskDescription taskDescription = new TaskDescription(taskName, taskIcon, primaryColor);
        activity.setTaskDescription(taskDescription);
    }

    /**
     * Sets your app's global theme. To apply this theme to your Activities, you must call
     * {@link #theme(Activity)} before your view hierarchy is inflated. If you are calling this in
     * an Activity that is already onscreen, then call {@link Activity#recreate()} to immediately
     * apply the new theme to your Activity.
     *
     * Most users should not call this method directly. Instead, you should use
     * {@link ColorsActivity}, {@link ColorsAppCompatActivity}, or {@link ColorsActivityDelegate}
     * to theme your activities.
     *
     * @param primaryColor The primary color for your theme from the Material Design palette
     * @param accentColor The accent color for your theme from the Material Design palette
     * @see #setTheme(PrimaryColor, AccentColor, NightMode) to specify a night mode setting.
     *      Otherwise, night mode will be disabled.
     * @since 1.0
     */
    public static void setTheme(@NonNull PrimaryColor primaryColor,
                                @NonNull AccentColor accentColor) {
        setTheme(new ColorTheme(primaryColor, accentColor));
    }

    /**
     * Sets your app's global theme. To apply this theme to your Activities, you must call
     * {@link #theme(Activity)} before your view hierarchy is inflated. If you are calling this in
     * an Activity that is already onscreen, then call {@link Activity#recreate()} to immediately
     * apply the new theme to your Activity.
     * @param primaryColor The primary color for your theme from the Material Design palette
     * @param accentColor The accent color for your theme from the Material Design palette
     * @param nightMode The night mode option for your theme, which affects whether the background
     *                  is light or dark. Note that for this to be effective, your app's base theme
     *                  should extend from {@code Theme.AppCompat.DayNight} or one of its children.
     * @since 1.1
     */
    public static void setTheme(@NonNull PrimaryColor primaryColor,
                                @NonNull AccentColor accentColor,
                                @NonNull NightMode nightMode) {
        setTheme(new ColorTheme(primaryColor, accentColor, nightMode));
    }

    /**
     * Manually restores a pre-built theme.
     * @param theme The theme to set as your app's global theme
     * @see #setTheme(PrimaryColor, AccentColor, NightMode) To concisely set a new theme
     * @see #setTheme(PrimaryColor, AccentColor) To concisely set a new theme with night mode off
     * @since 1.0
     */
    public static void setTheme(@NonNull ColorTheme theme) {
        if (theme == null) {
            throw new IllegalArgumentException("theme cannot be null");
        }
        sTheme = theme;
    }

    /**
     * @return Your app's current global theme
     * @throws IllegalStateException If this is called before setting a theme
     * @since 1.0
     */
    @NonNull
    public static ColorTheme getTheme() {
        if (sTheme == null) {
            throw new IllegalStateException("Theme has not been set");
        }
        return sTheme;
    }

}
