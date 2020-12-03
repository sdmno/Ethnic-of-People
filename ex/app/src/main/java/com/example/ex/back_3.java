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

import org.w3c.dom.Text;

public class back_3 extends AppCompatActivity {

    private Button back3_choose;
    private EditText back3_set;
    private String Temp = "";
    private int num;
    TextView back3_text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_3);

        back3_text = findViewById(R.id.back3_text);

        back3_set = findViewById(R.id.back3_set);

        back3_choose = findViewById(R.id.back3_choose);

        back3_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(back3_set.getText().toString());
                Temp = Temp + "풀업";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(back_3.this, back_area.class);
                startActivity(intent);
            }
        });
    }
}