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

public class shoulder_2 extends AppCompatActivity {

    private Button shoulder2_choose;
    private EditText shoulder2_set;
    private String Temp = "밀리터리";
    private int num;
    TextView shoulder2_text;
    RadioGroup shoulder2_rg ;
    RadioButton shoulder2_rb1;
    RadioButton shoulder2_rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_2);


        shoulder2_text = findViewById(R.id.shoulder2_text);

        shoulder2_set = findViewById(R.id.shoulder2_set);

        shoulder2_rg = (RadioGroup)findViewById(R.id.shoulder2_rg);

        shoulder2_rb1 = findViewById(R.id.shoulder2_rb1);
        shoulder2_rb2 = findViewById(R.id.shoulder2_rb2);

        shoulder2_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.shoulder2_rb1){
                    shoulder2_text.setText("바벨을 반동을 이용하지 않고 팔과 어깨 힘만으로 들어올리는 프레스\n자극부위 : 전면 삼각근");
                    Temp = shoulder2_rb1.getText().toString();
                }
                else if (checkedId == R.id.shoulder2_rb2){
                    shoulder2_text.setText("덤벨을 머리 위로 들어 어깨힘으로 들어올리는 프레스\n자극부위 : 삼각근, 회전근개");
                    Temp = shoulder2_rb2.getText().toString();
                }
            }
        });

        shoulder2_choose = findViewById(R.id.shoulder2_choose);

        shoulder2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(shoulder2_set.getText().toString());
                Temp = Temp + " 프레스";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(shoulder_2.this, shoulder_area.class);
                startActivity(intent);
            }
        });
    }
}