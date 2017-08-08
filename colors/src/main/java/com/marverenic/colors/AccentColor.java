package com.marverenic.colors;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;

public enum AccentColor implements Parcelable {

    RED_A100("Red A100", R.style._ColorsTheme_Accent_Red_A100, R.color._color_lib_red_A100),
    RED_A200("Red A200", R.style._ColorsTheme_Accent_Red_A200, R.color._color_lib_red_A200),
    RED_A400("Red A400", R.style._ColorsTheme_Accent_Red_A400, R.color._color_lib_red_A400),
    RED_A700("Red A700", R.style._ColorsTheme_Accent_Red_A700, R.color._color_lib_red_A700),

    PINK_A100("Pink A100", R.style._ColorsTheme_Accent_Pink_A100, R.color._color_lib_pink_A100),
    PINK_A200("Pink A200", R.style._ColorsTheme_Accent_Pink_A200, R.color._color_lib_pink_A200),
    PINK_A400("Pink A400", R.style._ColorsTheme_Accent_Pink_A400, R.color._color_lib_pink_A400),
    PINK_A700("Pink A700", R.style._ColorsTheme_Accent_Pink_A700, R.color._color_lib_pink_A700),

    PURPLE_A100("Purple A100", R.style._ColorsTheme_Accent_Purple_A100, R.color._color_lib_purple_A100),
    PURPLE_A200("Purple A200", R.style._ColorsTheme_Accent_Purple_A200, R.color._color_lib_purple_A200),
    PURPLE_A400("Purple A400", R.style._ColorsTheme_Accent_Purple_A400, R.color._color_lib_purple_A400),
    PURPLE_A700("Purple A700", R.style._ColorsTheme_Accent_Purple_A700, R.color._color_lib_purple_A700),

    DEEP_PURPLE_A100("Deep Purple A100", R.style._ColorsTheme_Accent_DeepPurple_A100, R.color._color_lib_deep_purple_A100),
    DEEP_PURPLE_A200("Deep Purple A200", R.style._ColorsTheme_Accent_DeepPurple_A200, R.color._color_lib_deep_purple_A200),
    DEEP_PURPLE_A400("Deep Purple A400", R.style._ColorsTheme_Accent_DeepPurple_A400, R.color._color_lib_deep_purple_A400),
    DEEP_PURPLE_A700("Deep Purple A700", R.style._ColorsTheme_Accent_DeepPurple_A700, R.color._color_lib_deep_purple_A700),

    INDIGO_A100("Indigo A100", R.style._ColorsTheme_Accent_Indigo_A100, R.color._color_lib_indigo_A100),
    INDIGO_A200("Indigo A200", R.style._ColorsTheme_Accent_Indigo_A200, R.color._color_lib_indigo_A200),
    INDIGO_A400("Indigo A400", R.style._ColorsTheme_Accent_Indigo_A400, R.color._color_lib_indigo_A400),
    INDIGO_A700("Indigo A700", R.style._ColorsTheme_Accent_Indigo_A700, R.color._color_lib_indigo_A700),

    BLUE_A100("Blue A100", R.style._ColorsTheme_Accent_Blue_A100, R.color._color_lib_blue_A100),
    BLUE_A200("Blue A200", R.style._ColorsTheme_Accent_Blue_A200, R.color._color_lib_blue_A200),
    BLUE_A400("Blue A400", R.style._ColorsTheme_Accent_Blue_A400, R.color._color_lib_blue_A400),
    BLUE_A700("Blue A700", R.style._ColorsTheme_Accent_Blue_A700, R.color._color_lib_blue_A700),

    LIGHT_BLUE_A100("Light Blue A100", R.style._ColorsTheme_Accent_LightBlue_A100, R.color._color_lib_light_blue_A100),
    LIGHT_BLUE_A200("Light Blue A200", R.style._ColorsTheme_Accent_LightBlue_A200, R.color._color_lib_light_blue_A200),
    LIGHT_BLUE_A400("Light Blue A400", R.style._ColorsTheme_Accent_LightBlue_A400, R.color._color_lib_light_blue_A400),
    LIGHT_BLUE_A700("Light Blue A700", R.style._ColorsTheme_Accent_LightBlue_A700, R.color._color_lib_light_blue_A700),

    CYAN_A100("Cyan A100", R.style._ColorsTheme_Accent_Cyan_A100, R.color._color_lib_cyan_A100),
    CYAN_A200("Cyan A200", R.style._ColorsTheme_Accent_Cyan_A200, R.color._color_lib_cyan_A200),
    CYAN_A400("Cyan A400", R.style._ColorsTheme_Accent_Cyan_A400, R.color._color_lib_cyan_A400),
    CYAN_A700("Cyan A700", R.style._ColorsTheme_Accent_Cyan_A700, R.color._color_lib_cyan_A700),

    TEAL_A100("Teal A100", R.style._ColorsTheme_Accent_Teal_A100, R.color._color_lib_teal_A100),
    TEAL_A200("Teal A200", R.style._ColorsTheme_Accent_Teal_A200, R.color._color_lib_teal_A200),
    TEAL_A400("Teal A400", R.style._ColorsTheme_Accent_Teal_A400, R.color._color_lib_teal_A400),
    TEAL_A700("Teal A700", R.style._ColorsTheme_Accent_Teal_A700, R.color._color_lib_teal_A700),

