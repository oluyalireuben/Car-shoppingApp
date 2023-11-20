package com.example.brandnewcars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PradoActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prado);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.toyota.com.au");
    }
}