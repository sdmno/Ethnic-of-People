package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class abs_3 extends AppCompatActivity {

    private Button abs3_choose;
    private EditText abs3_set;
    private String abs_str3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_3);

        abs3_set = findViewById(R.id.abs3_set);


        abs3_choose = findViewById(R.id.abs3_choose);
        abs3_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abs_str3 = abs3_set.getText().toString();
                Intent intent = new Intent(abs_3.this, basket.class);
                intent.putExtra("abs_str3", abs_str3);
                startActivity(intent);
            }
        });
    }
}