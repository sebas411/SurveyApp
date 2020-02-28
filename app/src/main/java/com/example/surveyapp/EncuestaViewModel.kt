package com.example.surveyapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EncuestaViewModel : ViewModel(){
    val lista_preguntas= MutableLiveData<String>()
    init{
        lista_preguntas.value="¿Tiene algún comentario o sugerencia?"
    }



}