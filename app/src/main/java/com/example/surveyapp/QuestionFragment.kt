package com.example.surveyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.surveyapp.databinding.QuestionFragmentBinding


class QuestionFragment : Fragment() {
    var counter=0
    val args=QuestionFragmentArgs.fromBundle(arguments!!)
    lateinit var preg:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding=DataBindingUtil.inflate<QuestionFragmentBinding>(
            inflater,
            R.layout.question_fragment,container,false
        )
        preg=binding.textoPregunta
        binding.sigBtn.setOnClickListener{view:View->
            sig()
        }
        ask()
        return binding.root
    }
    fun ask(){
        var pregunta=args.listas[counter]
        preg.setText(pregunta)
    }
    fun sig(){
        if (counter!=args.listas.size) {
            counter++
            ask()
        }else{
            view?.findNavController()?.navigate(QuestionFragmentDirections.actionQuestionFragmentToResultadosFragment())
        }
    }

}
