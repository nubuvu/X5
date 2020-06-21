package com.example.hackathonx5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class openCaseMagic extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_case_magic);

        webView = (WebView)findViewById(R.id.webgif);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String file = "file:android_asset/chest.gif";
        webView.loadUrl(file);
    }

    public void backWINDopen(View v){
        Intent go = new Intent(".exitTrue");
        startActivity(go);
    }

    public void getSale(View v){
        Intent go = new Intent(".yourSale");
        startActivity(go);
    }
}
