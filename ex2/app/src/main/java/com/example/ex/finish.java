package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class finish extends AppCompatActivity {

    int i;

    Random random;

    TextView finish;
    Button finish_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        random = new Random();
        i = random.nextInt()%5;
        finish = findViewById(R.id.finish);
        finish_button = findViewById(R.id.finish_button);

        switch (i){
            case 0:
                finish.setText("");
                break;
            case 1:
                finish.setText("");
                break;
            case 2:
                finish.setText("");
                break;
            case 3:
                finish.setText("");
                break;
            case 4:
                finish.setText("");
                break;
            default:
                break;
        }

        finish_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(finish.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}