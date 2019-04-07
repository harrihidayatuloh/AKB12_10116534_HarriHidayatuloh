package com.example.lat1_akb12_10116534_harrihidayatuloh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*
 * Created By
 *
 * NIM     : 10116534
 * Nama    : Harri Hidayatuloh
 * Kelas   : AKB-12
 * Tanggal : 5 April 2019
 *
 * */
public class MainActivity extends AppCompatActivity {

    Button btn_Mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getBooleanExtra("EXIT", false))
        {
            finish();
        }

        btn_Mulai = (Button) findViewById(R.id.btnMulai);
        btn_Mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.lat1_akb12_10116534_harrihidayatuloh.MainActivity.this, kodek.class);
                startActivity(i);
            }
        });
    }
}
