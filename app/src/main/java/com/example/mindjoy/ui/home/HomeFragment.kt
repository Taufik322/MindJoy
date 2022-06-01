package com.example.mindjoy.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mindjoy.R
import com.example.mindjoy.databinding.FragmentHomeBinding
import com.example.mindjoy.ui.camera.CameraActivity
import com.example.mindjoy.ui.questions.QuestionActivity

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.btnCheckMental.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), QuestionActivity::class.java)
            startActivity(intent)
        }

        binding.btnCheckExpression.setOnClickListener {
            val intent = Intent(this.requireContext(), CameraActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }


}