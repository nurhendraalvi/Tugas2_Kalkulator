package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sudut extends AppCompatActivity implements View.OnClickListener {
    private Button btn_sin, btn_cos, btn_tan, btn_csc, btn_sec, btn_cot;
    private EditText x;
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudut);
        x = findViewById(R.id.Hit_Sudut);
        hasil = findViewById(R.id.Hsl_SDT);
        btn_sin = findViewById(R.id.sin);
        btn_cos = findViewById(R.id.cos);
        btn_tan = findViewById(R.id.tan);
        btn_csc = findViewById(R.id.CSC);
        btn_sec = findViewById(R.id.SEC);
        btn_cot = findViewById(R.id.COT);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_tan.setOnClickListener(this);
        btn_csc.setOnClickListener(this);
        btn_sec.setOnClickListener(this);
        btn_cot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try{
            double a = Double.parseDouble(x.getText().toString());
            double lt_hasil = 0;
            switch (v.getId()){
                case R.id.sin:
                    lt_hasil = Math.sin(a);
                    break;
                case R.id.cos:
                    lt_hasil = Math.cos(a);
                    break;
                case R.id.tan:
                    lt_hasil = Math.tan(a);
                    break;
                case R.id.CSC:
                    lt_hasil = 1/(Math.sin(a));
                    break;
                case R.id.SEC:
                    lt_hasil = 1/(Math.cos(a));
                    break;
                case R.id.COT:
                    lt_hasil = 1/(Math.tan(a));
                    break;
            }
            hasil.setText(String.valueOf(lt_hasil));
        } catch (Exception e){
           Toast.makeText(getApplicationContext(), "masukkan sudut terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }
}
