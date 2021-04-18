package com.sercem.bottomnavodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_carpma_sonuc.*
import kotlinx.android.synthetic.main.fragment_toplama_sonuc.view.*

class ToplamaSonucFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_toplama_sonuc, container, false)

        val bundle:ToplamaSonucFragmentArgs by navArgs()
        val gelenSonucToplama = bundle.toplamaSonuc
        tasarim.toplamaSonucTextView.text = "Toplam: ${gelenSonucToplama} "
        return tasarim
    }


}
