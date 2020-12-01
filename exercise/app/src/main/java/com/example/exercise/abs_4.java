package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class abs_4 extends AppCompatActivity {

    private Button abs4_choose;
    private EditText abs4_set;
    private String abs_str4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_4);

        abs4_set = findViewById(R.id.abs4_set);


        abs4_choose = findViewById(R.id.abs4_choose);
        abs4_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abs_str4 = abs4_set.getText().toString();
                Intent intent = new Intent(abs_4.this, basket.class);
                intent.putExtra("abs_str4", abs_str4);
                startActivity(intent);
            }
        });
    }
}