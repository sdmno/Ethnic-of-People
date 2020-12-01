package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class chest_3 extends AppCompatActivity {

    private Button chest3_choose;
    private EditText chest3_set;
    private String chest_str3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_3);


        chest3_set = findViewById(R.id.chest3_set);


        chest3_choose = findViewById(R.id.chest3_choose);
        chest3_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_str3 = chest3_set.getText().toString();
                Intent intent = new Intent(chest_3.this, basket.class);
                intent.putExtra("chest_str3", chest_str3);
                startActivity(intent);
            }
        });
    }
}