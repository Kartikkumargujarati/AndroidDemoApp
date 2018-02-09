package com.kartik.androiddemoapp.app.features

import android.content.Intent
import android.os.Bundle
import com.kartik.androiddemoapp.R
import com.kartik.androiddemoapp.app.features.base.BaseActivity
import com.kartik.androiddemoapp.app.features.login.LoginActivity
import com.kartik.androiddemoapp.utils.LogUtils.makeLogTag

class SplashScreenActivity : BaseActivity() {

    private val TAG = makeLogTag(SplashScreenActivity::class.java)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (shouldShowOnboardingFragment()) {
            startActivity(Intent(this, LoginActivity::class.java))

        }
    }


    private fun shouldShowOnboardingFragment(): Boolean {
        //if this is first time opening the app, return true, else false
        return true
    }

}
