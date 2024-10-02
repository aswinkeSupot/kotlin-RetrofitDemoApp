package com.aswin.retrofitdemoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.aswin.retrofitdemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Fake api Site - https://www.devtoolsdaily.com/fake_json_api/
    // api - https://testapi.devtoolsdaily.com/companies/

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}