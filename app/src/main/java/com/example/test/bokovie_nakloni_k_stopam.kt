package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class bokovie_nakloni_k_stopam : AppCompatActivity() {

    var videoView: VideoView? = null

    var mediaController: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bokovie_nakloni_kstopam)

        videoView=findViewById<View>(R.id.videoView) as VideoView?
        if(mediaController==null){
            mediaController= MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }
        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.bokovoe_k_pyatkam))
        videoView!!.requestFocus()
        videoView!!.start()
    }
    public fun mokr(view: View){
        val intent = Intent(this, pohudeniepres::class.java)
        startActivity(intent);
        finish()}
}