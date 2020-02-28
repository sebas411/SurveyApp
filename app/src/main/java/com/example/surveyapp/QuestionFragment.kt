package com.example.surveyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.surveyapp.databinding.QuestionFragmentBinding


class QuestionFragment : Fragment() {
    val args:QuestionFragmentArgs by navArgs()
    lateinit var preg:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding=DataBindingUtil.inflate<QuestionFragmentBinding>(
            inflater,
            R.layout.question_fragment,container,false
        )
        preg=binding.textoPregunta
        preg.setText(args.pregunta)
        binding.sigBtn.setOnClickListener{view:View->
            sigAction()
        }
        return binding.root
    }
    fun sigAction(){
        findNavController().navigate(QuestionFragmentDirections.actionQuestionFragmentToResultadosFragment())
    }

}
