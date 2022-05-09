package com.example.playstationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HabilitarNoti extends AppCompatActivity {

    private View btn_voltarTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habilitar_noti);

        btn_voltarTela = findViewById(R.id.btn_noti);

        btn_voltarTela.setOnClickListener(View ->{
                Intent intent = new Intent(HabilitarNoti.this,CompartilhamentoTela.class);
                startActivity(intent);
        });
    }


}