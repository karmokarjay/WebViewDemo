package com.example.webviewdemo

import android.R
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import com.example.webviewdemo.databinding.MainActivityBinding


class MainActivity : ComponentActivity() {

    lateinit var mainActivityBinding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding=MainActivityBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)

        setWebViewData()
    }

    private fun setWebViewData(){
        mainActivityBinding.apply {
            webView.webViewClient = object : WebViewClient() {
                @Deprecated("Deprecated in Java")
                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                    view.loadUrl(url)
                    return false
                }
            }
            webView.settings.javaScriptEnabled = true
            webView.loadUrl("https://www.google.com/")
        }
    }
}

