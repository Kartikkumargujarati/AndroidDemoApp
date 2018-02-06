package com.kartik.androiddemoapp.app.features.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kartik.androiddemoapp.app.features.MainActivity;

import java.util.HashMap;
import java.util.Map;

import static com.kartik.androiddemoapp.utils.LogUtils.makeLogTag;

/**
 * Created by Kartik Kumar Gujarati on 2/5/18 9:18 PM
 * Copyright (c) 2018. All rights reserved.
 */

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = makeLogTag(BaseActivity.class);

    // SNACK BAR DURATION
    public static final int SNACKBAR_DURATION = 5000;

    private final Map<Integer, ProgressDialog> mProgressDialogs = new HashMap<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (shouldShowOnboardingFragment()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
            return;

        } else {
            //showLoginActivity
        }

    }


    @Override
    public void onBackPressed() {

        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStackImmediate();
        } else {
            super.onBackPressed();
        }
    }


    private boolean shouldShowOnboardingFragment() {
        //if this is first time opening the app, return true, else false
        return true;
    }


    public void startActivity(final Intent intent) {
        super.startActivity(intent);
    }

}