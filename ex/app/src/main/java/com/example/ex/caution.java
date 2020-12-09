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
            caution_image.setImageResource(R.drawable.push_up);
        }
        else if (temp.get_name().equals("인클라인 푸쉬업")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 양손을 어깨너비보다 조금 넓게 벌리고 높은 곳에 올려 기본적인 팔굽혀펴기 자세를 취합니다. 팔꿈치는 완전히 펴서 고정합니다.\n" +
                    "2. 몸을 일직선으로 유지하면서 가슴을 높은 지면 쪽으로 내립니다. 잠시 멈췄다가 시작 자세로 몸을 들어 올리고 코어는 힘을 준 상태로 유지합니다.\n" +
                    "\n" +
                    "주의사항 : 팔꿈치가 밖으로 벌어지지 않도록 하기, 엉덩이를 높이 들어 올리지 않기");
            caution_image.setImageResource(R.drawable.incline_push_up);
        }
        else if (temp.get_name().equals("디클라인 푸쉬업")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 양발은 높은 곳에 올리고 양손은 어깨너비보다 조금 넓게 벌려 기본적인 팔굽혀펴기 자세를 취합니다. 팔꿈치는 완전히 펴서 고정합니다.\n" +
                    "2. 몸을 일직선으로 유지하면서 가슴을 바닥으로 내립니다. 잠시 멈췄다가 시작 자세로 몸을 들어 올리고 코어는 힘을 준 상태로 유지합니다.\n" +
                    "\n" +
                    "주의사항 : 발을 너무 높은 곳에 올리면 손목부상을 입을 수 있음");
            caution_image.setImageResource(R.drawable.decline_push_up);
        }
        else if (temp.get_name().equals("와이드 푸쉬업")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 손과 발을 어깨너비보다 넓게 벌리고 기본 푸시업 자세를 취합니다. 팔꿈치는 완전히 펴서 고정하고 몸은 머리에서 발까지 일직선이어야 합니다.\n" +
                    "2. 코어에 힘을 주고 가슴을 천천히 바닥 쪽으로 내린 후, 바닥 바로 위에서 2초간 멈춥니다. 흉근과 삼두근에 힘을 주어 처음 위치로 올라옵니다.\n" +
                    "\n" +
                    "주의사항 : 베이직(일반) 푸쉬업 에서 손의 넓이를 1.5배 가량 더 넓게 잡아주기");
            caution_image.setImageResource(R.drawable.wide_push_up);
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
            caution_image.setImageResource(R.drawable.incline_bench_press);
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
            caution_image.setImageResource(R.drawable.decline_bench_press);
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
            caution_image.setImageResource(R.drawable.bench_press);
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
            caution_image.setImageResource(R.drawable.dips);
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
            caution_image.setImageResource(R.drawable.dumbbell_fly);
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
            caution_image.setImageResource(R.drawable.incline_dumbbell_fly);
        }
        else if (temp.get_name().equals("플랫 레그 레이즈")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 바닥에 똑바로 눕는다.\n" +
                    "2. 팔은 몸옆에 편안하게 두거나 머리 위로 뻗어준다.\n" +
                    "3. 다리를 동시에 공중으로 들어 올려서 가슴 방향으로 당긴다.\n" +
                    "4. 다시 내려준다.\n" +
                    "\n" +
                    "주의사항: 운동 중에는 무릎을 최대한 펴주고, 다리가 땅에 닿지 안도록 해야한다.");
            caution_image.setImageResource(R.drawable.leg_raise);
        }
        else if (temp.get_name().equals("행잉 레그 레이즈")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 철봉에 매달린다.\n" +
                    "2. 숨을 들이쉬면서 하복부의 힘으로 두 다리를 허리까지 끌어 올린다.\n" +
                    "3. 숨을 내뱉으면서 내려오고 복근을 충분히 이완해준다.\n" +
                    "\n" +
                    "주의사항 : 몸이 앞뒤로 흔들리지 않도록 한다.");
            caution_image.setImageResource(R.drawable.hanging_leg_raise);
        }
        else if (temp.get_name().equals("베이직 크런치")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 바닥에 등을 대고 눕고 다리는 의자 위에 올리거나 무릎을 굽혀서 발바닥을 바닥에 댄다.\n" +
                    "2. 두 손은 가슴에 올리거나 머리 뒤에 댄다.\n" +
                    "3. 등의 아랫부분을 바닥에서 떼지 말고 견갑골을 바닥에서 들어올린다는 느낌으로 복부를 강하게 쥐어짠다.\n" +
                    "4. 상체를 일으키기 전 숨을 들이마시고, 일으키면서 숨을 내쉬고 최고점에서 완전히 숨을 다 뱉는다.\n" +
                    "5. 시작 자세로 내려오면서 숨을 들이 마신다.\n" +
                    "\n" +
                    "주의사항 : 손을 머리 뒤에 댄 경우, 팔의 힘으로 머리를 들어올리지 않는다. \n" +
                    "무리하게 팔의 힘으로 머리를 들어올릴 경우, 척추(경추)에 무리가 갈 수 있다.");
            caution_image.setImageResource(R.drawable.crunch);
        }
        else if (temp.get_name().equals("바이시클 크런치")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 천장을 보고 누워 양손에 깍지를 끼고 머리뒤를 받친다.\n" +
                    "2. 머리는 바닥에서 들어올리고 다리는 직각으로 구부린다.\n" +
                    "3. 몸통을 좌우로 비틀며 왼쪽 무릎과 오른쪽 팔꿈치를 닿게한다.\n" +
                    "4. 다시 원상태로 돌아오며 이번에는 오른쪽 무릎과 왼쪽 팔꿈치를 닿게한다.\n" +
                    "\n" +
                    "주의사항 : 불필요한 반동이나 흔들림을 최소화할것\n" +
                    "머리를 과도하게 잡아당기지 말것\n" +
                    "복근의 자극을 최대한 느끼면서 할것");
            caution_image.setImageResource(R.drawable.bicycle_crunch);
        }
        else if (temp.get_name().equals("리버스 크런치")) {
            //caution_image.setImageResource();
            caution_caution.setText("1.바닥이나 벤치에 눕는다.\n" +
                    "2.무릎을 살짝 구부려서 허리가 바닥에서 10cm정도 떨어질때까지 골반을 둥글게 가슴쪽으로 말아올린다.\n" +
                    "3.하복부에 긴장을 유지하면서 다리를 천천히 내린다.\n" +
                    "\n" +
                    "주의사항 : 초보자는 양손을 바닥에 놓기보다는 양손을 머리 위로 올려서 덤벨이나 벤치의 그립등을 잡고 운동하면 더욱 수월하게 할 수 있다.\n" +
                    "엉덩이를 가슴이 집어넣는다는 느낌으로 다리를 말아 올린다.\n" +
                    "운동시에는 발이 바닥에 닿지 않게하여 복근의 긴장을 최대한 유지한다.\n" +
                    "다리를 최대한 올렸을 때 약1~2초정도 멈추어주면 복근 모양이 더욱 선명해진다.");
            caution_image.setImageResource(R.drawable.reverse_crunch);
        }
        else if (temp.get_name().equals("업도미널")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 롤 패드를 가슴 앞으로 대고 손을 아래서 위로 롤 패드를 감싸 안아줍니다.\n" +
                    "2. 상체를 동그랗게 말아주며 복근을 수축합니다.\n" +
                    "3. 천천히 저항을 느끼며 처음동작으로 돌아갑니다.\n" +
                    "\n" +
                    "주의사항 : 무리하게 중량을 너무 많이 높이면 안된다.\n" +
                    "패드를 돌려 가슴쪽에 고정시키고 몸을 동그랗게 말아줄 때 등이 패드에서 떨어지지 않게 한다.");
            caution_image.setImageResource(R.drawable.abdominal);
        }
        else if (temp.get_name().equals("엘보우 플랭크")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 팔꿈치를 대고 자연스럽게 엎드린다.\n" +
                    "2. 팔꿈치 간격은 어깨너비 정도로 벌린다.\n" +
                    "3. 양손은 자연스럽게 바닥에 붙이거나, 주먹을 쥐고 모으거나 등등 편하게 자세를 잡는다.\n" +
                    "4. 복부에 힘을 주고 배를 자연스럽게 지면에서 띄운다.\n" +
                    "5. 버틴다.\n" +
                    "6. 머리는 축 늘어뜨리지 않도록 한다.\n" +
                    "7. 팔의 각도는 지면과 90도 각도가 되도록 한다.\n" +
                    "\n" +
                    "주의사항 : 날깨뼈가 튀어나오면 안된다. \n" +
                    "초보자의 경우는 복근의 힘이 언제 풀리는지 모르고 무리하게 버티는 경우가 있는데 이렇게 되면 허리에 무리가 갈 수 있다.");
            caution_image.setImageResource(R.drawable.plank);
        }
        else if (temp.get_name().equals("풀 플랭크")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 두 손을 어깨 아래에 오도록 어깨너비로 벌리고 푸쉬업 자세로 엎드린다.\n" +
                    "2. 두 발을 골반너비로 벌려서 어깨부터 발목까지 일직선이 되도록 한다.\n" +
                    "3. 버틴다\n" +
                    "\n" +
                    "주의사항: 머리는 축 늘어뜨리지 않도록 한다.\n" +
                    "팔의 각도는 지면과 90도 각도가 되도록 한다.");
            caution_image.setImageResource(R.drawable.full_plank);
        }
        else if (temp.get_name().equals("사이드 플랭크")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 앨보우 플랭크 자세를 취한다.\n" +
                    "2. 몸을 옆으로 세워 한쪽 팔로 지지해준다.\n" +
                    "3. 어깨와 팔이 일직선이 되도록 만든다.\n" +
                    "4. 버틴다.\n" +
                    "\n" +
                    "주의사항 :바닥을 밀어올리는 쪽 어깨에 힘이 풀리면 운동 동작이 무너지고 어깨 부상 위험이 있으니 주의한다.\n" +
                    "전신거울을 앞에 두고 실시하면 균형잡기가 수월하고 운동 능률이 올라간다.");
            caution_image.setImageResource(R.drawable.side_plank);
        }
        else if (temp.get_name().equals("바벨 로우")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 손등이 앞으로 향하게 바벨을 잡아주세요.\n" +
                    "2. 두 발을 어깨너비 정도로 벌리고 서주세요.\n" +
                    "3. 무릎을 살짝 구부리고 등을 아치형태로 만든 후에 상반신을 45도 정도 숙여주세요.\n" +
                    "4. 손목을 돌려 손바닥이 서로 마주보게 해주세요\n" +
                    "5. 바벨을 하복부 방향으로 잡아당기며 광배근을 수축시켜 줍니다.\n" +
                    "6. 광배근에 집중하며 팔을 서서히 내려 원래자세로 돌아와주세요.\n" +
                    "\n" +
                    "주의사항 : 가슴과 허리는 펴고 엉덩이를 뒤로 쭉 빼주는 것이 효과적이고\n" +
                    "무게중심은 뒷꿈치가 바닥에서 떨어지지 않을 정도로 맞춰주시면 됩니다.");
            caution_image.setImageResource(R.drawable.barbell_row);
        }
        else if (temp.get_name().equals("덤벨 로우")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 손등이 앞으로 향하게 덤벨을 잡아주세요.\n" +
                    "2. 두 발을 어깨너비 정도로 벌리고 서주세요.\n" +
                    "3. 무릎을 살짝 구부리고 등을 아치형태로 만든 후에 상반신을 45도 정도 숙여주세요.\n" +
                    "4. 손목을 돌려 손바닥이 서로 마주보게 해주세요\n" +
                    "5. 덤벨을 하복부 방향으로 잡아당기며 광배근을 수축시켜 줍니다.\n" +
                    "6. 광배근에 집중하며 팔을 서서히 내려 원래자세로 돌아와주세요.\n" +
                    "\n" +
                    "주의사항 : 가슴과 허리는 펴고 엉덩이를 뒤로 쭉 빼주는 것이 효과적이고\n" +
                    "무게중심은 뒷꿈치가 바닥에서 떨어지지 않을 정도로 맞춰주시면 됩니다.");
            caution_image.setImageResource(R.drawable.dumbbell_row);
        }

        else if (temp.get_name().equals("데드리프트")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 다리를 어깨너비로 벌리고 서주세요.\n" +
                    "2. 덤벨을 들어 허벅지 앞에 위치시켜주세요.\n" +
                    "3. 무릎을 조금 굽히고 허리는 아치자세로 엉덩이는 최대한 뒤로 쭉 빼주세요.\n" +
                    "4. 천천히 인사하는 것처럼 상체를 내려주세요.\n" +
                    "5. 팔을 내리며 최대한 이완시켜주고 호흡을 뱉으며 천천히 원래자세로 돌아와주세요.\n" +
                    "\n" +
                    "주의사항 : 허리가 구부러지지 않게 주의한다.");
            caution_image.setImageResource(R.drawable.deadlift);
        }
        else if (temp.get_name().equals("풀업")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 철봉에 양 손을 잡고 매달립니다.\n" +
                    "2. 몸이 흔들리지 않도록 고정하고 숨을 내쉬면서 몸을 끌어올립니다.\n" +
                    "3. 숨을 들이쉬며 시작 자세로 천천히 돌아옵니다.\n" +
                    " \n" +
                    "주의사항 : 동작 중 몸을 잘 고정시켜야 하며, 반동을 이용하지 않습니다.\n" +
                    "시작 자세에 완전히 팔을 펴지 말고 약간 굽힌 상태를 유지 하며 등과 근육의 지속적인 긴장을 유지해줍니다.");
            caution_image.setImageResource(R.drawable.pull_up);
        }
        else if (temp.get_name().equals("랫 풀 다운")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 바를 어깨보다 약간 넓게 잡아줍니다.\n" +
                    "2. 숨을 뱉으며 팔꿈치가 옆구리나 바닥을 찍는 느낌으로 약간 누우며 당겨줍니다.\n" +
                    "3. 숨을 마시며 등의 이완을 느끼며 올라가줍니다.\n" +
                    "4. 등의 수축과 이완을 느끼며 반복해줍니다.\n" +
                    "\n" +
                    "주의사항 : 팔꿈치를 무겁다고 뒤로 빼면서 내리면 등 운동이 되지않으므로 주의\n" +
                    "바를 잡고 내리기 전에 이미 등에 힘을 주어야함.");
            caution_image.setImageResource(R.drawable.lat_pull_down);
        }
        else if (temp.get_name().equals("풀 스쿼트")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 팔짱 끼는 모양으로 양손을 포갠 후 팔꿈치가 어깨 높이에 오게 들어준다.\n" +
                    "2. 뒤꿈치를 어깨 또는 골반너비로 벌린 후 발끝을 바깥쪽 대각선 방향으로 벌린다.\n" +
                    "3. 전신이 일자가 되게 곧게 편다\n" +
                    "4. 숨을 들이쉬면서 쪼그려 앉는다.\n" +
                    "5. 팔꿈치의 위치가 시작자세보다 살짝 높게 들어 가슴과 허리가 곧게 펴지게 한다.\n" +
                    "6. 발로 바닥을 강하게 밀면서 점프하듯이 일어난다.\n" +
                    "7. 완전히 일어나서 몸통을 곧게 편 뒤 호흡을 내뱉는다.\n" +
                    "\n" +
                    "주의사항 : 쪼그린 자세에서 머리부터 골반까지 평행하도록 한다.\n" +
                    "허리가 둥글게 말리거나 고개를 과도하게 숙이거나 젖히지 않도록 한다.\n" +
                    "쪼그린 자세에서 무릎은 2번째 발가락과 일직선을 이룬다는 생각으로 자세를 취한다.");
            caution_image.setImageResource(R.drawable.full_squat);
        }
        else if (temp.get_name().equals("스모 스쿼트")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 팔짱 끼는 모양으로 양손을 포갠 후 팔꿈치가 어깨 높이에 오게 들어준다.\n" +
                    "2. 발을 어깨 너비 보다 넓게 벌리고 발 끝이 바깥으로 향하도록 30도 정도 벌려준다.\n" +
                    "3. 정수리를 위에서 잡아 당기는 느낌으로 시선을 먼 앞을 바라 본다.\n" +
                    "4. 준비자세에서 코로 숨을 들이쉬며 의자에 앉듯이 무릎을 굽힌다.\n" +
                    "5. 입으로 호흡을 내뱉으며 바닥을 미는 느낌으로 일어난다.\n" +
                    "\n" +
                    "주의사항 : 앉은자세에서 머리부터 골반까지 평행하도록 주의한다.\n" +
                    "동작간에 정수리를 당기는 느낌과 허리를 곧게 펴 늘려주는 느낌을 유지한다(허리가 말리지 않도록).\n" +
                    "앉은자세에서 무릎이 2번째 발가락과 평행하도록 한다( 무릎이 안으로 모이지 않도록).\n" +
                    "발뒤꿈치가 바닥에서 떨어지지 않도록 한다.");
            caution_image.setImageResource(R.drawable.sumo_squat);
        }
        else if (temp.get_name().equals("리버스 런지")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 골반 너비로 양발을 벌린다.\n" +
                    "2. 가슴을 펴고 팔꿈치를 구부려 몸통 옆에 붙인다.\n" +
                    "3. 시선은 정면을 바라본다.\n" +
                    "4. 코로 숨을 들이쉬면서 앞발에 무게 중심을 두고 반대쪽 발을 뒤로 빼면서 앉는다.\n" +
                    "5. 앞다리를 기준으로 엉덩이를 뒤로 빼는듯한 느낌으로 앉고 뒷다리는 무릎이 거의 바닥에 닿도록 앉는다.\n" +
                    "6. 앉은 상태로 잠깐 유지한다.\n" +
                    "7. 호흡을 내뱉으며 뒷발로 바닥을 세게 미는듯한 느낌으로 준비자세로 돌아온다.\n" +
                    "\n" +
                    "주의사항 : 상체가 한쪽으로 치우치지 않도록 주의한다(일자로 곧게).\n" +
                    "앉은 자세에서 앞발의 무릎이 발끝을 넘기지 않도록 한다.\n" +
                    "앉은 자세에서 뒷발의 무릎에 땅에 닿지 않도록 한다.\n");
            caution_image.setImageResource(R.drawable.reverse_lunge);
        }
        else if (temp.get_name().equals("사이드 런지")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 허리를 곧게 펴고 발끝을 11자 모양으로 만든 후 시선은 정면을 바라본다.\n" +
                    "2. 양손은 가볍게 말아쥐고 팔을 반으로 접어 가슴 높이에서 손을 포갠다.\n" +
                    "3. 코로 숨을 들이쉬면서 엉덩이를 뒤로 뺀다.\n" +
                    "4. 한 쪽다리에 무게중심을 두고 고정한 채로 반대쪽 다리를 옆으로 이동시킨다.\n" +
                    "5. 무게중심을 둔 다리쪽으로 앉는다.\n" +
                    "6. 이동시킨 다리를 처음 위치로 돌아오면서 준비자세로 돌아온다.\n" +
                    "\n" +
                    "주의사항 : 무게중심이 흔들리지 않도록 허리를 곧게 펴준다.\n" +
                    "엉덩이를 뒤로 빼고 앉을 때 무릎, 발, 엉덩이가 틀어지지 않도록 한다.\n");
            caution_image.setImageResource(R.drawable.side_lunge);
        }
        else if (temp.get_name().equals("프런트 런지")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 골반 너비로 양발을 벌린다.\n" +
                    "2. 가슴을 펴고 팔꿈치를 구부려 몸통 옆에 붙인다.\n" +
                    "3. 시선은 정면을 바라본다.\n" +
                    "4. 코로 숨을 들이쉬면서 앞발에 무게 중심을 두고 반대쪽 발을 앞으로 내밀면서 앉는다.\n" +
                    "5. 앞다리를 구부리면서 자연스럽게 따라가는 느낌으로 앉고 뒷다리는 무릎이 거의 바닥에 닿도록 앉는다.\n" +
                    "6. 앉은 상태로 잠깐 유지한다.\n" +
                    "7. 호흡을 내뱉으며 앞발로 바닥을 세게 미는듯한 느낌으로 준비자세로 돌아온다.\n" +
                    "\n" +
                    "주의사항 : 상체가 한쪽으로 치우치지 않도록 주의한다(일자로 곧게).\n" +
                    "앉은 자세에서 앞발의 무릎이 발끝을 넘기지 않도록 한다.\n" +
                    "앉은 자세에서 뒷발의 무릎에 땅에 닿지 않도록 한다.");
            caution_image.setImageResource(R.drawable.front_lunge);
        }
        else if (temp.get_name().equals("프런트 레이즈")) {
            //caution_image.setImageResource();
            caution_caution.setText("1.어깨너비로 발을 벌리고 덤벨을 들어 손등이 앞을 보게 하면서 허벅지 앞에 위치시킨다.\n" +
                    "2.팔꿈치를 살짝 구부려 고정시킨 후 덤벨을 어깨높이만큼 앞으로 들어올린다.\n" +
                    "3.다시 저항을 느끼면서 허벅지 앞쪽으로 덤벨을 내린다.\n" +
                    "\n" +
                    "주의사항 : 어깨에 동증이 발생할 경우 손이 마주보도록 덤벨을 잡는다.");
            caution_image.setImageResource(R.drawable.front_raise);
        }
        else if (temp.get_name().equals("래터럴 레이즈")) {
            //caution_image.setImageResource();
            caution_caution.setText("1.어깨너비로 다리를 벌리고 덤벨을 들어 손바닥이 몸쪽을 향하게 해서 허벅지 옆에 위치시킨다.\n" +
                    "2.팔꿈치를 살짝 구부려 고정한 상태에서 전완이 어깨와 평행이 될 때까지 덤벨을 양옆으로 들어올린다.\n" +
                    "3.저항을 느끼면서 천천히 덤벨을 허벅지 옆으로 내린다.\n" +
                    "\n" +
                    "주의사항: 어깨높이 이상으로 덤벨을 올릴경우 승모근 운동이 되므로 이에 주의한다.");
            caution_image.setImageResource(R.drawable.lateral_raise);
        }
        else if (temp.get_name().equals("벤트오버 래터럴 레이즈")) {
            //caution_image.setImageResource();
            caution_caution.setText("1.다리를 자연스럽게 벌린 채 무릎을 약간 구부려준 뒤 등을 곧게 펴고 상체를 앞으로 기울여줍니다.\n" +
                    "2.숨을 내쉬며 45도 각도로 수평이 될때까지 들어 올려줍니다.\n" +
                    "3.다시 시작 자세로 돌아오며 숨을 들이쉬어 줍니다.\n" +
                    "\n" +
                    "주의사항 : 상체나 무릎의 반동을 이용하지 않도록 주의한다.");
            caution_image.setImageResource(R.drawable.bent_over_lateral_raise);
        }
        else if (temp.get_name().equals("바벨 숄더프레스")) {
            //caution_image.setImageResource();
            caution_caution.setText("1. 서서 또는 앉은 자세에서 바벨을 어깨너비보다 좀 더 넓은 간격으로 잡아준다.\n" +
                    "2.바벨을 어깨높이만큼 들어올린다.\n" +
                    "3.바를 쇄골 위치에서 정수리 위로 들어올린다.\n" +
                    "4.숨을 들이 마시면서 바벨을 내려준다.\n" +
                    "\n" +
                    "주의사항 : 팔꿈치가 뒤로 빠지지 않게 손목과 팔꿈치 부분이 수직이 되게한다.");
            caution_image.setImageResource(R.drawable.barbell_shoulder_press);
        }
        else if (temp.get_name().equals("덤벨 숄더 프레스")) {
            //caution_image.setImageResource();
            caution_caution.setText("1.적당한 중량의 덤벨을 선택해 가운데 부분을 꽉쥔다.\n" +
                    "2.허리를 곧게 편 자세에서 팔꿈치를 구부려 위로 올려준다.\n" +
                    "3.안쪽 팔근육이 머리 옆에 닿는 느낌으로 두 팔을 머리 위로 들어올린다.\n" +
                    "4.팔꿈치가 가슴 중앙선에 오도록, 손이 귀와 수평을 이루도록 내려준다.\n" +
                    "\n" +
                    "주의사항 : 팔을 넓게 벌릴 경우 바깥쪽으로 중량이 실려 손목과 어깨부상이 생길 수 있다.");
            caution_image.setImageResource(R.drawable.dumbbell_shoulder_press);
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