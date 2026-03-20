package com.berk.bilim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class PLAY extends AppCompatActivity {
    public static LinearLayout l, l2, l3;

    public static CheckBox checkBox_Goshmak, checkBox_Ayyrmak, checkBox_Kopetmek, checkBox_Bolmek, checkBox_Ansat_level, checkBox_Orta_level, checkBox_Gyn_level, checkBox_Users_level;

    public static EditText edit_Users_tizlik, edit_Users_sanlan_sany, edit_Users_from, edit_Users_to;

    public static String Users_tizlik = null, Users_sanlan_sany = null, Users_from = null, Users_to = null;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public String err1;
    public String err2;
    public String err3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        l = findViewById(R.id.lin1);
        l2 = findViewById(R.id.lin2);
        l3 = findViewById(R.id.lin3);

        checkBox_Goshmak = findViewById(R.id.checkBox);
        checkBox_Ayyrmak = findViewById(R.id.checkBox1);
        checkBox_Kopetmek = findViewById(R.id.checkBox2);
        checkBox_Bolmek = findViewById(R.id.checkBox3);
        checkBox_Ansat_level = findViewById(R.id.checkBox4);
        checkBox_Orta_level = findViewById(R.id.checkBox5);
        checkBox_Gyn_level = findViewById(R.id.checkBox6);
        checkBox_Users_level = findViewById(R.id.checkBox7);
        checkBox_Goshmak.setChecked(true);
        checkBox_Ansat_level.setChecked(true);

        TextView t1 = findViewById(R.id.textView13);
        TextView t2 = findViewById(R.id.textView14);
        TextView t3 = findViewById(R.id.textView15);
        TextView t4 = findViewById(R.id.textView16);
        TextView t5 = findViewById(R.id.textView17);
        Button b = findViewById(R.id.button3);

        edit_Users_tizlik = findViewById(R.id.editTextNumber);
        edit_Users_sanlan_sany = findViewById(R.id.editTextNumber1);
        edit_Users_from = findViewById(R.id.editTextNumber2);
        edit_Users_to = findViewById(R.id.editTextNumber3);

        if (MainActivity.tm) {
            t1.setText(R.string.alamatlar_tm);
            t2.setText(R.string.kyncylyk_tm);
            t3.setText(R.string.tizlik_tm);
            t4.setText(R.string.san_cyk_tm);
            t5.setText(R.string.san_aralyk_tm);

            checkBox_Ansat_level.setText(R.string.ansat_tm);
            checkBox_Orta_level.setText(R.string.orta_tm);
            checkBox_Gyn_level.setText(R.string.kyn_tm);
            checkBox_Users_level.setText(R.string.ozunce_tm);

            b.setText(R.string.basla_tm);

            err1 = getString(R.string.sandoldur_tm);
            err2 = getString(R.string.sanbashy_tm);
            err3 = getString(R.string.cykjaksan_tm);

            t3.setTextSize(18.0F);
            t4.setTextSize(18.0F);
            t5.setTextSize(18.0F);
        } else if (MainActivity.en) {
            t1.setText(R.string.alamatlar_en);
            t2.setText(R.string.kyncylyk_en);
            t3.setText(R.string.tizlik_en);
            t4.setText(R.string.san_cyk_en);
            t5.setText(R.string.san_aralyk_en);

            checkBox_Ansat_level.setText(R.string.ansat_en);
            checkBox_Orta_level.setText(R.string.orta_en);
            checkBox_Gyn_level.setText(R.string.kyn_en);
            checkBox_Users_level.setText(R.string.ozunce_en);

            b.setText(R.string.basla_en);

            err1 = getString(R.string.sandoldur_en);
            err2 = getString(R.string.sanbashy_en);
            err3 = getString(R.string.cykjaksan_en);

            t3.setTextSize(15.0F);
            t4.setTextSize(13.0F);
            t5.setTextSize(15.0F);
        } else if (MainActivity.ru) {
            t1.setText(R.string.alamatlar_ru);
            t2.setText(R.string.kyncylyk_ru);
            t3.setText(R.string.tizlik_ru);
            t4.setText(R.string.san_cyk_ru);
            t5.setText(R.string.san_aralyk_ru);

            checkBox_Ansat_level.setText(R.string.ansat_ru);
            checkBox_Orta_level.setText(R.string.orta_ru);
            checkBox_Gyn_level.setText(R.string.kyn_ru);
            checkBox_Users_level.setText(R.string.ozunce_ru);

            b.setText(R.string.basla_ru);

            err1 = getString(R.string.sandoldur_ru);
            err2 = getString(R.string.sanbashy_ru);
            err3 = getString(R.string.cykjaksan_ru);

            t3.setTextSize(15.0F);
            t4.setTextSize(13.0F);
            t5.setTextSize(15.0F);
        }
    }

    public static boolean tr;

    public void m(View v) {
        if (v == checkBox_Goshmak && !checkBox_Kopetmek.isChecked()) {
            checkBox_Goshmak.setChecked(true);
        } else if (v == checkBox_Kopetmek && !checkBox_Goshmak.isChecked() && !checkBox_Kopetmek.isChecked()) {
            checkBox_Goshmak.setChecked(true);
        }


        if (!checkBox_Users_level.isChecked()) {
            l.setVisibility(View.INVISIBLE);
            l2.setVisibility(View.INVISIBLE);
            l3.setVisibility(View.INVISIBLE);
        } else {
            l.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
        }

        if (v == checkBox_Users_level) {
            tr = true;
            checkBox_Ansat_level.setChecked(false);
            checkBox_Orta_level.setChecked(false);
            checkBox_Gyn_level.setChecked(false);
        } else if (v == checkBox_Ansat_level) {
            tr = false;
            checkBox_Users_level.setChecked(false);
            checkBox_Orta_level.setChecked(false);
            checkBox_Gyn_level.setChecked(false);
            l.setVisibility(View.INVISIBLE);
            l2.setVisibility(View.INVISIBLE);
            l3.setVisibility(View.INVISIBLE);
        } else if (v == checkBox_Orta_level) {
            tr = false;
            checkBox_Users_level.setChecked(false);
            checkBox_Ansat_level.setChecked(false);
            checkBox_Gyn_level.setChecked(false);
            l.setVisibility(View.INVISIBLE);
            l2.setVisibility(View.INVISIBLE);
            l3.setVisibility(View.INVISIBLE);
        } else if (v == checkBox_Gyn_level) {
            tr = false;
            checkBox_Users_level.setChecked(false);
            checkBox_Ansat_level.setChecked(false);
            checkBox_Orta_level.setChecked(false);
            l.setVisibility(View.INVISIBLE);
            l2.setVisibility(View.INVISIBLE);
            l3.setVisibility(View.INVISIBLE);
        }
        if (v == checkBox_Orta_level && !checkBox_Orta_level.isChecked() || v == checkBox_Gyn_level && !checkBox_Gyn_level.isChecked() || v == checkBox_Users_level && !checkBox_Users_level.isChecked() || v == checkBox_Ansat_level) {
            if (!checkBox_Ansat_level.isChecked()) {
                tr = false;
                checkBox_Ansat_level.setChecked(true);
                l.setVisibility(View.INVISIBLE);
                l2.setVisibility(View.INVISIBLE);
                l3.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void gogogo(View v) {
        Users_tizlik = String.valueOf(edit_Users_tizlik.getText());
        Users_sanlan_sany = String.valueOf(edit_Users_sanlan_sany.getText());
        Users_from = String.valueOf(edit_Users_from.getText());
        Users_to = String.valueOf(edit_Users_to.getText());

        GOGOGO.Users_tizlik = Users_tizlik;
        GOGOGO.Users_sanlan_sany = Users_sanlan_sany;
        GOGOGO.Users_from = Users_from;
        GOGOGO.Users_to = Users_to;

        GOGOGO.checkBox_Goshmak = checkBox_Goshmak;
        GOGOGO.checkBox_Ayyrmak = checkBox_Ayyrmak;
        GOGOGO.checkBox_Kopetmek = checkBox_Kopetmek;
        GOGOGO.checkBox_Bolmek = checkBox_Bolmek;
        GOGOGO.checkBox_Ansat_level = checkBox_Ansat_level;
        GOGOGO.checkBox_Orta_level = checkBox_Orta_level;
        GOGOGO.checkBox_Gyn_level = checkBox_Gyn_level;
        GOGOGO.checkBox_Users_level = checkBox_Users_level;

        if (!tr) {
            startActivity(new Intent(PLAY.this, Starter.class));
        } else {
            if (String.valueOf(edit_Users_from.getText()).isEmpty() || String.valueOf(edit_Users_to.getText()).isEmpty() || String.valueOf(edit_Users_tizlik.getText()).isEmpty() || String.valueOf(edit_Users_sanlan_sany.getText()).isEmpty()) {
                Toast.makeText(PLAY.this, err1, Toast.LENGTH_SHORT).show();
            } else if (Objects.equals(Users_from, Users_to)) {
                Toast.makeText(PLAY.this, err2, Toast.LENGTH_SHORT).show();
            } else if (Objects.equals(Users_sanlan_sany, "1") || Objects.equals(Users_sanlan_sany, "0")) {
                Toast.makeText(PLAY.this, err3, Toast.LENGTH_SHORT).show();
            } else {
                startActivity(new Intent(PLAY.this, Starter.class));
            }
        }
    }
}