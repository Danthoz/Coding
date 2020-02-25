package com.example.lenguajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActJS extends AppCompatActivity {
    WebView wvJS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_js);

        wvJS=findViewById(R.id.wvJS);
        wvJS.setWebViewClient(new WebViewClient());
        wvJS.loadUrl("https://developer.mozilla.org/es/docs/Web/JavaScript");
    }
}
