package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class back_1 extends AppCompatActivity {

    private Button back1_choose;
    private EditText back1_set;
    private String back_str1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_1);


        back1_set = findViewById(R.id.back1_set);


        back1_choose = findViewById(R.id.back1_choose);
        back1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_str1 = back1_set.getText().toString();
                Intent intent = new Intent(back_1.this, basket.class);
                intent.putExtra("back_str1", back_str1);
                startActivity(intent);
            }
        });
    }
}