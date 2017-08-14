package com.marverenic.demo.colors;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import com.marverenic.colors.AccentColor;
import com.marverenic.colors.ColorTheme;
import com.marverenic.colors.Colors;
import com.marverenic.colors.NightMode;
import com.marverenic.colors.PrimaryColor;
import com.marverenic.colors.activity.ColorsAppCompatActivity;

public class MainActivity extends ColorsAppCompatActivity {

    private Spinner mPrimarySpinner;
    private Spinner mAccentSpinner;
    private Spinner mNightModeSpinner;
    private Button mRandomButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPrimarySpinner = (Spinner) findViewById(R.id.spinnerPrimary);
        mAccentSpinner = (Spinner) findViewById(R.id.spinnerAccent);
        mNightModeSpinner = (Spinner) findViewById(R.id.spinnerNightMode);
        mRandomButton = (Button) findViewById(R.id.buttonRandom);

        mPrimarySpinner.setAdapter(new EnumAdapter<>(PrimaryColor.values()));
        mAccentSpinner.setAdapter(new EnumAdapter<>(AccentColor.values()));
        mNightModeSpinner.setAdapter(new EnumAdapter<>(NightMode.values()));

        setupCallbacks();
    }

    @Override
    protected void onResume() {
        super.onResume();

        int primary = indexOf(PrimaryColor.values(), Colors.getTheme().getPrimaryColor());
        int accent = indexOf(AccentColor.values(), Colors.getTheme().getAccentColor());
        int nightMode = indexOf(NightMode.values(), Colors.getTheme().getNightMode());

        mPrimarySpinner.setSelection(primary);
        mAccentSpinner.setSelection(accent);
        mNightModeSpinner.setSelection(nightMode);
    }

    private static <T> int indexOf(T[] arr, T val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    private void setupCallbacks() {
        mPrimarySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PrimaryColor primaryColor = PrimaryColor.values()[position];
                ColorTheme currentTheme = Colors.getTheme();

                if (primaryColor != currentTheme.getPrimaryColor()) {
                    ColorTheme theme = new ColorTheme(primaryColor, currentTheme.getAccentColor());
                    Colors.setTheme(theme);
                    recreate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        mAccentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                AccentColor accentColor = AccentColor.values()[position];
                ColorTheme currentTheme = Colors.getTheme();

                if (accentColor != currentTheme.getAccentColor()) {
                    ColorTheme theme = new ColorTheme(currentTheme.getPrimaryColor(), accentColor);
                    Colors.setTheme(theme);
                    recreate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        mNightModeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                NightMode nightMode = NightMode.values()[position];
                ColorTheme currentTheme = Colors.getTheme();

                if (nightMode != currentTheme.getNightMode()) {
                    ColorTheme theme = new ColorTheme(currentTheme.getPrimaryColor(),
                            currentTheme.getAccentColor(), nightMode);
                    Colors.setTheme(theme);
                    recreate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        mRandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomizeTheme();
            }
        });
    }

    private void randomizeTheme() {
        PrimaryColor[] primaryColors = PrimaryColor.values();
        AccentColor[] accentColors = AccentColor.values();
        NightMode[] nightModes = NightMode.values();

        int whichPrimary = (int) (Math.random() * primaryColors.length);
        int whichAccent = (int) (Math.random() * accentColors.length);
        int whichNightMode = (int) (Math.random() * nightModes.length);

        ColorTheme random = new ColorTheme(primaryColors[whichPrimary], accentColors[whichAccent],
                nightModes[whichNightMode]);
        Colors.setTheme(random);
        recreate();
    }
}
