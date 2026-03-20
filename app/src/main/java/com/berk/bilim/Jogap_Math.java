package com.berk.bilim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Jogap_Math extends AppCompatActivity {
    public static float Jogap;
    public static String adamyn_jogaby = null;
    static Button button = null;
    static EditText editText = null;
    static TextView text = null;
    static TextView text1 = null;
    static TextView text2 = null;

    static boolean pressed = false;

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

    public static Handler handler = new Handler(Looper.getMainLooper());

    public String jogabynyyazyn = "";
    public String dogry = "";
    public String yalnys = "";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogap_math);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.ok);
        text = findViewById(R.id.te);
        text1 = findViewById(R.id.te1);
        text2 = findViewById(R.id.te2);

        if (MainActivity.tm) {
            jogabynyyazyn = getString(R.string.yaz_jogap_tm);
            dogry = getString(R.string.dogry_tm);
            yalnys = getString(R.string.yalnys_tm);
        } else if (MainActivity.en) {
            jogabynyyazyn = getString(R.string.yaz_jogap_en);
            dogry = getString(R.string.dogry_en);
            yalnys = getString(R.string.yalnys_en);
            editText.setText(R.string.yaz_jogap_en);
        } else if (MainActivity.ru) {
            jogabynyyazyn = getString(R.string.yaz_jogap_ru);
            dogry= getString(R.string.dogry_ru);
            yalnys = getString(R.string.yalnys_ru);
            editText.setText(R.string.yaz_jogap_ru);
        }


        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus && editText.getText().toString().equals(jogabynyyazyn)) {
                    editText.setText("");
                }
            }
        });

        int[] i = {15};

        text.setVisibility(View.VISIBLE);

        handler.postDelayed(new Runnable() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void run() {

                    if (i[0] > -1 && !pressed) {
                        text.setText(String.valueOf(i[0]));

                        // Alternate colors every second
                        if (i[0] % 2 == 0) {
                            text.setTextColor(text1.getTextColors());
                        } else {
                            text.setTextColor(text2.getTextColors());
                        }

                        i[0]--;
                        handler.postDelayed(this, 1000);
                    } else {
                        if (!pressed) {
                            dogry_or_false.string = null;
                        }
                        else {
                            pressed = false;
                        }
                        startActivity(new Intent(Jogap_Math.this, dogry_or_false.class));
                        finish();
                    }

            }
        }, 1000);


    }

    public void ok(View v) {
        pressed = true;
        adamyn_jogaby = String.valueOf(editText.getText());
        dogry_or_false.a_jo = adamyn_jogaby;

        String[] a = String.valueOf(Jogap).split("[.]");

        if (Objects.equals(a[1], "0")) {
            dogry_or_false.jo = a[0];

            if (Objects.equals(adamyn_jogaby, a[0])) {
                dogry_or_false.string = dogry;
            } else {
                dogry_or_false.string = yalnys;
            }
        }

        else {
            dogry_or_false.jo = String.valueOf(Jogap);

            if (adamyn_jogaby.equals(Jogap)) {
                dogry_or_false.string = dogry;
            } else {
                dogry_or_false.string = yalnys;
            }
        }
    }


}
