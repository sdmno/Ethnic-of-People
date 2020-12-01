package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class chest_1 extends AppCompatActivity {

    private Button chest1_choose;
    private EditText chest1_set;
    private String chest_str1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_1);


        chest1_set = findViewById(R.id.chest1_set);


        chest1_choose = findViewById(R.id.chest1_choose);
        chest1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_str1 = chest1_set.getText().toString();
                Intent intent = new Intent(chest_1.this, basket.class);
                intent.putExtra("chest_str1", chest_str1);
                startActivity(intent);
            }
        });
    }
}