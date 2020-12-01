package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class back extends AppCompatActivity {

    private Button backward;
    private Button back_1;
    private Button back_2;
    private Button back_3;
    private Button back_4;
    private Button basket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        back_1 = findViewById(R.id.back_1);
        back_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back.this, back_1.class);
                startActivity(intent);
            }
        });
        back_2 = findViewById(R.id.back_2);
        back_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back.this, back_2.class);
                startActivity(intent);
            }
        });

        back_3 = findViewById(R.id.back_3);
        back_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back.this, back_3.class);
                startActivity(intent);
            }
        });

        back_4 = findViewById(R.id.back_4);
        back_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back.this, abs_4.class);
                startActivity(intent);
            }
        });


        basket = findViewById(R.id.basket);
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back.this, basket.class);
                startActivity(intent);
            }
        });


        backward = findViewById(R.id.backward);

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}