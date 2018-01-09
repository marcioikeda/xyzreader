package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    public static final String URL_UDACITY = "https://go.udacity.com/xyz-reader-json";
    public static final String URL_ALTERNATIVE = "https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json";

    static {
        URL url = null;
        try {
            url = new URL(URL_ALTERNATIVE );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
