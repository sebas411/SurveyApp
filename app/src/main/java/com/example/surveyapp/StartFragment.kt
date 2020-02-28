package com.example.surveyapp

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.surveyapp.databinding.StartFragmentBinding

class StartFragment : Fragment() {
    private lateinit var viewModel: EncuestaViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding= DataBindingUtil.inflate<StartFragmentBinding>(
            inflater,
            R.layout.start_fragment,container,false
        )
        viewModel=ViewModelProviders.of(this).get(EncuestaViewModel::class.java)
        var preguntas=viewModel.lista_preguntas.value

        binding.addBtn.setOnClickListener{view:View->
            view.findNavController().navigate(StartFragmentDirections.actionStartFragmentToAddQuestionFragment(preguntas!!))
        }
        binding.iniciarBtn.setOnClickListener{view:View->
            view.findNavController().navigate(StartFragmentDirections.actionStartFragmentToQuestionFragment(
                preguntas!!
            ))
        }
        return binding.root
    }

    override fun onResume() {
        super.onResume()

    }

}
