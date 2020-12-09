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

public class abs_4 extends AppCompatActivity {

    private Button abs4_choose;
    private EditText abs4_set;
    private String Temp = "엘보우";
    private int num;
    TextView abs4_text;
    RadioGroup abs4_rg ;
    RadioButton abs4_rb1;
    RadioButton abs4_rb2;
    RadioButton abs4_rb3;
    ImageView abs4_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_4);


        abs4_text = findViewById(R.id.abs4_text);

        abs4_set = findViewById(R.id.abs4_set);

        abs4_rg = (RadioGroup)findViewById(R.id.abs4_rg);

        abs4_rb1 = findViewById(R.id.abs4_rb1);
        abs4_rb2 = findViewById(R.id.abs4_rb2);
        abs4_rb3 = findViewById(R.id.abs4_rb3);

        abs4_image = findViewById(R.id.abs4_image);
        abs4_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.abs4_rb1){
                    abs4_text.setText("자세를 널빤지처럼 평평하게 엎드린 상태로 실행하는 운동\\n자극부위 : 복근, 전신코어");
                    abs4_image.setImageResource(R.drawable.plank);
                    Temp = abs4_rb1.getText().toString();
                }
                else if (checkedId == R.id.abs4_rb2){
                    abs4_text.setText("팔을 일자로 편채로 하는 플랭크\n자극부위 : 복근, 전신코어");
                    abs4_image.setImageResource(R.drawable.full_plank);
                    Temp = abs4_rb2.getText().toString();
                }
                else if (checkedId == R.id.abs4_rb3) {
                    abs4_text.setText("옆으로 누워서 하는 플랭크\n자극부위 : 옆구리, 코어, 중둔근");
                    abs4_image.setImageResource(R.drawable.side_plank);
                    Temp = abs4_rb3.getText().toString();
                }
            }
        });

        abs4_choose = findViewById(R.id.abs4_choose);

        abs4_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(abs4_set.getText().toString());
                Temp = Temp + " 플랭크";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(abs_4.this, stomach_area.class);
                startActivity(intent);
            }
        });
    }
}