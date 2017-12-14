package com.daffaalam.zakat;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class BabFiqhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab_fiqh);

        String jdl = getIntent().getStringExtra("JUDUL");
        String gets = getIntent().getStringExtra("BAB");

        WebView webView = findViewById(R.id.tx_load);
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.loadUrl("file:///android_asset/" + gets);

        setTitle(jdl);
    }
}
