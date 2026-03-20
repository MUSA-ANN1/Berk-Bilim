package com.berk.bilim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Mathucngiris extends AppCompatActivity {
    public static ImageView imageView;
    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathucngiris);
        /*

        SCROLLVIEW ANIMASIYA!!!

        imageView = findViewById(R.id.imageView);
        ScrollView s = findViewById(R.id.scrollView2);
        s.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY == oldScrollY) {
                    lp.setMargins(0,0,0,0);
                    imageView.setLayoutParams(lp);
                } else if (scrollY>0) {
                    lp.setMargins(0,(0-(scrollY)+430),0,0);
                    imageView.setLayoutParams(lp);
                }
            }
        });*/

        TextView t1 = findViewById(R.id.textView2);
        TextView t2 = findViewById(R.id.textView20);
        Button b = findViewById(R.id.button7);

        if (MainActivity.tm) {
            t1.setText(R.string.Mental_tm);
            t2.setText(R.string.info_m_tm);
            b.setText(R.string.basla_tm);
        } else if (MainActivity.en) {
            t1.setText(R.string.Mental_en);
            t2.setText(R.string.info_m_en);
            b.setText(R.string.basla_en);
        } else if (MainActivity.ru) {
            t1.setText(R.string.Mental_ru);
            t2.setText(R.string.info_m_ru);
            b.setText(R.string.basla_ru);
        }
    }

    public void girMath(View v) {
        startActivity(new Intent(Mathucngiris.this, PLAY.class));
    }
}