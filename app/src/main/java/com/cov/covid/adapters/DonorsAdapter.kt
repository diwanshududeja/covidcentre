package com.cov.covid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cov.covid.R
import com.cov.covid.modals.DonorDetail

class DonorsAdapter(private val list: ArrayList<DonorDetail>) :
    RecyclerView.Adapter<DonorsAdapter.StoriesViewHolder>() {


    class StoriesViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var txtUserName: TextView
        var txtCity : TextView
        var txtLocation : TextView
        var txtBlookGroup : TextView

        init {
            txtUserName = v.findViewById<View>(R.id.textUserName) as TextView
            txtCity = v.findViewById<View>(R.id.textCity) as TextView
            txtLocation = v.findViewById(R.id.textLocation) as TextView
            txtBlookGroup = v.findViewById(R.id.txtBloodGroup) as TextView

        }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): StoriesViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_donor, parent, false) as View
        // set the view's size, margins, paddings and layout parameters
        return StoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        holder.txtCity.text = list.get(position).userCity
        holder.txtBlookGroup.text = list.get(position).userBloodGroup
        holder.txtUserName.text = list.get(position).userName
        holder.txtLocation.text = list.get(position).userLocation

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = list.size
}