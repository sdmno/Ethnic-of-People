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

public class chest_3 extends AppCompatActivity {

    private Button chest3_choose;
    private EditText chest3_set;
    private String Temp = "";
    private int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_3);




        chest3_set = findViewById(R.id.chest3_set);


        chest3_choose = findViewById(R.id.chest3_choose);

        chest3_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(chest3_set.getText().toString());
                Temp = Temp + "딥스";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(chest_3.this, chest_area.class);
                startActivity(intent);
            }
        });
    }
}