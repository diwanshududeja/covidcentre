package com.cov.covid.ui.donate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.cov.covid.R
import com.cov.covid.modals.ForumData

class DonateFragment : Fragment() {

    private lateinit var donateViewModel: DonateViewModel
    val list = arrayListOf<ForumData>()


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        donateViewModel =
                ViewModelProviders.of(this).get(DonateViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_donate, container, false)



        return root
    }


}