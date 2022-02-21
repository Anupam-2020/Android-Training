package com.anupam.jetpackapps.week5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val appData = MutableLiveData<AppData>()
    val _appData : LiveData<AppData> = appData
}