package com.prithu.androidcoroutinesflow.features.koin.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.prithu.androidcoroutinesflow.R
import com.prithu.androidcoroutinesflow.features.koin.presenter.MockPresenter
import com.prithu.androidcoroutinesflow.features.koin.viewmodel.MockViewModel
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class KoinActivity : AppCompatActivity() {
    // Lazy injected MySimplePresenter
    val mockPresenter: MockPresenter by inject()

    // Lazy Inject ViewModel
    val myViewModel: MockViewModel by viewModel()
    val myViewModel2: MockViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin)

        var outPut = mockPresenter.sayHello()
        Log.v("Koin", outPut)

        // same viewmodel objec-reference ,need to check by debugging
        var outPutFromVM = myViewModel.sayHello()
        var outPutFromVM2 = myViewModel2.sayHello()

        Log.v("outPutFromVM", outPutFromVM.hashCode().toString())
        Log.v("outPutFromVM", outPutFromVM2.hashCode().toString())




    }
}
