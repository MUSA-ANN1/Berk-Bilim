package com.berk.bilim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Starter extends AppCompatActivity {
    private TextView countdownTextView;
    private int count = 1; // Starting countdown value
    private Handler handler = new Handler();

    public String ha = "";
    public String ta = "";
    public String ba = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        countdownTextView = findViewById(R.id.textView9);


        if (MainActivity.tm) {
            ha = getString(R.string.hazir_tm);
            ta = getString(R.string.tayyn_tm);
            ba = getString(R.string.baslaaa_tm);
        } else if (MainActivity.en) {
            ha = getString(R.string.hazir_en);
            ta = getString(R.string.tayyn_en);
            ba = getString(R.string.baslaaa_en);
        } else if (MainActivity.ru) {
            ha = getString(R.string.hazir_ru);
            ta = getString(R.string.tayyn_ru);
            ba = getString(R.string.baslaaa_ru);
        }

        startCountdown();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        handler.removeCallbacksAndMessages(null);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }

    private void startCountdown() {
        countdownTextView.setText(ha);

        handler.postDelayed(new Runnable() {
            @SuppressLint("SetTextI18n")
            @Override
            public void run() {
                /*if (of) {
                    finish();
                } else {*/
                    if (count == 1) {
                        count--;
                        countdownTextView.setText(ta);
                        handler.postDelayed(this, 1000);
                    } else {
                        countdownTextView.setText(ba);
                        handler.postDelayed(() -> {
                            startActivity(new Intent(Starter.this, GOGOGO.class));
                            finish();
                        }, 500);

                }
            }
        }, 1000);
    }
}
