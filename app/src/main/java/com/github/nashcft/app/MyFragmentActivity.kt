package com.github.nashcft.app

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.fragment.app.FragmentActivity

class MyFragmentActivity : FragmentActivity() {

    companion object {
        private const val TAG_FRAGMENT = "my_fragment"
    }

    private val viewModel: ActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_fragment)

        supportFragmentManager.apply {
            if (findFragmentByTag(TAG_FRAGMENT) == null) {
                beginTransaction()
                    .add(R.id.container, MyFragment(), TAG_FRAGMENT)
                    .commit()
            }
        }
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
