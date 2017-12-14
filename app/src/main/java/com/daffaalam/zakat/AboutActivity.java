package com.daffaalam.zakat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView textView = findViewById(R.id.abt_ver);
        textView.setText("version " + BuildConfig.VERSION_NAME);
    }

    public void send_mail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "smk_daffa@rbs.sch.id", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback " + R.string.app_name);
        startActivity(Intent.createChooser(emailIntent, "Feedback"));
    }

    public void maps(View view) {
        Uri url_map = Uri.parse("https://goo.gl/maps/gdJsH8tKQu42");
        Intent open_map = new Intent(Intent.ACTION_VIEW, url_map);
        startActivity(open_map);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:082299368783");
        Intent calls = new Intent(Intent.ACTION_DIAL, number);
        startActivity(calls);
    }

}
