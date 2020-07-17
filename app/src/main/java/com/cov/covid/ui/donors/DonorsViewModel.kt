package com.cov.covid.ui.donors

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DonorsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Donors Fragment"
    }
    val text: LiveData<String> = _text
}