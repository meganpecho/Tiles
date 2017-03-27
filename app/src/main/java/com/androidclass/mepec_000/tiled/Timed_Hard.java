package com.androidclass.mepec_000.tiled;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androidclass.mepec_000.tiles.R;

import java.util.Random;


public class Timed_Hard extends AppCompatActivity {
    Button HamburgerMenu, tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8,
                            tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile16;
    static int scoreCounter;
    TextView sc;
    Button rand;
    static long millisLeft;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timed_hard);

        GameModes.current_state = "Timed_Hard";
        millisLeft = 31000;
        scoreCounter = 0;
    }

    @Override
    protected void onPause() {
        super.onPause();
        countDownTimer.cancel();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_timed_hard);

        GameModes.current_state = "Timed_Hard";

        TextView t = (TextView)findViewById(R.id.score_keeper);
        String timeStr = "";
        t.setText(timeStr.format("%d", scoreCounter));


        if(PopUpMenu.shouldFinish) finish();
    }

    @Override
    protected void onResume() {
        super.onResume();

        countDownTimer = new CountDownTimer(millisLeft, 500) {
            TextView t = (TextView)findViewById(R.id.time_keeper);
            public void onTick(long millisUntilFinished) {
                String timeStr = "";
                t.setText(timeStr.format("%d", (millisUntilFinished / 1000)));

                for (int i = 0; i < 10; i++) {
                    selectTiles();
                }
                millisLeft = millisLeft - 500;
            }
            public void onFinish() {
                EndGameMenu.finalScore = scoreCounter;
                Intent intent = new Intent(Timed_Hard.this, EndGameMenu.class);
                startActivity(intent);
                finish();
            }
        }.start();

        rand = (Button) findViewById(R.id.tile_7);
        HamburgerMenu = (Button)findViewById(R.id.menu_button);
        tile1 = (Button)findViewById(R.id.tile_1);
        tile2 = (Button)findViewById(R.id.tile_2);
        tile3 = (Button)findViewById(R.id.tile_3);
        tile4 = (Button)findViewById(R.id.tile_4);
        tile5 = (Button)findViewById(R.id.tile_5);
        tile6 = (Button)findViewById(R.id.tile_6);
        tile7 = (Button)findViewById(R.id.tile_7);
        tile8 = (Button)findViewById(R.id.tile_8);
        tile9 = (Button)findViewById(R.id.tile_9);
        tile10 = (Button)findViewById(R.id.tile_10);
        tile11 = (Button)findViewById(R.id.tile_11);
        tile12 = (Button)findViewById(R.id.tile_12);
        tile13 = (Button)findViewById(R.id.tile_13);
        tile14 = (Button)findViewById(R.id.tile_14);
        tile15 = (Button)findViewById(R.id.tile_15);
        tile16 = (Button)findViewById(R.id.tile_16);

        HamburgerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Timed_Hard.this, PopUpMenu.class);
                startActivity(intent);
                onPause();
            }
        });

        tile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile1.isClickable() && tile1.isSelected()) {
                    tile1.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile2.isClickable() && tile2.isSelected()) {
                    tile2.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile3.isSelected()) {
                    tile3.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile4.isSelected()) {
                    tile4.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile5.isSelected()) {
                    tile5.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile6.isSelected()) {
                    tile6.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile7.isSelected()) {
                    tile7.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile8.isSelected()) {
                    tile8.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile9.isSelected()) {
                    tile9.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile10.isSelected()) {
                    tile10.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile11.isSelected()) {
                    tile11.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile12.isSelected()) {
                    tile12.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile13.isSelected()) {
                    tile13.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile14.isSelected()) {
                    tile14.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile15.isSelected()) {
                    tile15.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
        tile16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile16.isSelected()) {
                    tile16.setSelected(false);
                    addPoint();
                }
                else subtractPoint();
            }
        });
    }

    protected void selectTiles() {
        int[] tileLst = new int[]{R.id.tile_1, R.id.tile_2, R.id.tile_3, R.id.tile_4, R.id.tile_5, R.id.tile_6, R.id.tile_7, R.id.tile_8, R.id.tile_9, R.id.tile_10, R.id.tile_11, R.id.tile_12, R.id.tile_13, R.id.tile_14, R.id.tile_15, R.id.tile_16};
        Random r = new Random();
        int i1 = r.nextInt(1000)%16;
        rand = (Button) findViewById(tileLst[i1]);

        if (rand.isSelected()) {
            rand.setSelected(false);
        }
        else {
            rand.setSelected(true);
        }
    }

    protected void addPoint() {
        scoreCounter++;
        sc = (TextView)findViewById(R.id.score_keeper);
        String s = "";
        sc.setText(s.format("%d",scoreCounter));
    }

    protected void subtractPoint() {
        scoreCounter--;
        sc = (TextView)findViewById(R.id.score_keeper);
        String s = "";
        sc.setText(s.format("%d",scoreCounter));
    }
}
