package com.github.nashcft.app

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class MyFragment : Fragment(R.layout.fragment_my) {

    private val viewModel: FragmentViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.showLog("onViewCreated")
    }

    override fun onPause() {
        Log.d("Fragment", "### Fragment: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Fragment", "### Fragment: onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Fragment", "### Fragment: onDestroyView")
        viewModel.showLog("onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("Fragment", "### Fragment: onDestroy")
        viewModel.showLog("onDestroy")
        super.onDestroy()
    }
}
