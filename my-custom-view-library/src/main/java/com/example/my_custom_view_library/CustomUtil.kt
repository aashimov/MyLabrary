package com.example.my_custom_view_library

class CustomUtil {
    private val math = Math()

    fun add(a: Int, b: Int): Int {
        return math.add(a, b)
    }

    fun subtract(a: Int, b: Int): Int {
        return math.subtract(a, b)
    }

    fun multiply(a: Int, b: Int): Int {
        return math.multiply(a, b)
    }
}