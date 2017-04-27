package com.marverenic.colors;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

public final class ColorTheme implements Parcelable {

    @NonNull
    private final PrimaryColor mPrimaryColor;

    @NonNull
    private final AccentColor mAccentColor;

    public ColorTheme(@NonNull PrimaryColor primaryColor, @NonNull AccentColor accentColor) {
        if (primaryColor == null) {
            throw new IllegalArgumentException("primary color cannot be null");
        } else if (accentColor == null) {
            throw new IllegalArgumentException("accent color cannot be null");
        }

        mPrimaryColor = primaryColor;
        mAccentColor = accentColor;
    }

    private ColorTheme(Parcel in) {
        this((PrimaryColor) in.readParcelable(PrimaryColor.class.getClassLoader()),
                (AccentColor) in.readParcelable(AccentColor.class.getClassLoader()));
    }

    @NonNull
    public PrimaryColor getPrimaryColor() {
        return mPrimaryColor;
    }

    @NonNull
    public AccentColor getAccentColor() {
        return mAccentColor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(mPrimaryColor, 0);
        dest.writeParcelable(mAccentColor, 0);
    }

    public static final Creator<ColorTheme> CREATOR = new Creator<ColorTheme>() {
        @Override
        public ColorTheme createFromParcel(Parcel in) {
            return new ColorTheme(in);
        }

        @Override
        public ColorTheme[] newArray(int size) {
            return new ColorTheme[size];
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ColorTheme that = (ColorTheme) o;

        return this.mPrimaryColor == that.mPrimaryColor
                && this.mAccentColor == that.mAccentColor;

    }

    @Override
    public int hashCode() {
        int result = mPrimaryColor.hashCode();
        result = 31 * result + mAccentColor.hashCode();
        return result;
    }
}
