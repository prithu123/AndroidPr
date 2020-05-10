package com.prithu.androidcoroutinesflow.features.koin.repository

class MockRepositoryImpl : MockRepository {
    override fun giveHello(): String {
        return "Hello Kotlin"
    }
}