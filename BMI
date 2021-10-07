package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_vaha, tv_vyska, tv_bmi;
    Button vypocet;
    SeekBar sb_vaha, sb_vyska;
    int pr_vaha = 30, pr_vyska = 100;
    double bmi = 0.0, pr_vyska_metry = 1.0;
    String bmi_text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

        vypocet = findViewById(R.id.btn_vypocet);
        tv_bmi = findViewById(R.id.tv_bmi);

        tv_vaha = findViewById(R.id.tv_vaha);
        tv_vyska = findViewById(R.id.tv_vyska);
        sb_vaha = findViewById(R.id.bar_vaha);
        sb_vyska = findViewById(R.id.bar_vyska);


        sb_vaha.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pr_vaha = progress;
                tv_vaha.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
        sb_vyska.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pr_vyska = progress;
                pr_vyska_metry = (double)progress / 100;
                tv_vyska.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

    }

    public void vypocetBMI(View vypocet) {
        bmi = (double)pr_vaha / (pr_vyska_metry*pr_vyska_metry);

        if (bmi < 20) { bmi_text = "Podváha!"; }
        else if (bmi < 25) { bmi_text = "Norma"; }
        else if (bmi < 30)  { bmi_text = "Nadváha"; }
        else { bmi_text = "Obezita"; }

        tv_bmi.setText(bmi_text);
        tv_bmi.setVisibility(View.VISIBLE);
    }
}
