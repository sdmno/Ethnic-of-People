package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class abs_1 extends AppCompatActivity {

    private Button abs1_choose;
    private EditText abs1_set;
    private String Temp = "플랫";
    private int num;
    TextView abs1_text;
    RadioGroup abs1_rg ;
    RadioButton abs1_rb1;
    RadioButton abs1_rb2;
    ImageView abs1_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_1);

        abs1_text = findViewById(R.id.abs1_text);

        abs1_set = findViewById(R.id.abs1_set);

        abs1_rg = (RadioGroup)findViewById(R.id.abs1_rg);

        abs1_rb1 = findViewById(R.id.abs1_rb1);
        abs1_rb2 = findViewById(R.id.abs1_rb2);

        abs1_image = findViewById(R.id.abs1_image);

        abs1_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.abs1_rb1){
                    abs1_text.setText("일반적인 레그 레이즈\n자극부위 : 하복부 및 복부 전체");
                    abs1_image.setImageResource(R.drawable.leg_raise);
                    Temp = abs1_rb1.getText().toString();
                }
                else if (checkedId == R.id.abs1_rb2){
                    abs1_text.setText("철봉이나 평행봉에 매달린 형태로 진행하는 레그 레이즈\n자극부위 : 하복부 및 복부 전체");
                    abs1_image.setImageResource(R.drawable.hanging_leg_raise);
                    Temp = abs1_rb2.getText().toString();
                }
            }
        });

        abs1_choose = findViewById(R.id.abs1_choose);

        abs1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(abs1_set.getText().toString());
                Temp = Temp + " 레그 레이즈";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(abs_1.this, stomach_area.class);
                startActivity(intent);
            }
        });
    }
}