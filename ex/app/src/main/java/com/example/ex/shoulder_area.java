package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shoulder_area extends AppCompatActivity {

    private Button shoulder_button1;
    private Button shoulder_button2;
    private Button shoulder_basket_button;
    private Button shoulder_goback_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_area);

        shoulder_button1=findViewById(R.id.shoulder_button1);
        shoulder_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shoulder_area.this, abs_1.class);
                startActivity(intent);
            }
        });

        shoulder_button2=findViewById(R.id.shoulder_button2);
        shoulder_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shoulder_area.this, abs_2.class);
                startActivity(intent);
            }
        });

        shoulder_basket_button = findViewById(R.id.shoulder_basket_button);
        shoulder_basket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shoulder_area.this, basket.class);
                startActivity(intent);
            }
        });

        shoulder_goback_button = findViewById(R.id.shoulder_goback_button);
        shoulder_goback_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shoulder_area.this, choose_area.class);
                startActivity(intent);
            }
        });
    }
}