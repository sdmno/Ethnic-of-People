package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class leg extends AppCompatActivity {

    private Button backward;
    private Button leg_1;
    private Button leg_2;
    private Button leg_3;
    private Button leg_4;
    private Button basket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);

        leg_1=findViewById(R.id.leg_1);
        leg_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leg.this, leg_1.class);
                startActivity(intent);
            }
        });
        leg_2=findViewById(R.id.leg_2);
        leg_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leg.this, leg_2.class);
                startActivity(intent);
            }
        });

        leg_3=findViewById(R.id.leg_3);
        leg_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leg.this, leg_3.class);
                startActivity(intent);
            }
        });

        leg_4=findViewById(R.id.leg_4);
        leg_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leg.this, leg_4.class);
                startActivity(intent);
            }
        });



        basket=findViewById(R.id.basket);
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leg.this, basket.class);
                startActivity(intent);
            }
        });

        backward = findViewById(R.id.backward);
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leg.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}