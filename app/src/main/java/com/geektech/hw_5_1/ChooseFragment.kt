package com.geektech.hw_5_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.hw_5_1.databinding.FragmentChoseBinding


class ChoseFragment : Fragment() {
    private lateinit var binding: FragmentChoseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChoseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            btnMVP.setOnClickListener {
                findNavController().navigate(R.id.MVPFragment)
            }
            btnMVVM.setOnClickListener {
                findNavController().navigate(R.id.MVVMFragment)
            }
        }
    }

}