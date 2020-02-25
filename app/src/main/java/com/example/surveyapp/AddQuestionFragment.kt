package com.example.surveyapp

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.surveyapp.databinding.AddQuestionFragmentBinding


class AddQuestionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<AddQuestionFragmentBinding>(
            inflater,
            R.layout.add_question_fragment,container,false
        )
        binding.saveBtn.setOnClickListener{view:View->
            view.findNavController().navigate(AddQuestionFragmentDirections.actionAddQuestionFragmentToStartFragment())
        }
        return binding.root
    }

}
