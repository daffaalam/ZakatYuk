package com.daffaalam.zakat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class FiqhZakatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiqh_zakat);

        CardView bab1 = findViewById(R.id.bab1);
        CardView bab2 = findViewById(R.id.bab2);
        CardView bab3 = findViewById(R.id.bab3);
        CardView bab4 = findViewById(R.id.bab4);
        CardView bab5 = findViewById(R.id.bab5);
        CardView bab6 = findViewById(R.id.bab6);
        CardView bab7 = findViewById(R.id.bab7);
        CardView bab8 = findViewById(R.id.bab8);

        bab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(FiqhZakatActivity.this, BabFiqhActivity.class);
                pindah.putExtra("JUDUL", "BAB 1 - PENGERTIAN ZAKAT");
                pindah.putExtra("BAB", "1");
                startActivity(pindah);
            }
        });
        bab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(FiqhZakatActivity.this, BabFiqhActivity.class);
                pindah.putExtra("JUDUL", "BAB 2 - ZAKAT MAAL (HARTA)");
                pindah.putExtra("BAB", "2");
                startActivity(pindah);
            }
        });
        bab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(FiqhZakatActivity.this, BabFiqhActivity.class);
                pindah.putExtra("JUDUL", "BAB 3 - NISAB DAN KADAR ZAKAT");
                pindah.putExtra("BAB", "3");
                startActivity(pindah);
            }
        });
        bab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(FiqhZakatActivity.this, BabFiqhActivity.class);
                pindah.putExtra("JUDUL", "BAB 4 - ZAKAT PROFESI");
                pindah.putExtra("BAB", "4");
                startActivity(pindah);
            }
        });
        bab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(FiqhZakatActivity.this, BabFiqhActivity.class);
                pindah.putExtra("JUDUL", "BAB 5 - KETENTUAN HARTA YANG LAIN");
                pindah.putExtra("BAB", "5");
                startActivity(pindah);
            }
        });
        bab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(FiqhZakatActivity.this, BabFiqhActivity.class);
                pindah.putExtra("JUDUL", "BAB 6 - PEMBAGIAN HARTA ZAKAT");
                pindah.putExtra("BAB", "6");
                startActivity(pindah);
            }
        });
        bab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(FiqhZakatActivity.this, BabFiqhActivity.class);
                pindah.putExtra("JUDUL", "BAB 7 - ZAKAT FITRAH");
                pindah.putExtra("BAB", "7");
                startActivity(pindah);
            }
        });
        bab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(FiqhZakatActivity.this, BabFiqhActivity.class);
                pindah.putExtra("JUDUL", "BAB 8 - HIKMAH ZAKAT");
                pindah.putExtra("BAB", "8");
                startActivity(pindah);
            }
        });
    }
}
