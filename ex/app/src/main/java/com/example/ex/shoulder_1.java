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

public class shoulder_1 extends AppCompatActivity {

    private Button shoulder1_choose;
    private EditText shoulder1_set;
    private String Temp = "프런트";
    private int num;
    TextView shoulder1_text;
    RadioGroup shoulder1_rg ;
    RadioButton shoulder1_rb1;
    RadioButton shoulder1_rb2;
    RadioButton shoulder1_rb3;
    RadioButton shoulder1_rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_1);

        shoulder1_text = findViewById(R.id.shoulder1_text);

        shoulder1_set = findViewById(R.id.shoulder1_set);

        shoulder1_rg = (RadioGroup)findViewById(R.id.shoulder1_rg);

        shoulder1_rb1 = findViewById(R.id.shoulder1_rb1);
        shoulder1_rb2 = findViewById(R.id.shoulder1_rb2);
        shoulder1_rb3 = findViewById(R.id.shoulder1_rb3);

        shoulder1_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.shoulder1_rb1){
                    shoulder1_text.setText("덤벨을 앞으로 올리는 레이즈\n자극부위 : 후면삼각근");
                    Temp = shoulder1_rb1.getText().toString();
                }
                else if (checkedId == R.id.shoulder1_rb2){
                    shoulder1_text.setText("덤벨을 옆으로 올리는 레이즈\n자극부위 : 삼각근");
                    Temp = shoulder1_rb2.getText().toString();
                }
                else if (checkedId == R.id.shoulder1_rb3){
                    shoulder1_text.setText("상체를 숙인 후 팔을 올리는 레이즈\n자극부위 : 삼각근");
                    Temp = shoulder1_rb3.getText().toString();
                }
                else if (checkedId == R.id.shoulder1_rb4){
                    shoulder1_text.setText("덤벨을 옆으로 들어 어깨힘으로 들어올리는 프레스\n자극부위 : 측면 삼각근의 근선명도");
                    Temp = shoulder1_rb4.getText().toString();
                }
            }
        });

        shoulder1_choose = findViewById(R.id.shoulder1_choose);

        shoulder1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(shoulder1_set.getText().toString());
                Temp = Temp + " 레이즈";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(shoulder_1.this, shoulder_area.class);
                startActivity(intent);
            }
        });
    }
}