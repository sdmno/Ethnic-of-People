package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class abs_1 extends AppCompatActivity {

    private Button abs1_choose;
    private EditText abs1_set;
    private String abs_str1;
    private Button backward;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_1);


        abs1_set = findViewById(R.id.abs1_set);


        abs1_choose = findViewById(R.id.abs1_choose);
        abs1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abs_str1 = abs1_set.getText().toString();
                Intent intent = new Intent(abs_1.this, basket.class);
                intent.putExtra("abs_str1", abs_str1);
                startActivity(intent);
            }
        });
    }
}