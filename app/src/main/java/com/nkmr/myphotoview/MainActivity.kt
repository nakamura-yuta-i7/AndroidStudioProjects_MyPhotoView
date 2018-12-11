package com.nkmr.myphotoview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.chrisbanes.photoview.PhotoView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photoView = findViewById(R.id.photo_view) as PhotoView
        photoView.setImageResource(R.drawable.abc_ic_star_black_36dp)
    }
}
