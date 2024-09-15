package kr.lul.template.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor() : ViewModel() {
    companion object {
        private const val TAG = "SecondViewModel"
    }

    init {
        Log.d(TAG, "#init called.")
    }
}