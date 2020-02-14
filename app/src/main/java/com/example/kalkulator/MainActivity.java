package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnsin, btncos, btntan, btncsc, btnsec, btncot, btnlog;
    private TextView tvhsl;
    private EditText etangka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etangka = findViewById(R.id.angka);
        btnsin = findViewById(R.id.sin);
        btncos = findViewById(R.id.cos);
        btntan = findViewById(R.id.tan);
        btncsc = findViewById(R.id.csc);
        btnsec = findViewById(R.id.sec);
        btncot = findViewById(R.id.cot);
        btnlog = findViewById(R.id.log);
        tvhsl = findViewById(R.id.hsl);


        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSin = etangka.getText().toString();

                    double dSin = Double.parseDouble(sSin);

                    double hasilSin = Math.sin(dSin);
                    String sHasilSin = String.valueOf(hasilSin);

                    tvhsl.setText(sHasilSin);
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCos = etangka.getText().toString();

                    double dCos = Double.parseDouble(sCos);

                    double hasilCos = Math.cos(dCos);
                    String sHasilCos = String.valueOf(hasilCos);

                    tvhsl.setText(sHasilCos);
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sTan = etangka.getText().toString();

                    double dTan = Double.parseDouble(sTan);

                    double hasilTan = Math.tan(dTan);
                    String sHasilTan = String.valueOf(hasilTan);

                    tvhsl.setText(sHasilTan);
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCsc = etangka.getText().toString();

                    double dCsc = Double.parseDouble(sCsc);

                    double hasilCsc = 1.0/Math.sin(dCsc);
                    String sHasilCsc = String.valueOf(hasilCsc);

                    tvhsl.setText(sHasilCsc);
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSec = etangka.getText().toString();

                    double dSec = Double.parseDouble(sSec);

                    double hasilSec = 1.0/Math.cos(dSec);
                    String sHasilSec = String.valueOf(hasilSec);

                    tvhsl.setText(sHasilSec);
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCot = etangka.getText().toString();

                    double dCot = Double.parseDouble(sCot);

                    double hasilCot = 1.0/Math.tan(dCot);
                    String sHasilCot = String.valueOf(hasilCot);

                    tvhsl.setText(sHasilCot);
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sLog = etangka.getText().toString();

                    double dLog = Double.parseDouble(sLog);

                    double hasilLog = Math.log10(dLog);
                    String sHasilLog = String.valueOf(hasilLog);

                    tvhsl.setText(sHasilLog);
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
