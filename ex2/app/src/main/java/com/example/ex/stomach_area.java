package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stomach_area extends AppCompatActivity {

    private Button stomach_button1;
    private Button stomach_button2;
    private Button stomach_button3;
    private Button stomach_button4;
    private Button stomach_basket_button;
    private Button stomach_goback_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stomach_area);

        stomach_button1=findViewById(R.id.stomach_button1);
        stomach_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(stomach_area.this, abs_1.class);
                startActivity(intent);
            }
        });
        stomach_button2=findViewById(R.id.stomach_button2);
        stomach_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(stomach_area.this, abs_2.class);
                startActivity(intent);
            }
        });

        stomach_button3=findViewById(R.id.stomach_button3);
        stomach_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(stomach_area.this, abs_3.class);
                startActivity(intent);
            }
        });

        stomach_button4=findViewById(R.id.stomach_button4);
        stomach_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(stomach_area.this,abs_4.class);
                startActivity(intent);
            }
        });

        stomach_basket_button = findViewById(R.id.stomach_basket_button);
        stomach_basket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(stomach_area.this, basket.class);
                startActivity(intent);
            }
        });

        stomach_goback_button = findViewById(R.id.stomach_goback_button);
        stomach_goback_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(stomach_area.this, choose_area.class);
                startActivity(intent);
            }
        });
    }
}