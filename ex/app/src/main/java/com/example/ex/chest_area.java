package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chest_area extends AppCompatActivity {

    private Button chest_button1;
    private Button chest_button2;
    private Button chest_button3;
    private Button chest_button4;
    private Button chest_basket_button;
    private Button chest_goback_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_area);

        chest_button1=findViewById(R.id.chest_button1);

        chest_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_area.this, chest_1.class);
                startActivity(intent);
            }
        });

        chest_button2=findViewById(R.id.chest_button2);
        chest_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_area.this, chest_2.class);
                startActivity(intent);
            }
        });

        chest_button3=findViewById(R.id.chest_button3);
        chest_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_area.this, chest_3.class);
                startActivity(intent);
            }
        });

        chest_button4=findViewById(R.id.chest_button4);
        chest_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_area.this, chest_4.class);
                startActivity(intent);
            }
        });

        chest_basket_button = findViewById(R.id.chest_basket_button);

        chest_basket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_area.this, basket.class);
                startActivity(intent);
            }
        });

        chest_goback_button = findViewById(R.id.chest_goback_button);
        chest_goback_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_area.this, choose_area.class);
                startActivity(intent);
            }
        });
    }
}