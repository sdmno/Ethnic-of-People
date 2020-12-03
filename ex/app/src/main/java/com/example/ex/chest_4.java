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

public class chest_4 extends AppCompatActivity {

    private Button chest4_choose;
    private EditText chest4_set;
    private String Temp = "플랫";
    private int num;
    TextView chest4_text;
    RadioGroup chest4_rg ;
    RadioButton chest4_rb1;
    RadioButton chest4_rb2;
    RadioButton chest4_rb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_4);


        chest4_text = findViewById(R.id.chest4_text);

        chest4_set = findViewById(R.id.chest4_set);

        chest4_rg = (RadioGroup)findViewById(R.id.chest4_rg);

        chest4_rb1 = findViewById(R.id.chest4_rb1);
        chest4_rb2 = findViewById(R.id.chest4_rb2);
        chest4_rb3 = findViewById(R.id.chest4_rb3);

        chest4_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.chest4_rb1){
                    chest4_text.setText("덤벨을 이용한 대흉근 고립 운동\n자극부위 : 가슴분리(대흉근, 삼각근)");
                    Temp = chest4_rb1.getText().toString();
                }
                else if (checkedId == R.id.chest4_rb2){
                    chest4_text.setText("비스듬히 세워진 벤치에서 하는 덤벨 플라이 (머리가 위쪽)\n자극부위 : 가슴윗부분 분리(대흉근, 상완삼두근, 삼각근)");
                    Temp = chest4_rb2.getText().toString();
                }
                else if (checkedId == R.id.chest4_rb3) {
                    chest4_text.setText("땅을 향해 기울어진 벤치 위에서 하는 덤벨 플라이 (머리가 땅쪽)\n자극부위 : 가슴하부 분리(대흉근, 삼각근)");
                    Temp = chest4_rb3.getText().toString();
                }
            }
        });

        chest4_choose = findViewById(R.id.chest4_choose);

        chest4_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(chest4_set.getText().toString());
                Temp = Temp + " 덤벨 플라이";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(chest_4.this, chest_area.class);
                startActivity(intent);
            }
        });
    }
}