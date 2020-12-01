package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chest extends AppCompatActivity {

    private Button backward;
    private Button chest_1;
    private Button chest_2;
    private Button chest_3;
    private Button chest_4;
    private Button basket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        chest_1=findViewById(R.id.chest_1);
        chest_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest.this, chest_1.class);
                startActivity(intent);
            }
        });
        chest_2=findViewById(R.id.chest_2);
        chest_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest.this, chest_2.class);
                startActivity(intent);
            }
        });

        chest_3=findViewById(R.id.chest_3);
        chest_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest.this, chest_3.class);
                startActivity(intent);
            }
        });

        chest_4=findViewById(R.id.chest_4);
        chest_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest.this,chest_4.class);
                startActivity(intent);
            }
        });



        basket=findViewById(R.id.basket);
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest.this, basket.class);
                startActivity(intent);
            }
        });

        backward = findViewById(R.id.backward);
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}