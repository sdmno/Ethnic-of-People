package com.example.test1_200910;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Act_Timer extends AppCompatActivity {

    SeekBar timeBar;
    TextView timerText;
    TextView set;
    Boolean active = false;
    Button startButton;
    CountDownTimer countDownTimer;
    int i=1;

    public void resetTimer(){
        timerText.setText("0:30");
        timeBar.setProgress(30);
        countDownTimer.cancel();
        startButton.setText("시작");
        timeBar.setEnabled(true);
        active = false;
    }


    public void updateTime(int secondsLeft){

        int minutes = (int) secondsLeft/60;
        int seconds = secondsLeft - minutes*60;

        String sec;

        if (seconds>=0 && seconds<10){
            sec = "0"+seconds;
        }
        else{
            sec = Integer.toString(seconds);
        }
        timerText.setText(Integer.toString(minutes) + ":" + sec);
    }

    public void startClock(View view){


        if (active==false) {
            active = true;
            timeBar.setEnabled(false);
            startButton.setText("정지");
            Log.i("Button", "Pressed");
            countDownTimer = new CountDownTimer(timeBar.getProgress() * 1000 + 100, 1000) {

                @Override
                public void onTick(long millisUntilFinished) {
                    updateTime((int) millisUntilFinished / 1000);
                }

                @Override
                public void onFinish() {
                    i++;
                    resetTimer();
                    if(i%2==0)
                    {
                        set.setText(i/2+" REST");
                    }
                    else {
                        set.setText((i+1)/2 + " SET");
                    }
                    MediaPlayer play = MediaPlayer.create(getApplicationContext(), R.raw.alarm);
                    play.start();
                }
            }.start();
        }
        else {
            resetTimer();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        timeBar = (SeekBar)findViewById(R.id.timeBar);
        timerText = (TextView) findViewById(R.id.timerText);
        set = (TextView) findViewById(R.id.set);
        startButton = (Button) findViewById(R.id.startButton);

        timeBar.setMax(600);
        timeBar.setProgress(30);

        timeBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateTime(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}