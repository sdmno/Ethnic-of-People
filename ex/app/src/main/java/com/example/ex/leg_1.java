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

public class leg_1 extends AppCompatActivity {

    private Button leg1_choose;
    private EditText leg1_set;
    private String Temp = "풀";
    private int num;
    TextView leg1_text;
    RadioGroup leg1_rg ;
    RadioButton leg1_rb1;
    RadioButton leg1_rb2;
    RadioButton leg1_rb3;
    RadioButton leg1_rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_1);

        leg1_text = findViewById(R.id.leg1_text);

        leg1_set = findViewById(R.id.leg1_set);

        leg1_rg = (RadioGroup)findViewById(R.id.leg1_rg);

        leg1_rb1 = findViewById(R.id.leg1_rb1);
        leg1_rb2 = findViewById(R.id.leg1_rb2);

        leg1_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.leg1_rb1){
                    leg1_text.setText("평행상태보다 좀더 굽히는 스쿼트\n자극부위 : 엉덩이(대둔근), 허벅지앞,뒤(대퇴사두,이두)");
                    Temp = leg1_rb1.getText().toString();
                }
                else if (checkedId == R.id.leg1_rb2){
                    leg1_text.setText("다리를 넓게 벌리고 허리를 낮게 하여 진행하는 스쿼트\n자극부위 : 엉덩이(대둔근), *허벅지 안쪽");
                    Temp = leg1_rb2.getText().toString();
                }
            }
        });

        leg1_choose = findViewById(R.id.leg1_choose);

        leg1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(leg1_set.getText().toString());
                Temp = Temp + " 스쿼트";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(leg_1.this, lower_body_area.class);
                startActivity(intent);
            }
        });
    }
}