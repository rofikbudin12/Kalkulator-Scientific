package rofik.sman3.kalkulator_algoritma_tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    Button btnSIN, btnCOS, btnTAN, btnSEC, btnCSC, btnCOT, btnLOG;
    EditText etMasukkan;
    TextView tvHasil;
    DecimalFormat format_desimal = new DecimalFormat("###.##########");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSIN = findViewById(R. id.Button1);
        btnCOS = findViewById(R. id.Button2);
        btnTAN = findViewById(R. id.Button3);
        btnSEC = findViewById(R. id.Button4);
        btnCOT = findViewById(R. id.Button6);
        btnCSC = findViewById(R. id.Button5);
        btnLOG = findViewById(R.id.Button7);
        etMasukkan = findViewById(R.id.Masukkan);
        tvHasil = findViewById(R.id.tv_hasil);

        btnSIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = etMasukkan.getText().toString();

                    double angka = Double.parseDouble(sAngka);
                    double sin = Math.sin(Math.toRadians(angka));

                    tvHasil.setText(format_desimal.format(sin));

                }catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Data Masih Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = etMasukkan.getText().toString();

                    double angka = Double.parseDouble(sAngka);
                    double cos = Math.cos(Math.toRadians(angka));

                    tvHasil.setText(format_desimal.format(cos));
                }catch(NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Data Masih Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnTAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = etMasukkan.getText().toString();

                    double angka = Double.parseDouble(sAngka);
                    double tan = Math.tan(Math.toRadians(angka));

                    tvHasil.setText(format_desimal.format(tan));
                }catch(NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Data Masih Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = etMasukkan.getText().toString();

                    double angka = Double.parseDouble(sAngka);
                    double sec = 1.0/Math.cos(Math.toRadians(angka));

                    tvHasil.setText(format_desimal.format(sec));
                }catch(NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Data Masih Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = etMasukkan.getText().toString();

                    double angka = Double.parseDouble(sAngka);
                    double csc = 1.0/Math.sin(Math.toRadians(angka));

                    tvHasil.setText(format_desimal.format(csc));
                }catch(NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Data Masih Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = etMasukkan.getText().toString();

                    double angka = Double.parseDouble(sAngka);
                    double cot = 1/Math.tan(Math.toRadians(angka));

                    tvHasil.setText(format_desimal.format(cot));
                }catch(NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Data Masih Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = etMasukkan.getText().toString();

                    double angka = Double.parseDouble(sAngka);
                    double log = Math.log10(angka);

                    tvHasil.setText(format_desimal.format(log));
                }catch(NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Data Masih Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
