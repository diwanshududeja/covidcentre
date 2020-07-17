package com.cov.covid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.cov.covid.R
import com.cov.covid.modals.Story

class StoriesListAdapter(private val list: List<Story>) :
    RecyclerView.Adapter<StoriesListAdapter.StoriesViewHolder>() {

    class StoriesViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var txtHeading: TextView
        var txtStory: TextView
        var txtdate: TextView
        var txtViews: TextView
        var txtLikes: TextView
        var mCardView: CardView

        init {
            txtHeading = v.findViewById<View>(R.id.txtHeading) as TextView
            txtStory = v.findViewById<View>(R.id.txtMid) as TextView
            txtdate = v.findViewById<View>(R.id.txtDate) as TextView
            txtViews = v.findViewById<View>(R.id.txtViewCount) as TextView
            txtLikes = v.findViewById<View>(R.id.txtLikeCount) as TextView
            mCardView = v.findViewById<View>(R.id.cardView) as CardView
        }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): StoriesViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_story, parent, false) as View
        return StoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {

        holder.txtHeading.text = list.get(position).storyHeading
        holder.txtStory.text = list.get(position).storyText
        holder.txtdate.text = list.get(position).updatedAt
        holder.txtLikes.text = list.get(position).loveCount.toString()
        holder.txtViews.text = list.get(position).viewCount.toString()

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = list.size
}