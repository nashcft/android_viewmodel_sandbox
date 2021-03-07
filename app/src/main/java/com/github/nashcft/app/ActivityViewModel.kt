package com.github.nashcft.app

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ActivityViewModel : ViewModel() {

    fun showLog(message: String) {
        var executed = false
        viewModelScope.launch {
            Log.d("Activity ViewModel", "### ActivityViewModel: $message")
            executed = true
        }
        Log.d(
            "Activity ViewModel",
            "### ActivityViewModel: coroutine executed = $executed"
        )
    }

    override fun onCleared() {
        val st = Thread.currentThread().stackTrace
        val e = Exception().apply { stackTrace = st }
        Log.d("Activity ViewModel", "### ActivityViewModel: onCleared", e)
        super.onCleared()
    }
}
