package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bagi extends AppCompatActivity {
    private Button btn_hsl;
    private TextView LT_Hasil;
    private EditText x, y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagi);
        btn_hsl = findViewById(R.id.hitung);
        LT_Hasil = findViewById(R.id.hasil);
        x = findViewById(R.id.angka1);
        y = findViewById(R.id.angka2);

        btn_hsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String a = x.getText().toString();
                    String b = y.getText().toString();
                    double c = Double.parseDouble(a);
                    double d = Double.parseDouble(b);
                    double hsl = c/d;
                    String hsl_cek = String.valueOf(hsl);
                    LT_Hasil.setText(hsl_cek);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"silahkan isi keseluruhan", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
