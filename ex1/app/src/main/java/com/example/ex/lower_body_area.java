package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lower_body_area extends AppCompatActivity {

    private Button lower_body_button1;
    private Button lower_body_button2;
    private Button lower_body_button3;
    private Button lower_body_button4;
    private Button lower_body_basket_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_body_area);

        lower_body_button1=findViewById(R.id.lower_body_button1);
        lower_body_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lower_body_area.this, leg_1.class);
                startActivity(intent);
            }
        });
        lower_body_button2=findViewById(R.id.lower_body_button2);
        lower_body_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lower_body_area.this, leg_2.class);
                startActivity(intent);
            }
        });

        lower_body_button3=findViewById(R.id.lower_body_button3);
        lower_body_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lower_body_area.this, leg_3.class);
                startActivity(intent);
            }
        });

        lower_body_button4=findViewById(R.id.lower_body_button4);
        lower_body_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lower_body_area.this,leg_4.class);
                startActivity(intent);
            }
        });

        lower_body_basket_button = findViewById(R.id.lower_body_basket_button);
        lower_body_basket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lower_body_area.this, basket.class);
                startActivity(intent);
            }
        });

    }
}