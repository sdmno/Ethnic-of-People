package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class abs_3 extends AppCompatActivity {

    private Button abs3_choose;
    private EditText abs3_set;
    private String Temp = "";
    private int num;
    TextView abs3_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_3);

        abs3_text = findViewById(R.id.abs3_text);

        abs3_set = findViewById(R.id.abs3_set);

        abs3_choose = findViewById(R.id.abs3_choose);

        abs3_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(abs3_set.getText().toString());
                Temp = Temp + "업도미널";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(abs_3.this, stomach_area.class);
                startActivity(intent);
            }
        });
    }
}