package com.prithu.androidcoroutinesflow.features.koin.presenter

import com.prithu.androidcoroutinesflow.features.koin.repository.MockRepository

class MockPresenter(val repo: MockRepository) {

    fun sayHello() = "${repo.giveHello()} from $this"
}