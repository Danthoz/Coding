package com.example.lenguajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActCe extends AppCompatActivity {

    WebView wvCe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_ce);

        wvCe=findViewById(R.id.wvCe);
        wvCe.setWebViewClient(new WebViewClient());
        wvCe.loadUrl("https://docs.microsoft.com/es-es/dotnet/csharp/tour-of-csharp/");
    }
}
