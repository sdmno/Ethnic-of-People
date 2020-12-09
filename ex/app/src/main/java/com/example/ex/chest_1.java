package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class chest_1 extends AppCompatActivity {

    private Button chest1_choose;
    private EditText chest1_set;
    private String Temp = "플랫";
    private int num;
    TextView chest1_text;
    RadioGroup chest1_rg ;
    RadioButton chest1_rb1;
    RadioButton chest1_rb2;
    RadioButton chest1_rb3;
    RadioButton chest1_rb4;
    ImageView chest1_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_1);

        chest1_text = findViewById(R.id.chest1_text);

        chest1_set = findViewById(R.id.chest1_set);

        chest1_rg = (RadioGroup)findViewById(R.id.chest1_rg);

        chest1_rb1 = findViewById(R.id.chest1_rb1);
        chest1_rb2 = findViewById(R.id.chest1_rb2);
        chest1_rb3 = findViewById(R.id.chest1_rb3);
        chest1_rb4 = findViewById(R.id.chest1_rb4);

        chest1_image = findViewById(R.id.chest1_image);

        chest1_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.chest1_rb1){
                    chest1_text.setText("일반적인 푸쉬업\n자극부위 : 대흉근 ( 주로 가슴근육 바깥부분 ), 삼각근 (어깨근육), 삼두근");
                    chest1_image.setImageResource(R.drawable.push_up);
                    Temp = chest1_rb1.getText().toString();
                }
                else if (checkedId == R.id.chest1_rb2){
                    chest1_text.setText("손을 높은 곳에 지탱한체 하는 푸쉬업\n자극부위 : 가슴 하부, 삼두");
                    chest1_image.setImageResource(R.drawable.incline_push_up);
                    Temp = chest1_rb2.getText().toString();
                }
                else if (checkedId == R.id.chest1_rb3){
                    chest1_text.setText("다리를 높은 곳에 고정쉬킨뒤 하는 푸쉬업\n자극부위 : 가슴상부, 삼두근, 삼각근");
                    chest1_image.setImageResource(R.drawable.decline_push_up);
                    Temp = chest1_rb3.getText().toString();
                }
                else if (checkedId == R.id.chest1_rb4){
                    chest1_text.setText("팔을 넓게 벌린채로 하는 푸쉬업\n자극부위 : 대흉근 ( 주로 가슴근육 바깥부분 ), 삼각근 (어깨근육), 삼두근, 등근육");
                    chest1_image.setImageResource(R.drawable.wide_push_up);
                    Temp = chest1_rb4.getText().toString();
                }
            }
        });

        chest1_choose = findViewById(R.id.chest1_choose);

        chest1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(chest1_set.getText().toString());
                Temp = Temp + " 푸쉬업";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(chest_1.this, chest_area.class);
                startActivity(intent);
            }
        });
    }
}