package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class back_3 extends AppCompatActivity {

    private Button back3_choose;
    private EditText back3_set;
    private String back_str3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_3);


        back3_set = findViewById(R.id.back3_set);


        back3_choose = findViewById(R.id.back3_choose);
        back3_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_str3 = back3_set.getText().toString();
                Intent intent = new Intent(back_3.this, basket.class);
                intent.putExtra("back_str3", back_str3);
                startActivity(intent);
            }
        });
    }
}