package com.example.prevod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv,hodnota,vysledek;
    SeekBar move;
    int pr1;
    int zb1, zb2, zb3, zb4,value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text);
        hodnota = findViewById(R.id.tvalue);
        vysledek = findViewById(R.id.tprevod);
        move = findViewById(R.id.seekBar);

        move.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pr1 = progress;
                hodnota.setText(String.valueOf(pr1));
                value = progress;

                zb1 = value % 2;
                value /= 2;
                zb2 = value % 2;
                value /= 2;
                zb3 = value % 2;
                value /= 2;
                zb4 = value % 2;

                int x1 = zb1;
                int x2 = zb2;
                int x3 = zb3;
                int x4 = zb4;

                vysledek.setText(String.valueOf(zb4) +  String.valueOf(zb3)  +  String.valueOf(zb2) + String.valueOf(zb1));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
