package com.cov.covid.ui.story

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cov.covid.R
import com.cov.covid.adapters.StoriesListAdapter
import com.cov.covid.modals.Story

class StoriesFragment : Fragment() {

    private lateinit var storiesViewModel: StoriesViewModel

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    val list = arrayListOf<Story>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        storiesViewModel =
                ViewModelProviders.of(this).get(StoriesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_stories, container, false)
        viewManager = LinearLayoutManager(context)
        viewAdapter = StoriesListAdapter(getStoriesList())
        recyclerView = root.findViewById<RecyclerView>(R.id.card_recycler_view).apply{
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
        /*storiesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }

    fun getStoriesList():ArrayList<Story>{

        return list

    }





}