package com.example.kayttaja.zoomi;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WenViewActivity extends AppCompatActivity {

    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wen_view);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        webView = (WebView) findViewById(R.id.idWebView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
