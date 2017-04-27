package com.marverenic.colors;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorRes;
import android.support.annotation.StyleRes;

public enum PrimaryColor implements Parcelable {

    RED_500(R.style._ColorsTheme_Primary_Red_500, R.color._color_lib_red_500, R.color._color_lib_red_700),
    RED_600(R.style._ColorsTheme_Primary_Red_600, R.color._color_lib_red_600, R.color._color_lib_red_800),
    RED_700(R.style._ColorsTheme_Primary_Red_700, R.color._color_lib_red_700, R.color._color_lib_red_900),
    RED_800(R.style._ColorsTheme_Primary_Red_800, R.color._color_lib_red_500, R.color._color_lib_red_900),

    PINK_500(R.style._ColorsTheme_Primary_Pink_500, R.color._color_lib_pink_500, R.color._color_lib_pink_700),
    PINK_600(R.style._ColorsTheme_Primary_Pink_600, R.color._color_lib_pink_600, R.color._color_lib_pink_800),
    PINK_700(R.style._ColorsTheme_Primary_Pink_700, R.color._color_lib_pink_700, R.color._color_lib_pink_900),
    PINK_800(R.style._ColorsTheme_Primary_Pink_800, R.color._color_lib_pink_500, R.color._color_lib_pink_900),

    PURPLE_500(R.style._ColorsTheme_Primary_Purple_500, R.color._color_lib_purple_500, R.color._color_lib_purple_700),
    PURPLE_600(R.style._ColorsTheme_Primary_Purple_600, R.color._color_lib_purple_600, R.color._color_lib_purple_800),
    PURPLE_700(R.style._ColorsTheme_Primary_Purple_700, R.color._color_lib_purple_700, R.color._color_lib_purple_900),
    PURPLE_800(R.style._ColorsTheme_Primary_Purple_800, R.color._color_lib_purple_500, R.color._color_lib_purple_900),

    DEEP_PURPLE_500(R.style._ColorsTheme_Primary_DeepPurple_500, R.color._color_lib_deep_purple_500, R.color._color_lib_deep_purple_700),
    DEEP_PURPLE_600(R.style._ColorsTheme_Primary_DeepPurple_600, R.color._color_lib_deep_purple_600, R.color._color_lib_deep_purple_800),
    DEEP_PURPLE_700(R.style._ColorsTheme_Primary_DeepPurple_700, R.color._color_lib_deep_purple_700, R.color._color_lib_deep_purple_900),
    DEEP_PURPLE_800(R.style._ColorsTheme_Primary_DeepPurple_800, R.color._color_lib_deep_purple_500, R.color._color_lib_deep_purple_900),

    INDIGO_500(R.style._ColorsTheme_Primary_Indigo_500, R.color._color_lib_indigo_500, R.color._color_lib_indigo_700),
    INDIGO_600(R.style._ColorsTheme_Primary_Indigo_600, R.color._color_lib_indigo_600, R.color._color_lib_indigo_800),
    INDIGO_700(R.style._ColorsTheme_Primary_Indigo_700, R.color._color_lib_indigo_700, R.color._color_lib_indigo_900),
    INDIGO_800(R.style._ColorsTheme_Primary_Indigo_800, R.color._color_lib_indigo_500, R.color._color_lib_indigo_900),

    BLUE_500(R.style._ColorsTheme_Primary_Blue_500, R.color._color_lib_blue_500, R.color._color_lib_blue_700),
    BLUE_600(R.style._ColorsTheme_Primary_Blue_600, R.color._color_lib_blue_600, R.color._color_lib_blue_800),
    BLUE_700(R.style._ColorsTheme_Primary_Blue_700, R.color._color_lib_blue_700, R.color._color_lib_blue_900),
    BLUE_800(R.style._ColorsTheme_Primary_Blue_800, R.color._color_lib_blue_500, R.color._color_lib_blue_900),

    LIGHT_BLUE_500(R.style._ColorsTheme_Primary_LightBlue_500, R.color._color_lib_light_blue_500, R.color._color_lib_light_blue_700),
    LIGHT_BLUE_600(R.style._ColorsTheme_Primary_LightBlue_600, R.color._color_lib_light_blue_600, R.color._color_lib_light_blue_800),
    LIGHT_BLUE_700(R.style._ColorsTheme_Primary_LightBlue_700, R.color._color_lib_light_blue_700, R.color._color_lib_light_blue_900),
    LIGHT_BLUE_800(R.style._ColorsTheme_Primary_LightBlue_800, R.color._color_lib_light_blue_500, R.color._color_lib_light_blue_900),

    CYAN_500(R.style._ColorsTheme_Primary_Cyan_500, R.color._color_lib_cyan_500, R.color._color_lib_cyan_700),
    CYAN_600(R.style._ColorsTheme_Primary_Cyan_600, R.color._color_lib_cyan_600, R.color._color_lib_cyan_800),
    CYAN_700(R.style._ColorsTheme_Primary_Cyan_700, R.color._color_lib_cyan_700, R.color._color_lib_cyan_900),
    CYAN_800(R.style._ColorsTheme_Primary_Cyan_800, R.color._color_lib_cyan_500, R.color._color_lib_cyan_900),

