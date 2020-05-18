package com.prithu.androidcoroutinesflow.features.basicCoroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        delay(1000)
        println("world!")
    }
    print("Hello, ")
    Thread.sleep(2000) //waiting to finish coroutines function
}