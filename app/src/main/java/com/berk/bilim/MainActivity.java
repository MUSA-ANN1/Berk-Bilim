package com.berk.bilim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public static boolean tm = true;
    public static boolean en = false;
    public static boolean ru = false;

    public static Button b1 = null;
    public static Button b2 = null;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button4);
        b2 = findViewById(R.id.button5);
    }

    public void acsorag(View v) {
        startActivity(new Intent(MainActivity.this, Soragucngiris.class));
    }

    public void acMath(View v) {
        startActivity(new Intent(MainActivity.this, Mathucngiris.class));
    }

    public void dill(View v) {
        startActivity(new Intent(MainActivity.this, Dill.class));
    }
}