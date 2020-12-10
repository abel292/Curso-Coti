package com.example.helloeib

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_image_web_viwer_searcher.*

class ImageWebViwerSearcherActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_web_viwer_searcher)

        webViewSetup()

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(){
        webViewerSearcherImage.webViewClient = WebViewClient()

        webViewerSearcherImage.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true

        }

    }
}