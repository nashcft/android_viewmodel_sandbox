package com.github.nashcft.app

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class FragmentViewModel : ViewModel() {

    fun showLog(message: String) {
        var executed = false
        viewModelScope.launch {
            Log.d("Fragment ViewModel", "### FragmentViewModel: $message")
            executed = true
        }
        Log.d(
            "Fragment ViewModel",
            "### FragmentViewModel: coroutine executed = $executed"
        )
    }

    override fun onCleared() {
        val st = Thread.currentThread().stackTrace
        val e = Exception().apply { stackTrace = st }
        Log.d("Fragment ViewModel", "### FragmentViewModel: onCleared", e)
        super.onCleared()
    }
}
