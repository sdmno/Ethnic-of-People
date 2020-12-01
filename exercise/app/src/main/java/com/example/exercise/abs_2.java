package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class abs_2 extends AppCompatActivity {

    private Button abs2_choose;
    private EditText abs2_set;
    private String abs_str2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_2);

        abs2_set = findViewById(R.id.abs2_set);


        abs2_choose = findViewById(R.id.abs2_choose);
        abs2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abs_str2 = abs2_set.getText().toString();
                Intent intent = new Intent(abs_2.this, basket.class);
                intent.putExtra("abs_str2", abs_str2);
                startActivity(intent);
            }
        });
    }
}