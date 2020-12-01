package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class back_2 extends AppCompatActivity {

    private Button back2_choose;
    private EditText back2_set;
    private String back_str2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_2);


        back2_set = findViewById(R.id.back2_set);


        back2_choose = findViewById(R.id.back2_choose);
        back2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_str2 = back2_set.getText().toString();
                Intent intent = new Intent(back_2.this, basket.class);
                intent.putExtra("back_str2", back_str2);
                startActivity(intent);
            }
        });
    }
}