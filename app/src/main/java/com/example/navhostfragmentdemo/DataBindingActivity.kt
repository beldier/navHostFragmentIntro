package com.example.navhostfragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.navhostfragmentdemo.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDataBindingBinding
    private lateinit var viewModel: CounterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)
        binding.lifecycleOwner = this
        viewModel = ViewModelProvider(this)[CounterViewModel::class.java]
        binding.viewModelCounter = viewModel

        binding.multipleText.visibility = View.VISIBLE
    }


}