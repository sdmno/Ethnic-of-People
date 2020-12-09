package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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
        i = random.nextInt(6);
        finish = findViewById(R.id.finish);
        finish_button = findViewById(R.id.finish_button);
        finish.setMovementMethod(new ScrollingMovementMethod());
        switch (i){
            case 0:
                finish.setText("운동의 고통은 통증일뿐 힘든 것이 아니다.\n-김종국-");
                break;
            case 1:
                finish.setText("운동은 끝나고 먹는 것 까지가 운동이다.\n-김종국-");
                break;
            case 2:
                finish.setText("땀은 지방이 흘리는 눈물");
                break;
            case 3:
                finish.setText("내가 선을 긋는 순간 나의 한계가 결정된다.\n-레슬링 금메달 리스트 심권호-");
                break;
            case 4:
                finish.setText("운동을 위해 시간을 내지 않으면, 병 때문에 시간을 내야할지도 모른다.\n -로빈 샤머-");
                break;
            case 5:
                finish.setText("우리가 늙어서 운동을 그만두는 것이 아니라, 우리가 운동을 그만두기 때문에 늙는 것이다.\n -케너스 쿠퍼-");
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