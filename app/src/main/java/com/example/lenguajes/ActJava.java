package com.example.lenguajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActJava extends AppCompatActivity {

    WebView wvJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_java);

        wvJava=findViewById(R.id.wvJava);
        wvJava.setWebViewClient(new WebViewClient());
        wvJava.loadUrl("https://www.muypymes.com/2020/02/13/cinco-tendencias-que-marcaran" +
                "-la-programacion-java-en-los-proximos-anos");
    }
}
