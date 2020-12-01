package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class basket extends AppCompatActivity {
    RecyclerView rview;
    ListAdapter adapter;
    ItemTouchHelper helper;

    Button start_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        rview = findViewById(R.id.rview);

        //RecyclerView의 레이아웃 방식을 지정
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rview.setLayoutManager(manager);

        //RecyclerView의 Adapter 세팅
        adapter = new ListAdapter();
        rview.setAdapter(adapter);

        //ItemTouchHelper 생성
        helper = new ItemTouchHelper(new ItemTouchHelperCallback(adapter));
        //RecyclerView에 ItemTouchHelper 붙이기
        helper.attachToRecyclerView(rview);
        //Adapter에 데이터 추가

        adapter.addItem(new exercise_list("인클라인 푸쉬업", 3));
        adapter.addItem(new exercise_list("디클라인 벤치 프레스",1));
        adapter.addItem(new exercise_list("딥스",4));
        adapter.addItem(new exercise_list("플랫 덤벨 플라이",1));

        start_btn = findViewById(R.id.start_btn);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rview.setAdapter(adapter);
            }
        });
    }
}

