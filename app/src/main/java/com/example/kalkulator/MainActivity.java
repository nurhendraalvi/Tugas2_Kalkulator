package com.example.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private Button btn_tambah, btn_kurang, btn_kali, btn_bagi, btn_sudut, btn_akar, btn_log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tambah = findViewById(R.id.Plus);
        btn_kurang = findViewById(R.id.Min);
        btn_kali = findViewById(R.id.cross);
        btn_bagi = findViewById(R.id.div);
        btn_sudut = findViewById(R.id.Sudut);
        btn_akar = findViewById(R.id.Akar);
        btn_log = findViewById(R.id.LOG);

        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Tambah.class);
                startActivity(a);
            }
        });
        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(), MainKurang.class);
                startActivity(b);
            }
        });
        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(), Kali.class);
                startActivity(c);
            }
        });
        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getApplicationContext(), Bagi.class);
                startActivity(d);
            }
        });
        btn_akar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(getApplicationContext(), Akar.class);
                startActivity(e);
            }
        });
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(getApplicationContext(), Log.class);
                startActivity(f);
            }
        });
        btn_sudut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(getApplicationContext(), Sudut.class);
                startActivity(g);
            }
        });
    }

}
