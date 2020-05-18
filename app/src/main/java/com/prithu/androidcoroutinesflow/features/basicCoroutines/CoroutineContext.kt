package com.prithu.androidcoroutinesflow.features.basicCoroutines

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch(CoroutineName("Prithu's coroutine")) {
            println("This is running from ${this.coroutineContext.get(CoroutineName.Key)}")
        }
    }
}