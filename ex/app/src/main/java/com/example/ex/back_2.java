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

public class back_2 extends AppCompatActivity {

    private Button back2_choose;
    private EditText back2_set;
    private String Temp = "";
    private int num;
    TextView back2_text;
    RadioGroup back2_rg ;
    RadioButton back2_rb1;
    RadioButton back2_rb2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_2);

        back2_text = findViewById(R.id.back2_text);

        back2_set = findViewById(R.id.back2_set);

        back2_choose = findViewById(R.id.back2_choose);

        back2_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(back2_set.getText().toString());
                Temp = Temp + "데드리프트";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(back_2.this, back_area.class);
                startActivity(intent);
            }
        });
    }
}