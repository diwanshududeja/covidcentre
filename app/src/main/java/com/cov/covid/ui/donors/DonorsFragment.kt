package com.cov.covid.ui.donors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cov.covid.R
import com.cov.covid.adapters.DonorsAdapter
import com.cov.covid.modals.DonorDetail

class DonorsFragment : Fragment() {

    private lateinit var slideshowViewModel: DonorsViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    val list = arrayListOf<DonorDetail>()



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
                ViewModelProviders.of(this).get(DonorsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        viewManager = LinearLayoutManager(context)
        viewAdapter = DonorsAdapter(getDonorsList())
        recyclerView = root.findViewById<RecyclerView>(R.id.donors_recycler_view).apply{
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }


        return root
    }

    fun getDonorsList():ArrayList<DonorDetail>{
        return list

    }
}