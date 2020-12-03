package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class back_4 extends AppCompatActivity {

    private Button back4_choose;
    private EditText back4_set;
    private String back_str4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_4);


        back4_set = findViewById(R.id.back4_set);


        back4_choose = findViewById(R.id.back4_choose);
        back4_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_str4 = back4_set.getText().toString();
                Intent intent = new Intent(back_4.this, basket.class);
                intent.putExtra("back_str4", back_str4);
                startActivity(intent);
            }
        });
    }
}