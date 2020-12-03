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

public class chest_2 extends AppCompatActivity {

    private Button chest2_choose;
    private EditText chest2_set;
    private String Temp = "플랫";
    private int num;
    TextView chest2_text;
    RadioGroup chest2_rg ;
    RadioButton chest2_rb1;
    RadioButton chest2_rb2;
    RadioButton chest2_rb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_2);


        chest2_text = findViewById(R.id.chest2_text);

        chest2_set = findViewById(R.id.chest2_set);

        chest2_rg = (RadioGroup)findViewById(R.id.chest2_rg);

        chest2_rb1 = findViewById(R.id.chest2_rb1);
        chest2_rb2 = findViewById(R.id.chest2_rb2);
        chest2_rb3 = findViewById(R.id.chest2_rb3);

        chest2_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.chest2_rb1){
                    chest2_text.setText("평평한 벤치에 누워서 하는 벤치 프레스");
                    Temp = chest2_rb1.getText().toString();
                }
                else if (checkedId == R.id.chest2_rb2){
                    chest2_text.setText("비스듬히 세워진 벤치에서 하는 벤치 프레스 (머리가 위쪽)");
                    Temp = chest2_rb2.getText().toString();
                }
                else if (checkedId == R.id.chest2_rb3) {
                    chest2_text.setText("땅을 향해 기울어진 벤치 위에서 하는 벤치 프레스 (머리가 땅쪽)");
                    Temp = chest2_rb3.getText().toString();
                }
            }
        });

        chest2_choose = findViewById(R.id.chest2_choose);

        chest2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(chest2_set.getText().toString());
                Temp = Temp + " 벤치 프레스";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(chest_2.this, chest_area.class);
                startActivity(intent);
            }
        });
    }
}