package com.route.assignment3.homescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.assignment3.R
import com.route.assignment3.TimeLineAdapter.TimeLineAdapter
import com.route.assignment3.databinding.ActivityHomeScreenBinding
import com.route.assignment3.postclass.Post
import com.route.assignment3.postclass.User
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class HomeScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeScreenBinding
    var Timeline = mutableListOf<Post>()
    lateinit var adapter: TimeLineAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createTimeLine()
        adapter = TimeLineAdapter(Timeline)
        binding.rvPosts.adapter = adapter
    }

    fun createTimeLine() {
        for (i in 0..10) {
            Timeline.add(
                Post(
                    User("Ahmed Elkomy", R.drawable.me1),
                    "hello My Brothers",
                    R.drawable.post,
                    getDate()
                )
            )
            Timeline.add(
                Post(
                    User("Yusef Elkomy", R.drawable.jo),
                    "Hello My Friends",
                    R.drawable.hello,
                    getDate()
                )
            )
            Timeline.add(
                Post(
                    User("Elkomy", R.drawable.me2),
                    "Bye Bye",
                    R.drawable.bye,
                    getDate()
                )
            )
        }

    }
   private fun getDate(): String {
        val date = Calendar.getInstance().time
        return date.toString("yyyy-MMM-dd hh:mm a")
    }

    fun Date.toString(format: String, local: Locale = Locale.getDefault()): String {
        val formater = SimpleDateFormat(format, local)
        return formater.format(this)
    }
}

