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

public class leg_2 extends AppCompatActivity {

    private Button leg2_choose;
    private EditText leg2_set;
    private String Temp = "리버스";
    private int num;
    TextView leg2_text;
    RadioGroup leg2_rg ;
    RadioButton leg2_rb1;
    RadioButton leg2_rb2;
    RadioButton leg2_rb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_2);

        leg2_text = findViewById(R.id.leg2_text);

        leg2_set = findViewById(R.id.leg2_set);

        leg2_rg = (RadioGroup)findViewById(R.id.leg2_rg);

        leg2_rb1 = findViewById(R.id.leg2_rb1);
        leg2_rb2 = findViewById(R.id.leg2_rb2);
        leg2_rb3 = findViewById(R.id.leg2_rb3);

        leg2_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.leg2_rb1){
                    leg2_text.setText("한쪽 다리를 고정한 상태에서 반대쪽 다리를 뒤로 빼는 런지\n자극부위 : 엉덩이(대둔근), 허벅지 앞(대퇴사두)");
                    Temp = leg2_rb1.getText().toString();
                }
                else if (checkedId == R.id.leg2_rb2){
                    leg2_text.setText("무게중심을 중앙에 두고 발을 옆으로 빼며 진행하는 런지\n옆구리, 허벅지, 엉덩이, 종아리 바깥");
                    Temp = leg2_rb2.getText().toString();
                }
                else if (checkedId == R.id.leg2_rb3){
                    leg2_text.setText("한쪽 다리를 고정한 상태에서 반대쪽 다리를 앞으로 뻗으며 진행하는 런지\n종아리, *허벅지");
                    Temp = leg2_rb3.getText().toString();
                }
            }
        });

        leg2_choose = findViewById(R.id.leg2_choose);

        leg2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(leg2_set.getText().toString());
                Temp = Temp + " 런지";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(leg_2.this, lower_body_area.class);
                startActivity(intent);
            }
        });
    }
}