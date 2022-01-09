package com.udacity.shoestore.util

import androidx.databinding.InverseMethod

object Converter {
    @InverseMethod("toLong")
    @JvmStatic fun toString(long: Double): String {
        return long.toString()
    }

    @JvmStatic fun toLong(string: String): Double {
        return string.toDouble()
    }
}