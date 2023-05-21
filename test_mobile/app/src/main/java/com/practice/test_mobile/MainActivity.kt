package com.practice.test_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.practice.test_mobile.databinding.ActivityMainBinding
import com.practice.test_mobile.ui.viewmodel.EmployeeViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val employeeViewModel: EmployeeViewModel by viewModels{
        EmployeeViewModel.Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)
    }

    override fun onBackPressed() {
    }
}