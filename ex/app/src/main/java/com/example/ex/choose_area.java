package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose_area extends AppCompatActivity {
    private Button chest;
    private Button lower_body;
    private Button stomach;
    private Button shoulder;
    private Button Whole_body;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_area);


        chest=findViewById(R.id.chest);
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent chest_screen=new Intent( choose_area.this,chest_area.class);
               startActivity(chest_screen);
            }
        });

        lower_body=findViewById(R.id.lower_body);
        lower_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lower_body_screen=new Intent(choose_area.this,lower_body_area.class);
                startActivity(lower_body_screen);
            }
        });
        stomach=findViewById(R.id.stomach);
        stomach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stomach_screen=new Intent(choose_area.this, stomach_area.class);
                startActivity(stomach_screen);

            }
        });
        shoulder=findViewById(R.id.shoulder);
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoulder_screen=new Intent(choose_area.this, shoulder_area.class);
                startActivity(shoulder_screen);
            }
        });
        Whole_body=findViewById(R.id.Whole_body);
        Whole_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Whole_body_screen=new Intent(choose_area.this,Whole_body_area.class);
                startActivity(Whole_body_screen);
            }
        });
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_screen=new Intent(choose_area.this,back_area.class);
                startActivity(back_screen);
            }
        });






    }
}