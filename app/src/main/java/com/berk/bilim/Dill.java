package com.berk.bilim;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dill extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dill);
        Button b1 = findViewById(R.id.Turkmen);
        Button b2 = findViewById(R.id.Inlis);
        Button b3 = findViewById(R.id.Russiya);

        if (MainActivity.tm) {
            b1.setText(R.string.tm_tm);
            b2.setText(R.string.en_tm);
            b3.setText(R.string.ru_tm);
        } else if (MainActivity.en) {
            b1.setText(R.string.tm_en);
            b2.setText(R.string.en_en);
            b3.setText(R.string.ru_en);
        } else if (MainActivity.ru) {
            b1.setText(R.string.tm_ru);
            b2.setText(R.string.en_ru);
            b3.setText(R.string.ru_ru);
        }
    }

    public void dil(View v) {
        Button b = (Button) v;

        if (b.getId() == R.id.Turkmen) {
            MainActivity.tm = true;
            MainActivity.en = false;
            MainActivity.ru = false;
        } else if (b.getId() == R.id.Inlis) {
            MainActivity.en = true;
            MainActivity.tm = false;
            MainActivity.ru = false;
        } else if (b.getId() == R.id.Russiya) {
            MainActivity.ru = true;
            MainActivity.tm = false;
            MainActivity.en = false;
        }

        if (MainActivity.tm) {
            MainActivity.b1.setText(R.string.Mental_tm);
            MainActivity.b2.setText(R.string.Hunar_tm);
            MainActivity.b1.setTextSize(11.238F);
            MainActivity.b2.setTextSize(11.238F);
        } else if (MainActivity.en) {
            MainActivity.b1.setText(R.string.Mental_en);
            MainActivity.b2.setText(R.string.Hunar_en);
            MainActivity.b1.setTextSize(11.238F);
            MainActivity.b2.setTextSize(9.038F);
        } else if (MainActivity.ru) {
            MainActivity.b1.setText(R.string.Mental_ru);
            MainActivity.b2.setText(R.string.Hunar_ru);
            MainActivity.b1.setTextSize(9.0F);
            MainActivity.b2.setTextSize(10.238F);
        }

        Handler h = new Handler();

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 500);

    }
}