package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class basket extends AppCompatActivity {

    private TextView basket_abs_1;
    private TextView basket_abs_2;
    private TextView basket_abs_3;
    private TextView basket_abs_4;
    private TextView basket_back_1;
    private TextView basket_back_2;
    private TextView basket_back_3;
    private TextView basket_back_4;
    private TextView basket_chest_1;
    private TextView basket_chest_2;
    private TextView basket_chest_3;
    private TextView basket_chest_4;
    private TextView basket_leg_1;
    private TextView basket_leg_2;
    private TextView basket_leg_3;
    private TextView basket_leg_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        basket_back_1 =findViewById(R.id.basket_back_1);

        Intent intent_back_1 = getIntent();
        intent_back_1.getStringExtra("back_str1");
        String back_str1 = intent_back_1.getStringExtra("back_str1");

        basket_back_1.setText(back_str1);


        basket_back_2 =findViewById(R.id.basket_back_2);

        Intent intent_back_2 = getIntent();
        intent_back_2.getStringExtra("back_str2");
        String back_str2 = intent_back_2.getStringExtra("back_str2");

        basket_back_2.setText(back_str2);


        basket_back_3 =findViewById(R.id.basket_back_3);

        Intent intent_back_3 = getIntent();
        intent_back_3.getStringExtra("back_str3");
        String back_str3 = intent_back_3.getStringExtra("back_str3");

        basket_back_3.setText(back_str3);


        basket_back_4 =findViewById(R.id.basket_back_4);

        Intent intent_back_4 = getIntent();
        intent_back_4.getStringExtra("back_str4");
        String back_str4 = intent_back_4.getStringExtra("back_str4");

        basket_back_4.setText(back_str4);


        basket_leg_1 =findViewById(R.id.basket_leg_1);

        Intent intent_leg_1 = getIntent();
        intent_leg_1.getStringExtra("leg_str1");
        String leg_str1 = intent_leg_1.getStringExtra("leg_str1");

        basket_leg_1.setText(leg_str1);


        basket_leg_2 =findViewById(R.id.basket_leg_2);

        Intent intent_leg_2 = getIntent();
        intent_leg_2.getStringExtra("leg_str2");
        String leg_str2 = intent_leg_2.getStringExtra("leg_str2");

        basket_leg_2.setText(leg_str2);


        basket_leg_3 =findViewById(R.id.basket_leg_3);

        Intent intent_leg_3 = getIntent();
        intent_leg_3.getStringExtra("leg_str3");
        String leg_str3 = intent_leg_3.getStringExtra("leg_str3");

        basket_leg_3.setText(leg_str3);


        basket_leg_4 =findViewById(R.id.basket_leg_4);

        Intent intent_leg_4 = getIntent();
        intent_leg_4.getStringExtra("leg_str4");
        String leg_str4 = intent_leg_4.getStringExtra("leg_str4");

        basket_leg_4.setText(leg_str4);


        basket_abs_1 =findViewById(R.id.basket_abs_1);

        Intent intent_abs_1 = getIntent();
        intent_abs_1.getStringExtra("abs_str1");
        String abs_str1 = intent_abs_1.getStringExtra("abs_str1");

        basket_abs_1.setText(abs_str1);


        basket_abs_2 =findViewById(R.id.basket_abs_2);

        Intent intent_abs_2 = getIntent();
        intent_abs_2.getStringExtra("abs_str2");
        String abs_str2 = intent_abs_2.getStringExtra("abs_str2");

        basket_abs_2.setText(abs_str2);


        basket_abs_3 =findViewById(R.id.basket_abs_3);

        Intent intent_abs_3 = getIntent();
        intent_abs_3.getStringExtra("abs_str3");
        String abs_str3 = intent_abs_3.getStringExtra("abs_str3");

        basket_abs_3.setText(abs_str3);


        basket_abs_4 =findViewById(R.id.basket_abs_4);

        Intent intent_abs_4 = getIntent();
        intent_abs_4.getStringExtra("abs_str4");
        String abs_str4 = intent_abs_4.getStringExtra("abs_str4");

        basket_abs_4.setText(abs_str4);


        basket_chest_1 =findViewById(R.id.basket_chest_1);

        Intent intent_chest_1 = getIntent();
        intent_chest_1.getStringExtra("chest_str1");
        String chest_str1 = intent_abs_1.getStringExtra("chest_str1");

        basket_chest_1.setText(chest_str1);


        basket_chest_2 =findViewById(R.id.basket_chest_2);

        Intent intent_chest_2 = getIntent();
        intent_chest_2.getStringExtra("chest_str2");
        String chest_str2 = intent_chest_2.getStringExtra("chest_str2");

        basket_chest_2.setText(chest_str2);


        basket_chest_3 =findViewById(R.id.basket_chest_3);

        Intent intent_chest_3 = getIntent();
        intent_chest_3.getStringExtra("chest_str3");
        String chest_str3 = intent_abs_3.getStringExtra("chest_str3");

        basket_chest_3.setText(chest_str3);


        basket_chest_4 =findViewById(R.id.basket_chest_4);

        Intent intent_chest_4 = getIntent();
        intent_chest_4.getStringExtra("chest_str4");
        String chest_str4 = intent_abs_4.getStringExtra("chest_str4");

        basket_chest_4.setText(chest_str4);
    }
}