package com.roya.videoplayer

import android.os.Bundle
import android.net.Uri
import android.widget.VideoView
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var videoView: VideoView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // إنشاء مشغل الفيديو برمجياً بملء الشاشة وتعيينه كواجهة أساسية
        videoView = VideoView(this)
        setContentView(videoView)

        // إضافة أزرار التحكم التقليدية (تشغيل، إيقاف، تقديم)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView?.setMediaController(mediaController)

        // رابط دفق الفيديو التجريبي لمنصة Roya (يمكن تعديله لاحقاً لأي رابط مباشر)
        val videoUri = Uri.parse("https://googleapis.com")
        videoView?.setVideoURI(videoUri)
        videoView?.requestFocus()
        videoView?.start()
    }
}
