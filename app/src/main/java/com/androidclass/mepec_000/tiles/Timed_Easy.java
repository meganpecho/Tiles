package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class Timed_Easy extends AppCompatActivity {
    Button HamburgerMenu;
    int scoreCounter = 0;
    static int finalScore = 0;
    TextView sc;
    Button rand;
    Boolean timeLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timed_easy);
        timeLeft = true;
        rand = (Button) findViewById(R.id.tile_7);
        HamburgerMenu = (Button)findViewById(R.id.menu_button);

        HamburgerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Timed_Easy.this, PopUpMenu.class);
                startActivity(intent);
            }
        });
        updateTime();
//        changeTiles();
    }

    protected void updateTime() {
        new CountDownTimer(31000, 1000) {
            TextView t = (TextView)findViewById(R.id.time_keeper);
            public void onTick(long millisUntilFinished) {
                String timeStr = "";
                selectTiles();
                selectTiles();
                selectTiles();
                selectTiles();
                t.setText(timeStr.format("%d", millisUntilFinished / 1000));

            }

            public void onFinish() {
                finalScore = scoreCounter;
                Intent intent = new Intent(Timed_Easy.this, EndGameMenu.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }

    protected void selectTiles() {
        int[] tileLst = new int[]{R.id.tile_1, R.id.tile_2, R.id.tile_3, R.id.tile_4, R.id.tile_5, R.id.tile_6, R.id.tile_7, R.id.tile_8, R.id.tile_9, R.id.tile_10, R.id.tile_11, R.id.tile_12, R.id.tile_13, R.id.tile_14, R.id.tile_15, R.id.tile_16};
        Random r = new Random();
        int i1 = r.nextInt(1000)%16;
        rand = (Button) findViewById(tileLst[i1]);

//        while (numTiles > 0) {
        if (rand.isSelected()) {
            rand.setSelected(false);
            rand.setClickable(false);
        }
        else {
            rand.setSelected(true);
            rand.setClickable(true);
        }

//            numTiles--;
//        }
    }
//
//    protected void changeTiles() {
//        Random rInt = new Random();
//        while(timeLeft) {
//            int numTiles = rInt.nextInt(1000)%6;
//            selectTiles(numTiles);
//        }
//
//    }

    protected void updateScore() {
        scoreCounter++;
        sc = (TextView)findViewById(R.id.score_keeper);
        String s = "";
        sc.setText(s.format("%d",scoreCounter));
    }

    public void handleClick(View v) {
        if (rand.isClickable() && rand.isSelected()) {
            rand.setSelected(false);
            rand.setClickable(false);
            updateScore();
        }
    }
}
