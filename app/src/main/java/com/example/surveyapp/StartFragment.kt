package com.example.surveyapp

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.surveyapp.databinding.StartFragmentBinding
import kotlinx.android.synthetic.main.start_fragment.*

class StartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding= DataBindingUtil.inflate<StartFragmentBinding>(
            inflater,
            R.layout.start_fragment,container,false
        )
        binding.addBtn.setOnClickListener{view:View->
            view.findNavController().navigate(R.id.action_startFragment_to_addQuestionFragment)
        }
        binding.iniciarBtn.setOnClickListener{view:View->
            view.findNavController().navigate(R.id.action_startFragment_to_questionFragment)
        }
        return binding.root
    }


}
