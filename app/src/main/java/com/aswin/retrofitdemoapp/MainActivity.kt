package com.aswin.retrofitdemoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import com.aswin.retrofitdemoapp.databinding.ActivityMainBinding
import com.aswin.retrofitdemoapp.model.CompaniesList
import com.aswin.retrofitdemoapp.retrofit.RetrofitInstance
import com.aswin.retrofitdemoapp.retrofit.RetrofitService
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    // Fake api Site - https://www.devtoolsdaily.com/fake_json_api/
    // api - https://testapi.devtoolsdaily.com/companies/

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Retrofit Instance
        val retrofitInstance = RetrofitInstance
            .getRetrofitInstance()
            .create(RetrofitService::class.java)

        // Live Data : Fetch Data Asynchronously
        // We need to add dependency for LiveData. See README for add dependency.
        val responseLiveData : LiveData<Response<CompaniesList>> =
            liveData {
                val response = retrofitInstance.getAllCompanies()
                emit(response)
            }

        // Observing data changes in LiveData
        responseLiveData.observe(this, Observer{
            // execute this code when the LiveData's value changes
            val companyList = it.body()?.listIterator()

            if (companyList != null) {
                while (companyList.hasNext()) {
                    val albumItem = companyList.next()
                    val result = "ComName: ${albumItem.name} \n"
                    Log.d("TAGGY", " $result")
                    binding.tvResult.append("ComName: "+albumItem.name + "\n")
                }
            }
        })
    }
}