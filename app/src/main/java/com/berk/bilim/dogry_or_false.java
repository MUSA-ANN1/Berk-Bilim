package com.berk.bilim;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Objects;

public class dogry_or_false extends AppCompatActivity {
    public static String string = null;
    public static String jo = null;
    public static String a_jo = null;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @SuppressLint("StaticFieldLeak")
    public static TextView textView = null;
    @SuppressLint("StaticFieldLeak")
    public static TextView jog = null;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogry_or_false);
        textView = findViewById(R.id.siz);
        jog = findViewById(R.id.jo);

        String jogap_yazylmandyr = "";
        String dogry = "";
        String yalnys = "";
        if (MainActivity.tm) {
            jogap_yazylmandyr = getString(R.string.jogap_yazylmandyr_tm);
            dogry = getString(R.string.dogry_tm);
            yalnys = getString(R.string.yalnys_tm);
        } else if (MainActivity.en) {
            jogap_yazylmandyr = getString(R.string.jogap_yazylmandyr_en);
            dogry = getString(R.string.dogry_en);
            yalnys = getString(R.string.yalnys_en);
            textView.setText(R.string.adam_jogap_en);
            jog.setText(R.string.dogry_jogap_en);
        } else if (MainActivity.ru) {
            jogap_yazylmandyr = getString(R.string.jogap_yazylmandyr_ru);
            dogry = getString(R.string.dogry_ru);
            yalnys = getString(R.string.yalnys_ru);
            textView.setText(R.string.adam_jogap_ru);
            jog.setText(R.string.dogry_jogap_ru);
        }


        if (string == null) {
            textView.setText(jogap_yazylmandyr);
            jog.setText("");
        } else {
            if (Objects.equals(string, dogry)) {
                textView.setText(textView.getText() + " " + string + ", " + a_jo+".");
                LottieAnimationView lot = findViewById(R.id.anim);
                lot.playAnimation();
            }

            else if (Objects.equals(string, yalnys)) {
                textView.setText(textView.getText() + " " + string + ", " + a_jo+".");
            }

            jog.setText(jog.getText() + " " + jo);
        }

    }

}