package com.example.mona_.client_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AuthorizationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

       WebView webView =(WebView) findViewById(R.id.webView);
        webView.loadUrl("https://api.instagram.com/oauth/callback?client_id=<client_id>&redirect_uri=http://localhost/callback");
        webView.getSettings().setJavaScriptEnabled(true);
        // To stop redirects loading in the phone browser
        webView.setWebViewClient(new WebViewClient());

    }
}
