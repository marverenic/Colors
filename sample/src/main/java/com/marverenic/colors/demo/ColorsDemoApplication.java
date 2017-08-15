package com.marverenic.colors.demo;

import android.app.Application;

import com.marverenic.colors.AccentColor;
import com.marverenic.colors.ColorTheme;
import com.marverenic.colors.Colors;
import com.marverenic.colors.PrimaryColor;

public class ColorsDemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Colors.setTheme(new ColorTheme(PrimaryColor.RED_500, AccentColor.RED_A400));
    }

}
