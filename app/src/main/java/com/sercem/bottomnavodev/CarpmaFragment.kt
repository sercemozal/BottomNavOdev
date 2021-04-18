package com.sercem.bottomnavodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpma.view.*
import kotlinx.android.synthetic.main.fragment_toplama.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*

class CarpmaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_carpma, container, false)

        tasarim.buttonCarp.setOnClickListener {


            val carpan1 = textInputCarpan1.text.toString().toInt()
            val carpan2 = textInputCarpan2.text.toString().toInt()

            val gecis = CarpmaFragmentDirections.carpmaGecis("${carpan1*carpan2}")
            Navigation.findNavController(it).navigate(gecis)

        }

        return tasarim
    }

}