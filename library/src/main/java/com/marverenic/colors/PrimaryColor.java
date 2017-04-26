package com.marverenic.colors;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorRes;
import android.support.annotation.StyleRes;

public enum PrimaryColor implements Parcelable {

    ;

    @StyleRes private int mTheme;
    @ColorRes private int mPrimaryColor;
    @ColorRes private int mPrimaryDarkColor;

    PrimaryColor(@StyleRes int theme, @ColorRes int primaryColor, @ColorRes int primaryDarkColor) {
        mTheme = theme;
        mPrimaryColor = primaryColor;
        mPrimaryDarkColor = primaryDarkColor;
    }

    @StyleRes
    protected int getThemeRes() {
        return mTheme;
    }

    @ColorRes
    public int getPrimaryColorRes() {
        return mPrimaryColor;
    }

    @ColorRes
    public int getPrimaryDarkColorRes() {
        return mPrimaryDarkColor;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PrimaryColor> CREATOR = new Creator<PrimaryColor>() {
        @Override
        public PrimaryColor createFromParcel(Parcel in) {
            return valueOf(in.readString());
        }

        @Override
        public PrimaryColor[] newArray(int size) {
            return new PrimaryColor[size];
        }
    };
}
