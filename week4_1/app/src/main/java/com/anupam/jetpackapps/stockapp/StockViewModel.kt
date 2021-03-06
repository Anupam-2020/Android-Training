package com.anupam.jetpackapps.stockapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StockViewModel: ViewModel() {

    private val _loginCheck: MutableLiveData<Int> = MutableLiveData()
    private val _userName: MutableLiveData<String> = MutableLiveData()
    private val _password: MutableLiveData<String> = MutableLiveData()

    val loginCheck : LiveData<Int> = _loginCheck
    val userName : LiveData<String> = _userName
    val password : LiveData<String> = _password

    fun onLogin() {
        Log.i("@anu", "User Logged In")
        Log.i("@anu","Password - ${password.value}")
        Log.i("@anu","UserName - ${userName.value}")

        if(userName.value == "android" && password.value == "android") {
            _loginCheck.value = 100
        }
        else {
            _loginCheck.value = -100
        }
    }

    fun updateUserName(st : String) {
        _userName.value = st
    }

    fun updatePassword(st : String) {
        _password.value = st
    }
}
