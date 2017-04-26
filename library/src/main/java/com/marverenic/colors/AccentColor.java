package com.marverenic.colors;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorRes;
import android.support.annotation.StyleRes;

public enum AccentColor implements Parcelable {

    ;

    @StyleRes private int mTheme;
    @ColorRes private int mAccentColorRes;

    AccentColor(@StyleRes int theme, @ColorRes int accentColorRes) {
        mTheme = theme;
        mAccentColorRes = accentColorRes;
    }

    @StyleRes
    protected int getThemeRes() {
        return mTheme;
    }

    @ColorRes
    private int getAccentColorRes() {
        return mAccentColorRes;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AccentColor> CREATOR = new Creator<AccentColor>() {
        @Override
        public AccentColor createFromParcel(Parcel in) {
            return valueOf(in.readString());
        }

        @Override
        public AccentColor[] newArray(int size) {
            return new AccentColor[size];
        }
    };
}
