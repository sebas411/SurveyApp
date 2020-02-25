package com.example.surveyapp

import androidx.lifecycle.ViewModel

class EncuestaViewModel : ViewModel(){
    val lista_preguntas= mutableListOf<String>()
    init{
        lista_preguntas.add("¿Tiene algun comentario o sugerencia?")
    }

}