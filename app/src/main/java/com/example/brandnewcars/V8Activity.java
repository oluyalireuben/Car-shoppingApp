package com.example.brandnewcars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class V8Activity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v8);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.amarisupercars.com");
    }
}