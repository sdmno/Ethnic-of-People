package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class back_area extends AppCompatActivity {

    private Button back_button1;
    private Button back_button2;
    private Button back_button3;
    private Button back_button4;
    private Button back_basket_button;
    private Button back_goback_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_area);

        back_button1=findViewById(R.id.back_button1);
        back_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back_area.this, back_1.class);
                startActivity(intent);
            }
        });
        back_button2=findViewById(R.id.back_button2);
        back_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back_area.this, back_2.class);
                startActivity(intent);
            }
        });

        back_button3=findViewById(R.id.back_button3);
        back_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back_area.this, back_3.class);
                startActivity(intent);
            }
        });

        back_button4=findViewById(R.id.back_button4);
        back_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back_area.this,back_4.class);
                startActivity(intent);
            }
        });

        back_basket_button = findViewById(R.id.back_basket_button);
        back_basket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back_area.this, basket.class);
                startActivity(intent);
            }
        });

        back_goback_button = findViewById(R.id.back_goback_button);
        back_goback_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(back_area.this, choose_area.class);
                startActivity(intent);
            }
        });
    }
}