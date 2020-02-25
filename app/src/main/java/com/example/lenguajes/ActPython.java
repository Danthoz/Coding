package com.example.lenguajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActPython extends AppCompatActivity {

    WebView wvPython;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_python);

        wvPython=findViewById(R.id.wvPython);
        wvPython.setWebViewClient(new WebViewClient());
        wvPython.loadUrl("https://www.genbeta.com/desarrollo/dominas-python-c-c-elon-musk-puede-tener-trabajo-para-ti-tesla");
    }
}
