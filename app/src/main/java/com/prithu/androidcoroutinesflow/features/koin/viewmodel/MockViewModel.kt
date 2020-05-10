package com.prithu.androidcoroutinesflow.features.koin.viewmodel

import androidx.lifecycle.ViewModel
import com.prithu.androidcoroutinesflow.features.koin.repository.MockRepository

class MockViewModel(val repo: MockRepository) : ViewModel() {
    fun sayHello() = "${repo.giveHello()} from $this"

}