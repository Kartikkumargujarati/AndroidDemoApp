package com.kartik.androiddemoapp.utils;

import android.util.Log;

import com.kartik.androiddemoapp.BuildConfig;

/**
 * Created by Kartik Kumar Gujarati on 2/5/18 5:39 PM
 * Copyright (c) 2018. All rights reserved.
 */

public class LogUtils {

    private static final String LOG_PREFIX_STRING = "AndroidDemoApp_";
    public static boolean IS_LOGGING_ENABLED = !BuildConfig.BUILD_TYPE.equalsIgnoreCase("release");
    private static final int LOG_PREFIX_LENGTH = LOG_PREFIX_STRING.length();
    private static final int MAX_LOG_TAG_LENGTH = 23;
    public static int LOG_LEVEL = android.util.Log.DEBUG;

    public static String makeLogTag(Class cls) {
        return makeLogTag(cls.getSimpleName());
    }

    public static String makeLogTag(String str) {
        if (str.length() > MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH) {
            return LOG_PREFIX_STRING + str.substring(0, MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH - 1);
        }

        return LOG_PREFIX_STRING + str;
    }

    public static void LOGD(final String tag, String message) {
        if (IS_LOGGING_ENABLED){
            if (LOG_LEVEL <= Log.DEBUG) {
                Log.d(tag, message);
            }
        }
    }
}
