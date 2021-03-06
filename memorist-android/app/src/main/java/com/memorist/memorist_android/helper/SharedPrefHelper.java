package com.memorist.memorist_android.helper;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * This class contains shortcut functions for shared preferences utilities.
 */
public class SharedPrefHelper {

    // Database table name used in shared preferences.
    private static final String PREFS_NAME = "com.memorist.memorist_android";

    // Key value used in storing token address.
    private static final String USER_TOKEN = "user_token";

    // Key value used in storing user id.
    private static final String USER_ID = "user_id";

    public static String getUserToken(Context context) {
        return getStringValue(context, USER_TOKEN);
    }

    public static void setUserToken(Context context, String value) {
        setStringValue(context, USER_TOKEN, value);
    }

    public static int getUserId(Context context) {
        return getIntegerValue(context, USER_ID);
    }

    public static void setUserId(Context context, int value) {
        setIntegerValue(context, USER_ID, value);
    }

    private static String getStringValue(Context context, String key) {
        SharedPreferences sharedPreferences = getPreferences(context);
        return sharedPreferences.getString(key, null);
    }

    private static void setStringValue(Context context, String key, String value) {
        SharedPreferences.Editor editor = getPreferences(context).edit();
        editor.putString(key, value);
        editor.apply();
    }

    private static int getIntegerValue(Context context, String key) {
        SharedPreferences sharedPreferences = getPreferences(context);
        return sharedPreferences.getInt(key, 0);
    }

    private static void setIntegerValue(Context context, String key, int value) {
        SharedPreferences.Editor editor = getPreferences(context).edit();
        editor.putInt(key, value);
        editor.apply();
    }

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }
}