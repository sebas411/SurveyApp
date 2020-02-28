package com.example.surveyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.surveyapp.databinding.ResultadosFragmentBinding

class ResultadosFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=DataBindingUtil.inflate<ResultadosFragmentBinding>(
            inflater,
            R.layout.resultados_fragment,container,false
        )
        binding.newSurvey.setOnClickListener { view: View ->
            findNavController().navigate(ResultadosFragmentDirections.actionResultadosFragmentToStartFragment())
        }
        return binding.root
    }

}
