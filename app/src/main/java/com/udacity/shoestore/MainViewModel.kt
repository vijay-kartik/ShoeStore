package com.udacity.shoestore

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class MainViewModel: ViewModel() {
    private var _shoelist = mutableListOf<Shoe>()
    var _shoe = MutableLiveData<Shoe>()
    val shoe: LiveData<Shoe>
        get() = _shoe

    fun addShoe(name: String, company: String, size: String, desc: String) {
        _shoe.value = Shoe(name, size.toDouble(), company, desc)
    }

}