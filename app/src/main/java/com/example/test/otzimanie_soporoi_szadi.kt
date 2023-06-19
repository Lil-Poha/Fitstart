package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import com.example.test.R

class otzimanie_soporoi_szadi : AppCompatActivity() {

    var videoView: VideoView? = null

    var mediaController: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otzimanie_soporoi_szadi)
        videoView = findViewById<View>(R.id.videoView) as VideoView?
        if (mediaController == null) {
            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }
        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.otzimsoproiszadi))
        videoView!!.requestFocus()
        videoView!!.start()
    }
    public fun dos(view: View){
        val intent = Intent(this, pohudeniegrudtwo::class.java)
        startActivity(intent);
        finish()}
}