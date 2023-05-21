package com.practice.test_mobile.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.practice.test_mobile.Data.Model.EmployeeModel
import com.practice.test_mobile.R
import com.practice.test_mobile.databinding.FragmentMainBinding
import com.practice.test_mobile.ui.viewmodel.EmployeeViewModel


/**
 Main application view
 */
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val employeeViewModel: EmployeeViewModel by activityViewModels{
        EmployeeViewModel.Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

}