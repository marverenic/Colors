package com.marverenic.colors;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatDelegate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public enum NightMode implements Parcelable {

    DAY(AppCompatDelegate.MODE_NIGHT_NO),
    NIGHT(AppCompatDelegate.MODE_NIGHT_YES),
    AUTO(AppCompatDelegate.MODE_NIGHT_AUTO),
    FOLLOW_SYSTEM(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);

    @NightModeValue
    private int mAppcompatMode;

    NightMode(@NightModeValue int value) {
        mAppcompatMode = value;
    }

    @NightModeValue
    int getAppcompatMode() {
        return mAppcompatMode;
    }

    static NightMode getFromAppcompatMode(@NightModeValue int value) {
        for (NightMode nightMode : values()) {
            if (nightMode.getAppcompatMode() == value) {
                return nightMode;
            }
        }

        throw new IllegalArgumentException("Invalid appcompat mode: " + value);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mAppcompatMode);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @IntDef({AppCompatDelegate.MODE_NIGHT_NO, AppCompatDelegate.MODE_NIGHT_YES,
            AppCompatDelegate.MODE_NIGHT_AUTO, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM})
    @Retention(RetentionPolicy.SOURCE)
    private @interface NightModeValue {}

    public static final Creator<NightMode> CREATOR = new Creator<NightMode>() {
        @Override
        public NightMode createFromParcel(Parcel in) {
            //noinspection WrongConstant
            return getFromAppcompatMode(in.readInt());
        }

        @Override
        public NightMode[] newArray(int size) {
            return new NightMode[size];
        }
    };

}
