package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class leg_3 extends AppCompatActivity {

    private Button leg3_choose;
    private EditText leg3_set;
    private String leg_str3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_3);


        leg3_set = findViewById(R.id.leg3_set);


        leg3_choose = findViewById(R.id.leg3_choose);
        leg3_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leg_str3 = leg3_set.getText().toString();
                Intent intent = new Intent(leg_3.this, basket.class);
                intent.putExtra("leg_str3", leg_str3);
                startActivity(intent);
            }
        });
    }
}