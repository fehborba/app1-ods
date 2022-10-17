package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS1Activity extends AppCompatActivity {
    Button btnSair, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods1);
        //BOTÃO SAIR
        btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });

        //BOTÃO ABRE TELA
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent ODS1 = new Intent( getApplicationContext(),ODS1Activity.class);
                startActivity(ODS1);
            }
        });

    }
}