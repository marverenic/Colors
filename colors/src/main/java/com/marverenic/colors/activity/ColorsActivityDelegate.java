package com.marverenic.colors.activity;

import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.marverenic.colors.ColorTheme;
import com.marverenic.colors.Colors;

/**
 * Serves as a delegate for the theming logic for an activity. This class takes care of theming
 * activities and triggering activity recreations when the theme changes when an activity is paused.
 *
 * To use this class, simply create an instance of it in one of your activities, and call the
 * corresponding methods in this class in the appropriate lifecycle callback (e.g. In your
 * {@link Activity#onResume()}, call {@link #onResume()}). Delegates should be kept until the
 * activity is destroyed, but do not need to be persisted across activity recreations or
 * configuration changes.
 *
 * @see ColorsActivity for an extension of Activity that implements this behavior
 * @see ColorsAppCompatActivity for an extension of AppCompatActvity that implements this behavior
 */
public final class ColorsActivityDelegate {

    private Activity mActivity;
    private ColorTheme mTheme;
    private String mTaskName;
    private Bitmap mTaskIcon;

    /**
     * Creates a new ColorsActivityDelegate for an Activity
     * @param parent The activity that will be delegating to this object
     * @see #ColorsActivityDelegate(Activity, String, Bitmap) to customize the Activity's
     *      {@link TaskDescription}
     */
    public ColorsActivityDelegate(Activity parent) {
        this(parent, null, null);
    }

    /**
     * Creates a new ColorsActivityDelegate for an Activity
     * @param parent The activity that will be delegating to this object
     * @param taskName The name that should show up in this app's overview entry, or {@code null}
     *                 for the default value
     * @param taskIcon The icon that should appear in this app's overview entry, or {@code null}
     *                 for the default value
     * @see #ColorsActivityDelegate(Activity, String, Bitmap) to customize the Activity's
     *      {@link TaskDescription}
     */
    public ColorsActivityDelegate(Activity parent, @Nullable String taskName,
                                  @Nullable Bitmap taskIcon) {
        mActivity = parent;
        mTaskName = taskName;
        mTaskIcon = taskIcon;
    }

    /**
     * Call this in your Activity's {@link Activity#onCreate(Bundle)} method. Note that this MUST
     * be called before inflating any views or calling {@link Activity#setContentView(int)}.
     */
    public void onCreate() {
        mTheme = Colors.getTheme();
        Colors.theme(mActivity, mTaskName, mTaskIcon);
    }

    /**
     * Call this in your Activity's {@link Activity#onResume()} method.
     */
    public void onResume() {
        if (!Colors.getTheme().equals(mTheme)) {
            mActivity.recreate();
        }
    }

}
