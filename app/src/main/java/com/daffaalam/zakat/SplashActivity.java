package com.daffaalam.zakat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {

    int status = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ProgressBar progressBar = findViewById(R.id.progbar);
        final ImageView imageView = findViewById(R.id.logo);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.translate);
        animation.reset();
        loadAnimation.reset();
        imageView.clearAnimation();
        imageView.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                finish();
            }
        }, 3500);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (status < 500) {
//                    status++;
//                    try {
//                        Thread.sleep(15);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    handler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            progressBar.setProgress(status);
//                            int hasil = status;
//                            if (hasil == 500) {
//                                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
//                                finish();
//                            }
//                        }
//                    });
//                }
//            }
//        }).start();
    }
}