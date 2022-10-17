package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS3Activity extends AppCompatActivity {
    Button btnSair, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods3);

        //BOTÃO DE SAIR
        btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });

        //BOTÃO DE ABRIR TELA
        btn3 = findViewById(R.id.btn2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS3 = new Intent((getApplicationContext(),ODS3Activity.class);
                startActivity(ODS3);
                );
            }
        });

    }
}