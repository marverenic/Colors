package com.marverenic.colors;

import android.app.Activity;
import android.content.res.Resources;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ColorsTest {

    private Activity mActivity;
    private Resources.Theme mTheme;

    @Before
    public void setUp() {
        mActivity = mock(Activity.class);
        mTheme = mock(Resources.Theme.class);

        when(mActivity.getTheme()).thenReturn(mTheme);
    }

    @Test(expected = IllegalStateException.class)
    public void testThemeThrowsWhenThemeNotSpecified() {
        Colors.theme(mActivity);
    }

    @Test
    public void testThemeAppliesStyles() {
        Colors.setTheme(PrimaryColor.INDIGO_500, AccentColor.PINK_A400);

        assertThat(Colors.getTheme().getPrimaryColor()).isEqualTo(PrimaryColor.INDIGO_500);
        assertThat(Colors.getTheme().getAccentColor()).isEqualTo(AccentColor.PINK_A400);

        Colors.theme(mActivity);

        InOrder inOrder = inOrder(mTheme);
        inOrder.verify(mTheme).applyStyle(R.style._ColorsTheme_Primary_Indigo_500, true);
        inOrder.verify(mTheme).applyStyle(R.style._ColorsTheme_Accent_Pink_A400, true);
        inOrder.verifyNoMoreInteractions();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetThemeThrowsForNullPrimaryColor() {
        //noinspection ConstantConditions
        Colors.setTheme(null, AccentColor.AMBER_A200);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetThemeThrowsForNullAccentColor() {
        //noinspection ConstantConditions
        Colors.setTheme(PrimaryColor.RED_500, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetThemeThrowsForNullTheme() {
        //noinspection ConstantConditions
        Colors.setTheme(null);
    }

}
