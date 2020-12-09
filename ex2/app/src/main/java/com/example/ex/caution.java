package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class caution extends AppCompatActivity {
    TextView caution_name;
    TextView caution_caution;
    ImageView caution_image;
    static exercise_list temp;
    Button caution_button;

    public static exercise_list get_exercise_list()
    {
        return temp;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caution);

        caution_name = findViewById(R.id.caution_name);
        caution_image = findViewById(R.id.caution_image);
        caution_caution = findViewById(R.id.caution_caution);
        caution_button = findViewById(R.id.caution_button);
        temp = basket.getAdapter().pop_items();
        caution_caution.setMovementMethod(new ScrollingMovementMethod());

        caution_name.setText(temp.get_name());

        if (temp.get_name().equals("플랫 푸쉬업")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 엎드린 상태에서 양손을 어깨너비보다 약간 넓게 벌려 바닥을 짚습니다. 발목에서 어깨까지 직선이 되도록 합니다. 복근은 최대한 조이고 이 운동을 하는 동안 내내 수축 상태를 유지하도록 합니다.\n" +
                    "2. 양팔꿈치는 상체 옆부분에 붙이고 가슴이 거의 바닥에 닿도록 몸을 낮춥니다. 잠시 멈췄다가 다시 팔을 펴서 처음 자세로 돌아옵니다.\n" +
                    "\n" +
                    "주의사항 : 동작을 실시하는 내내 등은 곧게 편 상태를 유지하기, 푸시업 최고 지점에서는 팔꿈치를 완전히 펴기");
        }
        else if (temp.get_name().equals("인클라인 푸쉬업")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 양손을 어깨너비보다 조금 넓게 벌리고 높은 곳에 올려 기본적인 팔굽혀펴기 자세를 취합니다. 팔꿈치는 완전히 펴서 고정합니다.\n" +
                    "2. 몸을 일직선으로 유지하면서 가슴을 높은 지면 쪽으로 내립니다. 잠시 멈췄다가 시작 자세로 몸을 들어 올리고 코어는 힘을 준 상태로 유지합니다.\n" +
                    "\n" +
                    "주의사항 : 팔꿈치가 밖으로 벌어지지 않도록 하기, 엉덩이를 높이 들어 올리지 않기");
        }
        else if (temp.get_name().equals("디클라인 푸쉬업")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 양발은 높은 곳에 올리고 양손은 어깨너비보다 조금 넓게 벌려 기본적인 팔굽혀펴기 자세를 취합니다. 팔꿈치는 완전히 펴서 고정합니다.\n" +
                    "2. 몸을 일직선으로 유지하면서 가슴을 바닥으로 내립니다. 잠시 멈췄다가 시작 자세로 몸을 들어 올리고 코어는 힘을 준 상태로 유지합니다.\n" +
                    "\n" +
                    "주의사항 : 발을 너무 높은 곳에 올리면 손목부상을 입을 수 있음");
        }
        else if (temp.get_name().equals("와이드 푸쉬업")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 손과 발을 어깨너비보다 넓게 벌리고 기본 푸시업 자세를 취합니다. 팔꿈치는 완전히 펴서 고정하고 몸은 머리에서 발까지 일직선이어야 합니다.\n" +
                    "2. 코어에 힘을 주고 가슴을 천천히 바닥 쪽으로 내린 후, 바닥 바로 위에서 2초간 멈춥니다. 흉근과 삼두근에 힘을 주어 처음 위치로 올라옵니다.\n" +
                    "\n" +
                    "주의사항 : 베이직(일반) 푸쉬업 에서 손의 넓이를 1.5배 가량 더 넓게 잡아주기");
        }
        else if (temp.get_name().equals("인클라인 벤치 프레스")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 벤치에 누워 엉덩이와 어깨를 벤치에 밀착시킨다.\n" +
                    "2. 양발을 바닥 또는 벤치의 발걸이에 붙이고,턱을 가슴쪽으로 당긴다.\n" +
                    "3. 허리는 살짝 띄우되, 등을 과도하게 아치형으로 만들지 않는다.\n" +
                    "4. 어깨보다 넓게 바를 잡는다.\n" +
                    "5. 바를 들어올린 후, 쇄골 아래 지점으로 숨을 들이쉬며 천천히 바를 내린다.\n" +
                    "6. 바닥에서 바벨을 잠시 멈춘 후, 숨을 내쉬며 힘있게 바를 들어올린다.\n" +
                    "\n" +
                    "주의사항 : 허리를 과도하게 아치형으로 만들게 되면 플랫 벤치프레스가 된다. 반동을 이용하지 않는다.\n" +
                    "플랫 벤치프레스와 비교하여 삼각근의 참여도가 높아지기 때문에 어깨 근육에 대한 워밍업 및 스트레칭을 충분히 실시한다.");
        }
        else if (temp.get_name().equals("디클라인 벤치 프레스")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 경사진 벤치의 발걸이에 양발을 걸친다.\n" +
                    "2. 벤치에 누워 엉덩이와 어깨를 벤치에 밀착시키고,턱을 가슴쪽으로 당긴다.\n" +
                    "3. 허리는 살짝 띄우되, 등을 과도하게 아치형으로 만들지 않는다.\n" +
                    "4. 어깨보다 넓게 바를 잡는다.\n" +
                    "5. 바를 들어올린 후, 유두 아래 지점으로 숨을 들이쉬며 천천히 바를 내린다.\n" +
                    "6. 바닥에서 바벨을 잠시 멈춘 후, 숨을 내쉬며 힘있게 바를 들어올린다.\n" +
                    "\n" +
                    "주의사항 : 인클라인에 비해 쉽다고 너무 무거운 중량을 사용하지 않는다.\n" +
                    "바를 너무 좁게 잡지 않는다.");
        }
        else if (temp.get_name().equals("플랫 벤치 프레스")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 바벨이 얼굴 위에 오도록 벤치 위에 눕는다.\n" +
                    "2. 엉덩이와 어깨를 벤치에 밀착시키고, 턱을 가슴쪽으로 당기고, 양발을 바닥에 닿는다.\n" +
                    "3. 허리는 살짝 띄우되, 등을 과도하게 아치형으로 만들지는 않는다.\n" +
                    "4. 어깨 넓이보다 약간 넓게 바벨을 잡고 들어올린다.\n" +
                    "5. 숨을 들이쉬면서 가슴의 중간 부분까지 천천히 바벨을 내린다.\n" +
                    "6. 가슴 위에서 바벨을 잠시 멈춘 후 숨을 내쉬면서 힘차게 들어올린다.\n" +
                    "\n" +
                    "주의사항 : 동작 중 엉덩이를 들지 않기\n" +
                    "발을 벤치 위에 올려 놓지 않기 양발은 바닥을 밀듯이 바닥에 밀착시키기\n" +
                    "반동을 이용하지 않기\n" +
                    "스트레칭과 워밍업 세트를 실시하기 고중량을 다루는 특성상 충분한 워밍업이 필요");
        }
        else if (temp.get_name().equals("딥스")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 손목, 팔꿈치, 어깨를 스트레칭을 통해 충분히 풀어주세요.\n" +
                    "2. 평행으로 된 바를 잡고 머신에 올라옵니다.\n" +
                    "3. 허리는 곧게 편 상태로 엉덩이만 살짝 뒤로 빼줍니다.\n" +
                    "   (골반을 살짝 접어 상체를 20~30도 정도 앞으로 숙인 상태로 중심을 잡습니다.)\n" +
                    "4. 팔을 굽히면서 수직으로 내려옵니다.\n" +
                    "5. 숨을 내쉬면서 원위치로 올라옵니다.\n" +
                    "\n" +
                    "주의사항 : 손목 - 팔꿈치 - 어깨가 75~90도가 될 때까지만 내려주기(어깨 부상위험이 있음)");
        }
        else if (temp.get_name().equals("플랫 덤벨 플라이")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 덤벨을 양손에 들고 벤치에 앉는다.\n" +
                    "2. 가슴 옆에 덤벨을 붙인 후 벤치에 누은 후 턱을 가슴쪽으로 당긴다.\n" +
                    "3. 허리는 살짝 띄우되, 등을 과도하게 아치형으로 만들지 않는다.\n" +
                    "4. 팔을 벌려 팔꿈치를 아치형으로 만들어 덤벨을 벌려 잡는다.\n" +
                    "5. 팔꿈치의 각도를 고정시킨 상태에서 숨을 내쉬며 어깨 관절만을 움직여 껴안듯이 덤벨을 모아준다.\n" +
                    "6. 숨을 들이쉬며 천천히 가슴 위치까지 덤벨을 내린다.\n" +
                    "\n" +
                    "주의사항 : 플라이 운동은 가벼운 무게로 정확한 자세를 유지하며, 천천히 실시하기");
        }
        else if (temp.get_name().equals("인클라인 덤벨 플라이")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 덤벨을 양손에 들고 벤치에 앉는다.\n" +
                    "2. 가슴 옆에 덤벨을 붙인 후 벤치에 누은 후 턱을 가슴쪽으로 당긴다.\n" +
                    "3. 허리는 살짝 띄우되, 등을 과도하게 아치형으로 만들지 않는다.\n" +
                    "4. 팔을 벌려 팔꿈치를 아치형으로 만들어 덤벨을 벌려 잡는다.\n" +
                    "5. 팔꿈치의 각도를 고정시킨 상태에서 숨을 내쉬며 어깨 관절만을 움직여 껴안듯이 덤벨을 모아준다.\n" +
                    "6. 숨을 들이쉬며 천천히 가슴 위치까지 덤벨을 내린다.\n" +
                    "\n" +
                    "주의사항 : 플라이 운동은 가벼운 무게로 정확한 자세를 유지하며, 천천히 실시하기");
        }
        else if (temp.get_name().equals("디클라인 덤벨 플라이")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 덤벨을 양손에 들고 벤치에 앉는다.\n" +
                    "2. 가슴 옆에 덤벨을 붙인 후 벤치에 누은 후 턱을 가슴쪽으로 당긴다.\n" +
                    "3. 허리는 살짝 띄우되, 등을 과도하게 아치형으로 만들지 않는다.\n" +
                    "4. 팔을 벌려 팔꿈치를 아치형으로 만들어 덤벨을 벌려 잡는다.\n" +
                    "5. 팔꿈치의 각도를 고정시킨 상태에서 숨을 내쉬며 어깨 관절만을 움직여 껴안듯이 덤벨을 모아준다.\n" +
                    "6. 숨을 들이쉬며 천천히 가슴 위치까지 덤벨을 내린다.\n" +
                    "\n" +
                    "주의사항 : 플라이 운동은 가벼운 무게로 정확한 자세를 유지하며, 천천히 실시하기");
        }
        else if (temp.get_name().equals("")) {
            //caution_image.setImageResource();
            caution_caution.setText("");
        }
        else if (temp.get_name().equals("")) {
            //caution_image.setImageResource();
            caution_caution.setText("");
        }

        caution_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(caution.this, act_timer.class);
                startActivity(intent);
            }
        });
    }
}