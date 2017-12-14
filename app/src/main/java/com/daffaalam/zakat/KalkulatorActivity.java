package com.daffaalam.zakat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    String penghasilan_text =
            "<html><body style=\"text-align:justify;\">&emsp;Penghasilan profesional oleh mayoritas ulama dikategorikan sebagai jenis harta wajib zakat berdasarkan analogi (qiyas) atas kemiripan (syabbah) terhadap karakteristik harta zakat yang telah ada, yakni : <ol><li>Model memperoleh harta penghasilan dari profesi mirip dengan panen dari hasil pertanian, sehingga harta ini dapat dianalogikan pada zakat pertanian berdasarkan nisabsebesar 653 kg gabah kering giling (setara dengan 522 kg beras) dengan waktu pengeluaran zakat (haul)nya setiap kali menerima penghasilan (gaji).</li><li>Model harta yang diterima sebagai penghasilan berupa uang, sehingga jenis harta ini dapat dianalogikan pada zakat harta (simpanan atau kekayaan) berdasarkan kadar zakat yang harus dibayarkan sebesar 2,5%. Dengan demikian, apabila pengasilan seseorang telah memenuhi ketentuan ambang batas (nisab) wajib zakat, ia berkewajiban menunaikan zakat atas penghasilannya.</li></ol></body></html>";
    String nisab_penghasilan_text =
            "<html><body style=\"text-align:justify;\">&emsp;Nisab adalah syarat jumlah minimum (ambang batas) harta yang dapat dikategorikan sebagai harta wajib zakat. Untuk penghasilan yang diwajibkan zakat adalah penghasilan yang berada diatas nisab. Nisab Zakat Penghasilan adalah setara 522 kg beras normal.</body></html>";
    String harta_text =
            "<html><body style=\"text-align:justify;\">&emsp;Zakat Harta (Maal) adalah sejumlah harta yang wajib dikeluarkan bila telah mencapai batas minimal tertentu (nisab) dalam kurun waktu (haul) setiap satu tahun kalender.</body></html>";
    String nisab_harta_text =
            "<html><body style=\"text-align:justify;\">&emsp;Untuk harta yang diwajibkan zakat adalah harta yang berjumlah diatas nisab penghasilan. Nisab Zakat Harta (Maal) adalah setara dengan 85 gr emas 24 karat.</body></html>";
    String keterangan_text =
            "<html><body>" +
                    "<ol>" +
                    "<b>Keterangan :</b>" +
                    "<li>Yang dimaksud Kebutuhan Pokok adalah kebutuhan sandang, pangan, papan, pendidikan, kesehatan dan alat transportasi primer.</li>" +
                    "<li>Surat Berharga antara lain nilai tunai dari Reksadana, Saham, Obligasi, Unit Link, dll.</li>" +
                    "<li>Rumah (properti) yang digunakan sehari-hari, TIDAK DIKENAKAN ZAKAT.</li>" +
                    "<li>Kendaraan yang digunakan sehari-hari, TIDAK DIKENAKAN ZAKAT.</li>" +
                    "<li>Nilai Koleksi dapat ditaksir sendiri, bila dimungkinkan dapat dibantu kurator seni.</li>" +
                    "<li>Contoh bagi pedagang yang harus melunasi cicilan hutang atas barang yang diperdagangkan.</li>" +
                    "</ol>" +
                    "<ul>" +
                    "<b>Info :</b>" +
                    "<li>Harga Beras saat ini" +
                    "<br><a href=\"http://infopangan.jakarta.go.id/\">http://infopangan.jakarta.go.id/</a></li>" +
                    "<li>Harga Emas saat ini" +
                    "<br><a href=\"http://harga-emas.org/\">http://harga-emas.org/</a></li>" +
                    "</ul>" +
                    "</body></html>";

    EditText n1, n2, n3, n5, n9, n10, n11, n12, n13, n14, n15, n16, n17, n19, n21;
    TextView n4, n6, n7, n8, n18, n20, n22, n23, n24, n25, n26, n27, n28;
    Integer nilai1, nilai2, nilai3, nilai4, nilai5, nilai6, nilai8, nilai9, nilai10, nilai11, nilai12, nilai13, nilai14, nilai15, nilai16, nilai17, nilai18, nilai19, nilai20, nilai21, nilai22, nilai24, nilai25, nilai26, nilai27, nilai28;
    String nilai7, nilai23;

    @SuppressLint({"SetJavaScriptEnabled", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        WebView tx_penghasilan = findViewById(R.id.penghasilan_tx);
        WebView tx_nisab_penghasilan = findViewById(R.id.nisab_penghasilan_tx);
        WebView tx_harta = findViewById(R.id.harta_tx);
        WebView tx_nisab_harta = findViewById(R.id.nisab_harta_tx);
        WebView tx_keterangan = findViewById(R.id.keterangan_tx);

        tx_penghasilan.setBackgroundColor(Color.TRANSPARENT);
        tx_penghasilan.loadData(penghasilan_text, "text/html", "utf-8");
        tx_nisab_penghasilan.setBackgroundColor(Color.TRANSPARENT);
        tx_nisab_penghasilan.loadData(nisab_penghasilan_text, "text/html", "utf-8");
        tx_harta.setBackgroundColor(Color.TRANSPARENT);
        tx_harta.loadData(harta_text, "text/html", "utf-8");
        tx_nisab_harta.setBackgroundColor(Color.TRANSPARENT);
        tx_nisab_harta.loadData(nisab_harta_text, "text/html", "utf-8");
        tx_keterangan.setBackgroundColor(Color.TRANSPARENT);
        tx_keterangan.loadData(keterangan_text, "text/html", "utf-8");

        //Penghasilan Gaji Perbulan
        n1 = findViewById(R.id.n1);

        //Penghasilan Lainnya Perbulan
        n2 = findViewById(R.id.n2);

        //Hutang Cicilan tuk kbutuhan pokok *1)
        n3 = findViewById(R.id.n3);

        //Jumlah Penghasilan Perbulan
        n4 = findViewById(R.id.n4);

        /**/

        //Harga Beras saat ini
        n5 = findViewById(R.id.n5);

        //Besarnya Nishab Zakat Penghasilan per Bulan
        n6 = findViewById(R.id.n6);

        //Apakah Saya Wajib Membayar Zakat Penghasilan?
        n7 = findViewById(R.id.n7);

        //Jumlah yang Saya Harus Dibayarkan per Bulan
        n8 = findViewById(R.id.n8);

        /**/

        //Harta dalam bentuk Tabungan Giro Deposito
        n9 = findViewById(R.id.n9);

        //Harta dalam bentuk Logam Mulia (Emas Perak)
        n10 = findViewById(R.id.n10);

        //Harta dalam bentuk Surat Beharga *2)
        n11 = findViewById(R.id.n11);

        //Harta dalam bentuk Properti *3)
        n12 = findViewById(R.id.n12);

        //Harta dalam bentuk Kendaraan *4)
        n13 = findViewById(R.id.n13);

        //Harta dalam bentuk Koleksi Seni & Barang Antik *5)
        n14 = findViewById(R.id.n14);

        //Harta dalam bentuk Stok Barang Dagangan
        n15 = findViewById(R.id.n15);

        //Harta dalam bentuk Lainnya
        n16 = findViewById(R.id.n16);

        //Harta dalam bentuk Piutang Lancar
        n17 = findViewById(R.id.n17);

        //Jumlah Harta
        n18 = findViewById(R.id.n18);

        //Hutang Jatuh Tempo Saat Membayar Kewajiban Zakat
        n19 = findViewById(R.id.n19);

        //Jumlah Harta Yang Dihitung Zakatnya
        n20 = findViewById(R.id.n20);

        /**/

        //Harga Emas saat ini (dalam gram)
        n21 = findViewById(R.id.n21);

        //Besarnya Nisab Zakat Maal per Tahun
        n22 = findViewById(R.id.n22);

        //Apakah Wajib Membayar Zakat Maal?
        n23 = findViewById(R.id.n23);

        //Jumlah yang Harus Dibayarkan per Tahun
        n24 = findViewById(R.id.n24);

        //Jumlah Bila Bayar per Bulan
        n25 = findViewById(R.id.n25);

        /**/

        //Zakat Penghasilan per Bulan
        n26 = findViewById(R.id.n26);

        //Zakat Maal yang dibayarkan per Bulan
        n27 = findViewById(R.id.n27);

        //Total Pembayaran Zakat Saya per Bulan
        n28 = findViewById(R.id.n28);

        /**/

        nilai5 = Integer.parseInt(n5.getText().toString());
        nilai6 = nilai5 * 522;
        n6.setText("" + nilai6);

        nilai21 = Integer.parseInt(n21.getText().toString());
        nilai22 = nilai21 * 85;
        n22.setText("" + nilai22);
    }

    @SuppressLint("SetTextI18n")
    public void penghasilan(View view) {

        if ((n1.getText().toString()).equals("")) {
            n1.setText("0");
        }

        if ((n2.getText().toString()).equals("")) {
            n2.setText("0");
        }

        if ((n3.getText().toString()).equals("")) {
            n3.setText("0");
        }

        if (!(n1.getText().toString()).equals("") && !(n2.getText().toString()).equals("") && !(n3.getText().toString()).equals("")) {
            nilai1 = Integer.parseInt(n1.getText().toString());
            nilai2 = Integer.parseInt(n2.getText().toString());
            nilai3 = Integer.parseInt(n3.getText().toString());
            nilai4 = nilai1 + nilai2 - nilai3;
            n4.setText("" + nilai4);
        }
    }

    @SuppressLint("SetTextI18n")
    public void nisab_penghasilan(View view) {

        if ((n5.getText().toString().equals(""))) {
            n5.setText("0");
        } else {
            nilai5 = Integer.parseInt(n5.getText().toString());
            nilai6 = nilai5 * 522;
            n6.setText("" + nilai6);

            if (nilai4 <= nilai6) {
                n7.setTextColor(Color.RED);
                n7.setText("TIDAK");
                n8.setText("0");
            } else {
                nilai4 = Integer.parseInt(n4.getText().toString());
                nilai8 = nilai4 / 40;
                n7.setTextColor(Color.BLUE);
                n7.setText("YA");
                n8.setText("" + nilai8);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void harta(View view) {

        if ((n9.getText().toString()).equals("")) {
            n9.setText("0");
        }
        if ((n10.getText().toString()).equals("")) {
            n10.setText("0");
        }
        if ((n11.getText().toString()).equals("")) {
            n11.setText("0");
        }
        if ((n12.getText().toString()).equals("")) {
            n12.setText("0");
        }
        if ((n13.getText().toString()).equals("")) {
            n13.setText("0");
        }
        if ((n14.getText().toString()).equals("")) {
            n14.setText("0");
        }
        if ((n15.getText().toString()).equals("")) {
            n15.setText("0");
        }
        if ((n16.getText().toString()).equals("")) {
            n16.setText("0");
        }
        if ((n17.getText().toString()).equals("")) {
            n17.setText("0");
        }
        if ((n19.getText().toString()).equals("")) {
            n19.setText("0");
        }
        if (!(n9.getText().toString()).equals("") &&
                !(n10.getText().toString()).equals("") &&
                !(n11.getText().toString()).equals("") &&
                !(n12.getText().toString()).equals("") &&
                !(n13.getText().toString()).equals("") &&
                !(n14.getText().toString()).equals("") &&
                !(n15.getText().toString()).equals("") &&
                !(n16.getText().toString()).equals("") &&
                !(n17.getText().toString()).equals("") &&
                !(n19.getText().toString()).equals("")
                ) {
            nilai9 = Integer.parseInt(n9.getText().toString());
            nilai10 = Integer.parseInt(n10.getText().toString());
            nilai11 = Integer.parseInt(n11.getText().toString());
            nilai12 = Integer.parseInt(n12.getText().toString());
            nilai13 = Integer.parseInt(n13.getText().toString());
            nilai14 = Integer.parseInt(n14.getText().toString());
            nilai15 = Integer.parseInt(n15.getText().toString());
            nilai16 = Integer.parseInt(n16.getText().toString());
            nilai17 = Integer.parseInt(n17.getText().toString());
            nilai18 = nilai9 + nilai10 + nilai11 + nilai12 + nilai13 + nilai14 + nilai15 + nilai16 + nilai17;
            n18.setText("" + nilai18);
            nilai19 = Integer.parseInt(n19.getText().toString());
            nilai20 = nilai18 - nilai19;
            n20.setText("" + nilai20);
        }
    }

    @SuppressLint("SetTextI18n")
    public void nisab_harta(View view) {

        if ((n21.getText().toString()).equals("")) {
            n21.setText("0");
        }
        if (!(n21.getText().toString()).equals("")) {
            nilai20 = Integer.parseInt(n20.getText().toString());
            nilai21 = Integer.parseInt(n21.getText().toString());
            nilai22 = nilai21 * 85;
            n22.setText("" + nilai22);

            if (nilai20 <= nilai22) {
                n23.setTextColor(Color.RED);
                n23.setText("TIDAK");
                n24.setText("0");
                n25.setText("0");
            } else {
                n23.setTextColor(Color.BLUE);
                n23.setText("YA");
                nilai20 = Integer.parseInt(n20.getText().toString());
                nilai24 = nilai20 / 40;
                n24.setText("" + nilai24);
                nilai25 = nilai24 / 12;
                n25.setText("" + nilai25);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void nisab_total(View view) {
        nilai8 = Integer.parseInt(n8.getText().toString());
        n26.setText("" + nilai8);
        nilai25 = Integer.parseInt(n25.getText().toString());
        n27.setText("" + nilai25);
        nilai28 = nilai8 + nilai25;
        n28.setText("" + nilai28);
    }
}
