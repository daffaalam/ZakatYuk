package com.daffaalam.zakat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView fiqh_zakat = findViewById(R.id.fiqh_zakat);
        CardView kalkulator_zakat = findViewById(R.id.kalkulator_zakat);
        CardView about = findViewById(R.id.about);
        fiqh_zakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, FiqhZakatActivity.class));
            }
        });
        kalkulator_zakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, KalkulatorActivity.class));
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, AboutActivity.class));
            }
        });

        TextView versi = findViewById(R.id.ver);
        versi.setText(getResources().getString(R.string.app_name) + " v" + BuildConfig.VERSION_NAME);
    }
}
