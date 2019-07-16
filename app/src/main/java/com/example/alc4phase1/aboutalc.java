package com.example.alc4phase1;

import android.net.http.SslError;
import android.content.Intent;
import android.net.http.SslError;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import static com.example.alc4phase1.R.id.webview;

public class aboutalc extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutalc);
        webView = (WebView)findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        webView.loadUrl("http://www.andela.com/alc");

        WebSettings webber = webView.getSettings();
        webber.setJavaScriptEnabled(true);
    }


}


