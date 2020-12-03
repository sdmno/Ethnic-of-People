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

public class back_1 extends AppCompatActivity {

    private Button back1_choose;
    private EditText back1_set;
    private String Temp = "플랫";
    private int num;
    TextView back1_text;
    RadioGroup back1_rg ;
    RadioButton back1_rb1;
    RadioButton back1_rb2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_1);

        back1_text = findViewById(R.id.back1_text);

        back1_set = findViewById(R.id.back1_set);

        back1_rg = (RadioGroup)findViewById(R.id.back1_rg);

        back1_rb1 = findViewById(R.id.back1_rb1);
        back1_rb2 = findViewById(R.id.back1_rb2);


        back1_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.back1_rb1){
                    back1_text.setText("바벨을 이용하는 운동방법\n자극부위(광배근, 승모근 중부, 능형근)");
                    Temp = back1_rb1.getText().toString();
                }
                else if (checkedId == R.id.back1_rb2){
                    back1_text.setText("덤벨을 이용하는 운동방법\n자극부위(광배근, 승모근 중부, 능형근)");
                    Temp = back1_rb2.getText().toString();
                }

            }
        });

        back1_choose = findViewById(R.id.back1_choose);

        back1_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(back1_set.getText().toString());
                Temp = Temp + " 푸쉬 업";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(back_1.this, back_area.class);
                startActivity(intent);
            }
        });
    }
}