package com.example.onlinestore.ui.fragments.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.onlinestore.core.base.BaseViewModel

class HomeViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}