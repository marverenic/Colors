package com.marverenic.colors.activity;

import android.app.Activity;
import android.content.res.Resources;

import com.marverenic.colors.AccentColor;
import com.marverenic.colors.Colors;
import com.marverenic.colors.PrimaryColor;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ColorsActivityDelegateTest {

    private Activity mActivity;
    private ColorsActivityDelegate mDelegate;

    @Before
    public void setUp() {
        mActivity = mock(Activity.class);
        when(mActivity.getTheme()).thenReturn(mock(Resources.Theme.class));

        mDelegate = new ColorsActivityDelegate(mActivity);
    }

    @Test
    public void testThemeChangesRecreateActivity() {
        Colors.setTheme(PrimaryColor.RED_500, AccentColor.AMBER_A100);
        mDelegate.onCreate();

        Colors.setTheme(PrimaryColor.RED_500, AccentColor.AMBER_A200);
        mDelegate.onResume();

        verify(mActivity).recreate();
    }

    @Test
    public void testActivityNotRecreatedWithNoThemeChange() {
        Colors.setTheme(PrimaryColor.RED_500, AccentColor.AMBER_A100);
        mDelegate.onCreate();
        mDelegate.onResume();

        verify(mActivity, never()).recreate();
    }

    @Test
    public void testActivityNotRecreatedWithIntermediateThemeChange() {
        Colors.setTheme(PrimaryColor.RED_500, AccentColor.AMBER_A100);
        mDelegate.onCreate();

        Colors.setTheme(PrimaryColor.AMBER_500, AccentColor.BLUE_A100);
        Colors.setTheme(PrimaryColor.RED_500, AccentColor.AMBER_A100);
        mDelegate.onResume();

        verify(mActivity, never()).recreate();
    }

}