    TEAL_500(R.style._ColorsTheme_Primary_Teal_500, R.color._color_lib_teal_500, R.color._color_lib_teal_700),
    TEAL_600(R.style._ColorsTheme_Primary_Teal_600, R.color._color_lib_teal_600, R.color._color_lib_teal_800),
    TEAL_700(R.style._ColorsTheme_Primary_Teal_700, R.color._color_lib_teal_700, R.color._color_lib_teal_900),
    TEAL_800(R.style._ColorsTheme_Primary_Teal_800, R.color._color_lib_teal_500, R.color._color_lib_teal_900),

    GREEN_500(R.style._ColorsTheme_Primary_Green_500, R.color._color_lib_green_500, R.color._color_lib_green_700),
    GREEN_600(R.style._ColorsTheme_Primary_Green_600, R.color._color_lib_green_600, R.color._color_lib_green_800),
    GREEN_700(R.style._ColorsTheme_Primary_Green_700, R.color._color_lib_green_700, R.color._color_lib_green_900),
    GREEN_800(R.style._ColorsTheme_Primary_Green_800, R.color._color_lib_green_500, R.color._color_lib_green_900),

    LIGHT_GREEN_500(R.style._ColorsTheme_Primary_LightGreen_500, R.color._color_lib_light_green_500, R.color._color_lib_light_green_700),
    LIGHT_GREEN_600(R.style._ColorsTheme_Primary_LightGreen_600, R.color._color_lib_light_green_600, R.color._color_lib_light_green_800),
    LIGHT_GREEN_700(R.style._ColorsTheme_Primary_LightGreen_700, R.color._color_lib_light_green_700, R.color._color_lib_light_green_900),
    LIGHT_GREEN_800(R.style._ColorsTheme_Primary_LightGreen_800, R.color._color_lib_light_green_500, R.color._color_lib_light_green_900),

    LIME_500(R.style._ColorsTheme_Primary_Lime_500, R.color._color_lib_lime_500, R.color._color_lib_lime_700),
    LIME_600(R.style._ColorsTheme_Primary_Lime_600, R.color._color_lib_lime_600, R.color._color_lib_lime_800),
    LIME_700(R.style._ColorsTheme_Primary_Lime_700, R.color._color_lib_lime_700, R.color._color_lib_lime_900),
    LIME_800(R.style._ColorsTheme_Primary_Lime_800, R.color._color_lib_lime_500, R.color._color_lib_lime_900),

    YELLOW_500(R.style._ColorsTheme_Primary_Yellow_500, R.color._color_lib_yellow_500, R.color._color_lib_yellow_700),
    YELLOW_600(R.style._ColorsTheme_Primary_Yellow_600, R.color._color_lib_yellow_600, R.color._color_lib_yellow_800),
    YELLOW_700(R.style._ColorsTheme_Primary_Yellow_700, R.color._color_lib_yellow_700, R.color._color_lib_yellow_900),
    YELLOW_800(R.style._ColorsTheme_Primary_Yellow_800, R.color._color_lib_yellow_500, R.color._color_lib_yellow_900),

    AMBER_500(R.style._ColorsTheme_Primary_Amber_500, R.color._color_lib_amber_500, R.color._color_lib_amber_700),
    AMBER_600(R.style._ColorsTheme_Primary_Amber_600, R.color._color_lib_amber_600, R.color._color_lib_amber_800),
    AMBER_700(R.style._ColorsTheme_Primary_Amber_700, R.color._color_lib_amber_700, R.color._color_lib_amber_900),
    AMBER_800(R.style._ColorsTheme_Primary_Amber_800, R.color._color_lib_amber_500, R.color._color_lib_amber_900),

    ORANGE_500(R.style._ColorsTheme_Primary_Orange_500, R.color._color_lib_orange_500, R.color._color_lib_orange_700),
    ORANGE_600(R.style._ColorsTheme_Primary_Orange_600, R.color._color_lib_orange_600, R.color._color_lib_orange_800),
    ORANGE_700(R.style._ColorsTheme_Primary_Orange_700, R.color._color_lib_orange_700, R.color._color_lib_orange_900),
    ORANGE_800(R.style._ColorsTheme_Primary_Orange_800, R.color._color_lib_orange_500, R.color._color_lib_orange_900),

    DEEP_ORANGE_500(R.style._ColorsTheme_Primary_DeepOrange_500, R.color._color_lib_deep_orange_500, R.color._color_lib_deep_orange_700),
    DEEP_ORANGE_600(R.style._ColorsTheme_Primary_DeepOrange_600, R.color._color_lib_deep_orange_600, R.color._color_lib_deep_orange_800),
    DEEP_ORANGE_700(R.style._ColorsTheme_Primary_DeepOrange_700, R.color._color_lib_deep_orange_700, R.color._color_lib_deep_orange_900),
    DEEP_ORANGE_800(R.style._ColorsTheme_Primary_DeepOrange_800, R.color._color_lib_deep_orange_500, R.color._color_lib_deep_orange_900),

    BROWN_500(R.style._ColorsTheme_Primary_Brown_500, R.color._color_lib_brown_500, R.color._color_lib_brown_700),
    BROWN_600(R.style._ColorsTheme_Primary_Brown_600, R.color._color_lib_brown_600, R.color._color_lib_brown_800),
    BROWN_700(R.style._ColorsTheme_Primary_Brown_700, R.color._color_lib_brown_700, R.color._color_lib_brown_900),
    BROWN_800(R.style._ColorsTheme_Primary_Brown_800, R.color._color_lib_brown_500, R.color._color_lib_brown_900),

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
