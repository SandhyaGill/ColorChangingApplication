package com.sandhyagill.colorchangingapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ColorViewModel: ViewModel() {
    var color : MutableLiveData<Int> = MutableLiveData()
}