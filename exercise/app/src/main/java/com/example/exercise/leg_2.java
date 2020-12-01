package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class leg_2 extends AppCompatActivity {

    private Button leg2_choose;
    private EditText leg2_set;
    private String leg_str2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_2);


        leg2_set = findViewById(R.id.leg2_set);


        leg2_choose = findViewById(R.id.leg2_choose);
        leg2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leg_str2 = leg2_set.getText().toString();
                Intent intent = new Intent(leg_2.this, basket.class);
                intent.putExtra("leg_str2", leg_str2);
                startActivity(intent);
            }
        });
    }
}