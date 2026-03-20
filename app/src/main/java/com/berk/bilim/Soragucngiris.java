package com.berk.bilim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Soragucngiris extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soragucngiris);

        TextView t1 = findViewById(R.id.textView2);
        TextView t2 = findViewById(R.id.textView20);
        Button b = findViewById(R.id.button7);

        if (MainActivity.tm) {
            t1.setText(R.string.Hunar_tm);
            t2.setText(R.string.info_s_tm);
            b.setText(R.string.basla_tm);
        } else if (MainActivity.en) {
            t1.setText(R.string.Hunar_en);
            t2.setText(R.string.info_s_en);
            b.setText(R.string.basla_en);
        } else if (MainActivity.ru) {
            t1.setText(R.string.Hunar_ru);
            t2.setText(R.string.info_s_ru);
            b.setText(R.string.basla_ru);
        }
    }

    public void girsorag(View v) {
        startActivity(new Intent(Soragucngiris.this, sorag.class));
    }
}