    GREEN_A100("Green A100", R.style._ColorsTheme_Accent_Green_A100, R.color._color_lib_green_A100),
    GREEN_A200("Green A200", R.style._ColorsTheme_Accent_Green_A200, R.color._color_lib_green_A200),
    GREEN_A400("Green A400", R.style._ColorsTheme_Accent_Green_A400, R.color._color_lib_green_A400),
    GREEN_A700("Green A700", R.style._ColorsTheme_Accent_Green_A700, R.color._color_lib_green_A700),

    LIGHT_GREEN_A100("Light Green A100", R.style._ColorsTheme_Accent_LightGreen_A100, R.color._color_lib_light_green_A100),
    LIGHT_GREEN_A200("Light Green A200", R.style._ColorsTheme_Accent_LightGreen_A200, R.color._color_lib_light_green_A200),
    LIGHT_GREEN_A400("Light Green A400", R.style._ColorsTheme_Accent_LightGreen_A400, R.color._color_lib_light_green_A400),
    LIGHT_GREEN_A700("Light Green A700", R.style._ColorsTheme_Accent_LightGreen_A700, R.color._color_lib_light_green_A700),

    LIME_A100("Lime A100", R.style._ColorsTheme_Accent_Lime_A100, R.color._color_lib_lime_A100),
    LIME_A200("Lime A200", R.style._ColorsTheme_Accent_Lime_A200, R.color._color_lib_lime_A200),
    LIME_A400("Lime A400", R.style._ColorsTheme_Accent_Lime_A400, R.color._color_lib_lime_A400),
    LIME_A700("Lime A700", R.style._ColorsTheme_Accent_Lime_A700, R.color._color_lib_lime_A700),

    YELLOW_A100("Yellow A100", R.style._ColorsTheme_Accent_Yellow_A100, R.color._color_lib_yellow_A100),
    YELLOW_A200("Yellow A200", R.style._ColorsTheme_Accent_Yellow_A200, R.color._color_lib_yellow_A200),
    YELLOW_A400("Yellow A400", R.style._ColorsTheme_Accent_Yellow_A400, R.color._color_lib_yellow_A400),
    YELLOW_A700("Yellow A700", R.style._ColorsTheme_Accent_Yellow_A700, R.color._color_lib_yellow_A700),

    AMBER_A100("Amber A100", R.style._ColorsTheme_Accent_Amber_A100, R.color._color_lib_amber_A100),
    AMBER_A200("Amber A200", R.style._ColorsTheme_Accent_Amber_A200, R.color._color_lib_amber_A200),
    AMBER_A400("Amber A400", R.style._ColorsTheme_Accent_Amber_A400, R.color._color_lib_amber_A400),
    AMBER_A700("Amber A700", R.style._ColorsTheme_Accent_Amber_A700, R.color._color_lib_amber_A700),

    ORANGE_A100("Orange A100", R.style._ColorsTheme_Accent_Orange_A100, R.color._color_lib_orange_A100),
    ORANGE_A200("Orange A200", R.style._ColorsTheme_Accent_Orange_A200, R.color._color_lib_orange_A200),
    ORANGE_A400("Orange A400", R.style._ColorsTheme_Accent_Orange_A400, R.color._color_lib_orange_A400),
    ORANGE_A700("Orange A700", R.style._ColorsTheme_Accent_Orange_A700, R.color._color_lib_orange_A700),

    DEEP_ORANGE_A100("Deep Orange A100", R.style._ColorsTheme_Accent_DeepOrange_A100, R.color._color_lib_deep_orange_A100),
    DEEP_ORANGE_A200("Deep Orange A200", R.style._ColorsTheme_Accent_DeepOrange_A200, R.color._color_lib_deep_orange_A200),
    DEEP_ORANGE_A400("Deep Orange A400", R.style._ColorsTheme_Accent_DeepOrange_A400, R.color._color_lib_deep_orange_A400),
    DEEP_ORANGE_A700("Deep Orange A700", R.style._ColorsTheme_Accent_DeepOrange_A700, R.color._color_lib_deep_orange_A700),

    ;

    private final String mId;

    @StyleRes private final int mTheme;
    @ColorRes private final int mAccentColorRes;

    AccentColor(String id, @StyleRes int theme, @ColorRes int accentColorRes) {
        mId = id;
        mTheme = theme;
        mAccentColorRes = accentColorRes;
    }

    public static AccentColor findById(@NonNull String id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }

        for (AccentColor color : values()) {
            if (color.getId().equals(id)) {
                return color;
            }
        }

        throw new IllegalArgumentException("An AccentColor with '" + id + "' does not exist");
    }

    public String getId() {
        return mId;
    }

    @StyleRes
    protected int getThemeRes() {
        return mTheme;
    }

    @ColorRes
    public int getAccentColorRes() {
        return mAccentColorRes;
    }

    @Override
    public String toString() {
        return mId;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getId());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AccentColor> CREATOR = new Creator<AccentColor>() {
        @Override
        public AccentColor createFromParcel(Parcel in) {
            return findById(in.readString());
        }

        @Override
        public AccentColor[] newArray(int size) {
            return new AccentColor[size];
        }
    };
}
