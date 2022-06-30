package com.example.navhostfragmentdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counter = MutableLiveData(0)



    fun increment(){
        counter.value = counter.value?.plus(1)
    }


}