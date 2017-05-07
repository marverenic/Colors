# Colors

[ ![Download](https://api.bintray.com/packages/marverenic/Colors/com.marverenic.colors/images/download.svg) ](https://bintray.com/marverenic/Colors/com.marverenic.colors/_latestVersion)

Colors is a theming library for Android. It allows your app to use over 4,000 color combinations from the [Material Design Palette](https://material.io/guidelines/style/color.html#color-color-tool) by separately picking a primary and accent color.

<p align="center">
    <img src="https://github.com/marverenic/Colors/raw/master/preview.gif">
</p>

## Gradle Installation
```
dependencies {
    compile 'com.marverenic.colors:colors:1.0'
}
```

## Usage
### Set a Theme
To use Colors, first set a global application theme. You need to do this before you show any themed Activities. A good place to set a default theme is in your `Application` class. You can set your theme with a single line of code:

```java
Colors.setTheme(PrimaryColor.INDIGO_500, AccentColor.PINK_A200);
```

### Theming an Activity
Colors only sets the primary and accent color of the theme, so build your activity as you normally would and give it a basic theme. To make Colors theme your activity, simply make your activity extend from either `ColorsActivity` or `ColorsAppCompatActivity`.

Colors will recreate your activity if the theme was changed when your activity is returned to. To immediately apply a theme, make sure you call `recreate()` in your Activity after calling `Colors.setTheme(...)`.

#### ColorsActivityDelegate
Already extending from another library's Activity? No problem. Just create an instance of `ColorsActivityDelegate` in your Activity and call its `onCreate` and `onResume` methods as shown:

```java
public class YourActivity extends Activity {
    private ColorsActivityDelegate delegate = ...;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delegate.onCreate(); // Must be called before setContentView
        
        setContentView(...);
        ...
    }
    
    @Override
    public void onResume() {
        super.onResume();
        delegate.onResume();
        
        ...
    }
}
```

### User Theme Preferences
Colors doesn't provide a built-in way to offer the user a theme choice. Developers can build any interface to present to the user and add any number of constraints to which themes can be built.

Colors also does not save the last chosen theme automatically. If you're using `SharedPreferences`, however, you can easily save the theme:

```java
SharedPreferences prefs = ...
PrimaryColor primaryColor = PrimaryColor.INDIGO_500;
AccentColor accentColor = AccentColor.PINK_A200;

prefs.edit()
    .putString(PRIMARY_COLOR_PREF_KEY, primaryColor.getId())
    .putString(ACCENT_COLOR_PREF_KEY, accentColor.getId())
    .apply();
```

And restore it just as easily:

```java
SharedPreferences prefs = ...
PrimaryColor defaultPrimary = PrimaryColor.INDIGO_500;
AccentColor defaultAccent = AccentColor.PINK_A200;

PrimaryColor primaryColor = PrimaryColor.findById(
        prefs.getString(PRIMARY_COLOR_PREF_KEY, defaultPrimary.getId()));

AccentColor accentColor = AccentColor.findById(
        prefs.getString(ACCENT_COLOR_PREF_KEY, defaultAccent.getId()));

Colors.setTheme(primaryColor, accentColor);
```