package com.example.ayiks.security;

import android.content.Context;
import android.content.SharedPreferences;

public class PinManager {

    private static final String PREF_NAME = "MyPrefs";
    private static final String PIN_KEY = "adminPin";
    private final SharedPreferences sharedPreferences;

    public PinManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public boolean isPinSet() {
        return sharedPreferences.contains(PIN_KEY);
    }

    public boolean validatePin(String pin) {
        String savedPin = sharedPreferences.getString(PIN_KEY, null);
        return savedPin != null && savedPin.equals(pin);
    }

    public void savePin(String pin) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PIN_KEY, pin);
        editor.apply();
    }
}