package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class abs extends AppCompatActivity {

    private Button backward;
    private Button abs_1;
    private Button abs_2;
    private Button abs_3;
    private Button abs_4;
    private Button basket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);

        abs_1 = findViewById(R.id.abs_1);
        abs_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs.this, abs_1.class);
                startActivity(intent);
            }
        });
        abs_2 = findViewById(R.id.abs_2);
        abs_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs.this, abs_2.class);
                startActivity(intent);
            }
        });

        abs_3 = findViewById(R.id.abs_3);
        abs_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs.this, abs_3.class);
                startActivity(intent);
            }
        });

        abs_4 = findViewById(R.id.abs_4);
        abs_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs.this, abs_4.class);
                startActivity(intent);
            }
        });


        basket = findViewById(R.id.basket);
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs.this, basket.class);
                startActivity(intent);
            }
        });


        backward = findViewById(R.id.backward);

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
