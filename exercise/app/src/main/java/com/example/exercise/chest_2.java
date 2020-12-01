package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class chest_2 extends AppCompatActivity {

    private Button chest2_choose;
    private EditText chest2_set;
    private String chest_str2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_2);


        chest2_set = findViewById(R.id.chest2_set);


        chest2_choose = findViewById(R.id.chest2_choose);
        chest2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_str2 = chest2_set.getText().toString();
                Intent intent = new Intent(chest_2.this, basket.class);
                intent.putExtra("chest_str2", chest_str2);
                startActivity(intent);
            }
        });
    }
}