package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class razgibanie_ruuk : AppCompatActivity() {

    var videoView: VideoView? = null

    var mediaController: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_razgibanie_za_golovoi)

        videoView=findViewById<View>(R.id.videoView) as VideoView?
        if(mediaController==null){
            mediaController=MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }
        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.za_golovoi))
        videoView!!.requestFocus()
        videoView!!.start()
    }
    public fun mokr(view: View){
        val intent = Intent(this, mishsi_na_spinu::class.java)
        startActivity(intent);
        finish()}
}