package com.route.assignment3.TimeLineAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.route.assignment3.R
import com.route.assignment3.postclass.Post

class TimeLineAdapter(val postview: List<Post>) : RecyclerView.Adapter<TimeLineAdapter.TimeLineviewHolder>() {

    class TimeLineviewHolder(itemview : View) : ViewHolder(itemview) {
        val profileImage :ImageView = itemview.findViewById(R.id.profile_image_pic)
        val profileName: TextView = itemview.findViewById(R.id.profile_name)
        val profileDate: TextView = itemview.findViewById(R.id.post_time)
        val postContent : TextView = itemview.findViewById(R.id.post_content)
        val postImage : ImageView = itemview.findViewById(R.id.post_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeLineviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
        return TimeLineviewHolder(view)
    }

    override fun getItemCount(): Int = postview.size

    override fun onBindViewHolder(holder: TimeLineviewHolder, position: Int) {
        val posts = postview.get(position)
        holder.profileImage.setImageResource(posts.author.userpostimage)
        holder.profileName.text = posts.author.name
        holder.profileDate.text = posts.date
        holder.postContent.text = posts.content
        holder.postImage.setImageResource(posts.image)
    }

}