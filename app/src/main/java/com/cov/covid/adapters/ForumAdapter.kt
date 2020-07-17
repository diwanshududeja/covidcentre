package com.cov.covid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cov.covid.R
import com.cov.covid.modals.ForumData

class ForumAdapter(private val list: ArrayList<ForumData>) :
    RecyclerView.Adapter<ForumAdapter.StoriesViewHolder>() {



    class StoriesViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var txtHeading: TextView
        var txtdate: TextView
        var txtDesc: TextView
        var txtUserName: TextView
        var txtReplies: TextView

        init {
            txtHeading = v.findViewById<View>(R.id.txtHeading) as TextView
            txtdate = v.findViewById<View>(R.id.txtDate) as TextView
            txtDesc = v.findViewById(R.id.txtDesc) as TextView
            txtUserName = v.findViewById(R.id.textUserName) as TextView
            txtReplies = v.findViewById(R.id.txtReplies) as TextView

        }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): StoriesViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_forum, parent, false) as View
        // set the view's size, margins, paddings and layout parameters
        return StoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        holder.txtdate.text = list.get(position).updatedAt
        holder.txtDesc.text = list.get(position).forumText
        holder.txtHeading.text = list.get(position).forumQuery
        holder.txtReplies.text = list.get(position).replyCount
        holder.txtUserName.text = list.get(position).userName
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = list.size
}