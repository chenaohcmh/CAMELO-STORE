package com.example.camelostore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Prom_DiaFragment: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView (
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        val fragmento =inflater.inflate(R.layout.fragment_prom_dia,container,false)

        //var tarea=requireArguments().getString("tarea")
        //var txtviewtarea:TextView=fragmento.findViewById(R.id.editTextTextPersonName4)
        //txtviewtarea.text=tarea




        return fragmento
    }

}