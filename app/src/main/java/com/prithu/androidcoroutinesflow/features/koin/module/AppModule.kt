package com.prithu.androidcoroutinesflow.features.koin.module

import com.prithu.androidcoroutinesflow.features.koin.presenter.MockPresenter
import com.prithu.androidcoroutinesflow.features.koin.repository.MockRepository
import com.prithu.androidcoroutinesflow.features.koin.repository.MockRepositoryImpl
import com.prithu.androidcoroutinesflow.features.koin.viewmodel.MockViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

@JvmField
val appModule = module {
    // single instance of HelloRepository
    single<MockRepository> { MockRepositoryImpl() }

    // Simple Presenter Factory
    factory { MockPresenter(get()) }

    // MyViewModel ViewModel
    viewModel { MockViewModel(get()) }
}
