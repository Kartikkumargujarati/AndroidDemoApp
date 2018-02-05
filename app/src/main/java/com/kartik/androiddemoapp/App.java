package com.kartik.androiddemoapp;

import android.app.Application;

/**
 * Created by Kartik Kumar Gujarati on 2/5/18 5:36 PM
 * Copyright (c) 2018. All rights reserved.
 */

public class App extends Application {

    private static App sInstance;

    public static App getInstance() {
        return sInstance;
    }

    public App() {
        sInstance = this;
    }

}
