package com.github.nashcft.app

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.viewModels

class MyComponentActivity : ComponentActivity() {

    private val viewModel: ActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component)

        viewModel.showLog("onCreate")
    }

    override fun onPause() {
        Log.d("Activity", "### Activity: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Activity", "### Activity: onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("Activity", "### Activity: onDestroy, isFinishing = $isFinishing ")
        viewModel.showLog("onDestroy")
        super.onDestroy()
    }
}
