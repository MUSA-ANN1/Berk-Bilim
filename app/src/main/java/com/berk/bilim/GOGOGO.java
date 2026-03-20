package com.berk.bilim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class GOGOGO extends AppCompatActivity {
    public static int sanlan_sany, sanyn_basy, sanyn_sony;
    public static float tizlik, Jogap;

    public static CheckBox checkBox_Goshmak, checkBox_Ayyrmak, checkBox_Kopetmek, checkBox_Bolmek, checkBox_Ansat_level, checkBox_Orta_level, checkBox_Gyn_level, checkBox_Users_level;

    public static String Users_tizlik = null, Users_sanlan_sany = null, Users_from = null, Users_to = null;

    private int current = 0;

    public static boolean aBoolean = false;

    private Handler handler = new Handler(Looper.getMainLooper());  // Handler for updating the UI
    public static TextView textView;

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

    public static List<Integer> generateRandomNumbers(int size, int start, int end) {
        List<Integer> randomNumbers = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomNumbers.add(random.nextInt(end - start + 1) + start);

            if (checkBox_Bolmek.isChecked()) {
                if (randomNumbers.get(i) % 3 == 0) {
                    randomNumbers.remove(i);
                    i--;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (i != 0) {
                if (Objects.equals(randomNumbers.get(i), randomNumbers.get((i - 1)))) {
                    randomNumbers.remove(i);
                    randomNumbers.add(random.nextInt(end - start + 1) + start);
                    i--;
                }
            }
        }

        return randomNumbers;
    }

    public static List<Integer> generateRandSym(int size) {
        List<Integer> randomSym = new ArrayList<>(size);
        Random random = new Random();
        int end = 3;
        int start = 0;

        for (int i = 0; i < size; i++) {
            randomSym.add(random.nextInt(end - start + 1) + start);

                if (!checkBox_Goshmak.isChecked() && randomSym.get(i) == 0) {
                    randomSym.remove(i);
                    i--;
                } else if (!checkBox_Ayyrmak.isChecked() && randomSym.get(i) == 1) {
                    randomSym.remove(i);
                    i--;
                } else if (!checkBox_Kopetmek.isChecked() && randomSym.get(i) == 2) {
                    randomSym.remove(i);
                    i--;
                } else if (!checkBox_Bolmek.isChecked() && randomSym.get(i) == 3) {
                    randomSym.remove(i);
                    i--;
                }

        }

        return randomSym;
    }

    public static List<String> gen(int size) {
        List<Integer> list = generateRandSym(size);
        List<String> list_str = new ArrayList<>(size);

        for (int i = 0; i < list.size(); i++) {

            if (checkBox_Goshmak.isChecked() && list.get(i) == 0) {
                list_str.add("+");
            }

            if (checkBox_Ayyrmak.isChecked() && list.get(i) == 1) {
                list_str.add("-");
            }

            if (checkBox_Kopetmek.isChecked() && list.get(i) == 2) {
                list_str.add("×");
            }

            if (checkBox_Bolmek.isChecked() && list.get(i) == 3) {
                list_str.add("÷");
            }
        }

        return list_str;
    }

    public static List<Integer> randSanlar = null;

    List<String> randSym = null;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gogogo);
        textView = findViewById(R.id.sanlarcyk);

        if (checkBox_Ansat_level.isChecked()) {
            sanlan_sany = 7;
            sanyn_basy = 1;
            sanyn_sony = 10;
            tizlik = 2;
        } else if (checkBox_Orta_level.isChecked()) {
            sanlan_sany = 11;
            sanyn_basy = 5;
            sanyn_sony = 40;
            tizlik = 0.9f;
        } else if (checkBox_Gyn_level.isChecked()) {
            sanlan_sany = 15;
            sanyn_basy = 100;
            sanyn_sony = 999;
            tizlik = 1.61f;
        } else {
            sanlan_sany = Integer.parseInt(Users_sanlan_sany);
            sanyn_basy = Integer.parseInt(Users_from);
            sanyn_sony = Integer.parseInt(Users_to);
            tizlik = Float.parseFloat(Users_tizlik);
        }

        randSanlar = generateRandomNumbers(sanlan_sany, sanyn_basy, sanyn_sony);

        randSym = gen(sanlan_sany);
        Jogap = 0;
        int a = (int) (0+tizlik*1000);


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (aBoolean) {
                    aBoolean = false;
                    finish();
                } else {
                    if (current < randSym.size()) {
                        textView.setText(" ");


                        if (current == 0) {
                            String currentOperation = "+" + randSanlar.get(current);
                            textView.setText(currentOperation);

                            Jogap += randSanlar.get(current);
                        } else {
                            String currentOperation = randSym.get(current) + randSanlar.get(current);
                            textView.setText(currentOperation);

                            switch (randSym.get(current)) {
                                case "+":
                                    Jogap += randSanlar.get(current);
                                    break;
                                case "-":
                                    Jogap -= randSanlar.get(current);
                                    break;
                                case "×":
                                    Jogap *= randSanlar.get(current);
                                    break;
                                case "÷":
                                    Jogap /= randSanlar.get(current);
                                    break;
                            }
                        }


                        current++;
                        handler.postDelayed(this, a);
                    } else {
                        Jogap_Math.Jogap = Jogap;
                        startActivity(new Intent(GOGOGO.this, Jogap_Math.class));
                        finish();
                    }
                }

            }
        }, 200);
    }
}


