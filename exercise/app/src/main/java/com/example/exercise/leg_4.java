package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class leg_4 extends AppCompatActivity {

    private Button leg4_choose;
    private EditText leg4_set;
    private String leg_str4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_4);


        leg4_set = findViewById(R.id.leg4_set);


        leg4_choose = findViewById(R.id.leg4_choose);
        leg4_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leg_str4 = leg4_set.getText().toString();
                Intent intent = new Intent(leg_4.this, basket.class);
                intent.putExtra("leg_str4", leg_str4);
                startActivity(intent);
            }
        });
    }
}