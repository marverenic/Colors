package com.marverenic.colors;

import android.app.Activity;
import android.content.res.Resources;
import android.support.annotation.NonNull;

public class Colors {

    private static ColorTheme sTheme;

    private Colors() {
        throw new RuntimeException("This class cannot be instantiated");
    }

    public static void theme(Activity activity) {
        if (sTheme == null) {
            throw new IllegalStateException("Theme has not been set");
        }

        Resources.Theme theme = activity.getTheme();
        theme.applyStyle(sTheme.getPrimaryColor().getThemeRes(), true);
        theme.applyStyle(sTheme.getAccentColor().getThemeRes(), true);
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
