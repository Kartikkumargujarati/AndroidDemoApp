package com.kartik.androiddemoapp.widgets;

import android.app.ProgressDialog;
import android.content.Context;

import com.kartik.androiddemoapp.R;

/**
 * Created by Kartik Kumar Gujarati on 2/5/18 9:41 PM
 * Copyright (c) 2018. All rights reserved.
 */

public class CustomProgressBar {

    private final ProgressDialog mProgressDialog;

    /**
     * This is a spinner widget to display a full screen progress bar spinner along with a message.
     */
    public CustomProgressBar (final Context context, final String message) {

        mProgressDialog = new ProgressDialog(context, R.style.CustomProgressSpinnerThemeFullScreen);

        //show a spinner without message
        if (message != null && !message.isEmpty()) {
            mProgressDialog.setIndeterminate(true);
            mProgressDialog.setMessage(message);
        }

        mProgressDialog.setCancelable(false);
        mProgressDialog.setProgressStyle(android.R.style.Widget_ProgressBar_Large);
    }

    public ProgressDialog getProgressBar(){
        return mProgressDialog;
    }

    public void showProgressDialog(){
        mProgressDialog.show();
    }

    public void dismissProgressDialog(){
        mProgressDialog.dismiss();
    }

    public Boolean isProgressDialogShowing() {
        return mProgressDialog.isShowing();
    }

}
