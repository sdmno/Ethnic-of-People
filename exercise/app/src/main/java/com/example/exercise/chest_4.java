package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class chest_4 extends AppCompatActivity {

    private Button chest4_choose;
    private EditText chest4_set;
    private String chest_str4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_4);


        chest4_set = findViewById(R.id.chest4_set);


        chest4_choose = findViewById(R.id.chest4_choose);
        chest4_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_str4 = chest4_set.getText().toString();
                Intent intent = new Intent(chest_4.this, basket.class);
                intent.putExtra("chest_str4", chest_str4);
                startActivity(intent);
            }
        });
    }
}