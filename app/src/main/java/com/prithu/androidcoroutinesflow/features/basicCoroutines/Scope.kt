package com.prithu.androidcoroutinesflow.features.basicCoroutines

import kotlinx.coroutines.*

fun main() {
    println("start before runBlocking")
    runBlocking {
        launch {
            delay(1000)
            println("run from runBlocking")
        }
        GlobalScope.launch {
            delay(500)
            println("run from Global scope")
        }
        coroutineScope {
            delay(2000)
            println("run from Coroutinescope")
        }

    }
    println("start after runBlocking")

}