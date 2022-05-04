package com.example.playstationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrepareJogar extends AppCompatActivity {

    private View btn_seguinte02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare_jogar);

        btn_seguinte02 = findViewById(R.id.btn_seguinte02);

        btn_seguinte02.setOnClickListener(View -> {
            Intent intent = new Intent(PrepareJogar.this, ContinueConversa.class);
            startActivity(intent);
        });


}
}