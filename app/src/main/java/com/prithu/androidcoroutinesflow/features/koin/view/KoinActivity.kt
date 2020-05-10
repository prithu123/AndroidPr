package com.prithu.androidcoroutinesflow.features.koin.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.prithu.androidcoroutinesflow.R
import com.prithu.androidcoroutinesflow.features.koin.presenter.MockPresenter
import org.koin.android.ext.android.inject

class KoinActivity : AppCompatActivity() {
    // Lazy injected MySimplePresenter
    val mockPresenter: MockPresenter by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin)

        var outPut = mockPresenter.sayHello()
        Log.v("Koin", outPut)
    }
}
