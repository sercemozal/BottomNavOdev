package com.sercem.bottomnavodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_toplama.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*

class ToplamaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_toplama, container, false)



        tasarim.buttonTopla.setOnClickListener {

            val toplanan1 = textInputCarpan1.text.toString().toInt()
            val toplanan2 = textInputCarpan2.text.toString().toInt()

            val gecis = ToplamaFragmentDirections.toplamaGecis("${toplanan1+toplanan2}")
            Navigation.findNavController(it).navigate(gecis)



            //tasarim.toplamaSonucTextView.text = (toplanan1 + toplanan2).toString()

        }
        return tasarim
    }


}