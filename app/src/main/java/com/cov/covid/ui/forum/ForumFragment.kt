package com.cov.covid.ui.forum

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cov.covid.R
import com.cov.covid.adapters.ForumAdapter
import com.cov.covid.modals.ForumData

class ForumFragment : Fragment() {

    private lateinit var forumViewModel: ForumViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    val list = arrayListOf<ForumData>()


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        forumViewModel =
                ViewModelProviders.of(this).get(ForumViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_forum, container, false)
        viewManager = LinearLayoutManager(context)
        viewAdapter = ForumAdapter(getDiscussionsList())
        recyclerView = root.findViewById<RecyclerView>(R.id.forum_recycler_view).apply{
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

       /* forumViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }

    fun getDiscussionsList():ArrayList<ForumData>{
        return list

    }
}