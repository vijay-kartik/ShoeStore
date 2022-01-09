package com.udacity.shoestore.util

import androidx.databinding.InverseMethod

object Converter {
    @InverseMethod("toDouble")
    @JvmStatic fun toString(long: Double): String {
        return long.toString()
    }

    @JvmStatic fun toDouble(string: String): Double {
        return string.toDouble()
    }
}