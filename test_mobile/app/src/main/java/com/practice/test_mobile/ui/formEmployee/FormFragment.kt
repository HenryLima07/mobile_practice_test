package com.practice.test_mobile.ui.formEmployee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.practice.test_mobile.databinding.FragmentFormBinding
import com.practice.test_mobile.ui.viewmodel.EmployeeViewModel


/**
    Form to add new employee information
 */
class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding
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
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(inflater, container, false)
        return binding.root
    }

}