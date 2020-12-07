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

public class abs_2 extends AppCompatActivity {

    private Button abs2_choose;
    private EditText abs2_set;
    private String Temp = "베이직";
    private int num;
    TextView abs2_text;
    RadioGroup abs2_rg ;
    RadioButton abs2_rb1;
    RadioButton abs2_rb2;
    RadioButton abs2_rb3;
    RadioButton abs2_rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_2);

        abs2_text = findViewById(R.id.abs2_text);

        abs2_set = findViewById(R.id.abs2_set);

        abs2_rg = (RadioGroup)findViewById(R.id.abs2_rg);

        abs2_rb1 = findViewById(R.id.abs2_rb1);
        abs2_rb2 = findViewById(R.id.abs2_rb2);
        abs2_rb3 = findViewById(R.id.abs2_rb3);
        abs2_rb4 = findViewById(R.id.abs2_rb4);

        abs2_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.abs2_rb1){
                    abs2_text.setText("일반적인 크런치\n자극부위 : 복직근, 상복부");
                    Temp = abs2_rb1.getText().toString();
                }
                else if (checkedId == R.id.abs2_rb2){
                    abs2_text.setText("기구를 사용하는 크런치\n자극부위 : 복직근, 상복부");
                    Temp = abs2_rb2.getText().toString();
                }
                else if (checkedId == R.id.abs2_rb3){
                    abs2_text.setText("자전거 페달을 밟듯이 하는 크런치\n자극부위 : 복사근, 상복부 및 복부 전체");
                    Temp = abs2_rb3.getText().toString();
                }
                else if (checkedId == R.id.abs2_rb4){
                    abs2_text.setText("거꾸로 다리가 올라오는 크런치\n자극부위 : 하복부");
                    Temp = abs2_rb4.getText().toString();
                }
            }
        });

        abs2_choose = findViewById(R.id.abs2_choose);

        abs2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(abs2_set.getText().toString());
                Temp = Temp + " 크런치";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(abs_2.this, stomach_area.class);
                startActivity(intent);
            }
        });
    }
}