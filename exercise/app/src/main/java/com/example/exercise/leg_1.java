package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class leg_1 extends AppCompatActivity {

    private Button leg1_choose;
    private EditText leg1_set;
    private String leg_str1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_1);


        leg1_set = findViewById(R.id.leg1_set);


        leg1_choose = findViewById(R.id.leg1_choose);
        leg1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leg_str1 = leg1_set.getText().toString();
                Intent intent = new Intent(leg_1.this, basket.class);
                intent.putExtra("leg_str1", leg_str1);
                startActivity(intent);
            }
        });
    }
}