package com.cov.covid.ui.story

import android.app.Activity
import android.os.Bundle
import android.view.Window
import com.cov.covid.R

class StoryUpdateActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experience_update)



    }
}