package com.udacity.shoestore

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class MainViewModel: ViewModel() {
    private var _shoelist = MutableLiveData(mutableListOf<Shoe>())
    val shoelist: LiveData<MutableList<Shoe>>
        get() = _shoelist

    fun addShoe(name: String, company: String, size: String, desc: String) {
        _shoelist.value?.add(Shoe(name, size.toDouble(), company, desc))
    }

}