package com.kotlin.mydatabinding

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.mydatabinding.databinding.ActivityMainBinding
import android.databinding.DataBindingUtil
import android.util.Log
import android.view.View
import android.widget.Toast
import com.facebook.drawee.backends.pipeline.Fresco


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val newStory = StoryItem("orhan", "avan", "https://via.placeholder.com/250/fd12ef/000000", "https://via.placeholder.com/250/aabbcc/000000")
        binding.story = newStory

        val handlers = MyClickHandlers(this)
        binding.handlers = handlers

    }

    class MyClickHandlers(var context: Context) {

        fun onButtonClicked(view: View) {
            Toast.makeText(context.applicationContext, "Button Clicked!", Toast.LENGTH_SHORT).show()
            Log.e("orhan33", "tıkladı")
        }
    }

}
