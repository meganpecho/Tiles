package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class Timed_Extreme extends AppCompatActivity {
    Button HamburgerMenu, tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8,
            tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile16, tile17,
            tile18, tile19, tile20, tile21, tile22, tile23, tile24, tile25, tile26,
            tile27, tile28, tile29, tile30, tile31, tile32, tile33, tile34, tile35, tile36;

    static int scoreCounter;
    TextView sc;
    Button rand;
    static long millisLeft;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timed_extreme);

        GameModes.current_state = "Timed_Extreme";
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
        setContentView(R.layout.activity_timed_extreme);

        GameModes.current_state = "Timed_extreme";

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
                Intent intent = new Intent(Timed_Extreme.this, EndGameMenu.class);
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
        tile17 = (Button)findViewById(R.id.tile_17);
        tile18 = (Button)findViewById(R.id.tile_18);
        tile19 = (Button)findViewById(R.id.tile_19);
        tile20 = (Button)findViewById(R.id.tile_20);
        tile21 = (Button)findViewById(R.id.tile_21);
        tile22 = (Button)findViewById(R.id.tile_22);
        tile23 = (Button)findViewById(R.id.tile_23);
        tile24 = (Button)findViewById(R.id.tile_24);
        tile25 = (Button)findViewById(R.id.tile_25);
        tile26 = (Button)findViewById(R.id.tile_26);
        tile27 = (Button)findViewById(R.id.tile_27);
        tile28 = (Button)findViewById(R.id.tile_28);
        tile29 = (Button)findViewById(R.id.tile_29);
        tile30 = (Button)findViewById(R.id.tile_30);
        tile31 = (Button)findViewById(R.id.tile_31);
        tile32 = (Button)findViewById(R.id.tile_32);
        tile33 = (Button)findViewById(R.id.tile_33);
        tile34 = (Button)findViewById(R.id.tile_34);
        tile35 = (Button)findViewById(R.id.tile_35);
        tile36 = (Button)findViewById(R.id.tile_36);

        HamburgerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Timed_Extreme.this, PopUpMenu.class);
                startActivity(intent);
                onPause();
            }
        });

        tile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile1.isClickable() && tile1.isSelected()) {
                    tile1.setSelected(false);
                    tile1.setClickable(false);
                    updateScore();
                }
            }
        });
        tile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile2.isClickable() && tile2.isSelected()) {
                    tile2.setSelected(false);
                    tile2.setClickable(false);
                    updateScore();
                }
            }
        });
        tile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile3.isClickable() && tile3.isSelected()) {
                    tile3.setSelected(false);
                    tile3.setClickable(false);
                    updateScore();
                }
            }
        });
        tile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile4.isClickable() && tile4.isSelected()) {
                    tile4.setSelected(false);
                    tile4.setClickable(false);
                    updateScore();
                }
            }
        });
        tile5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile5.isClickable() && tile5.isSelected()) {
                    tile5.setSelected(false);
                    tile5.setClickable(false);
                    updateScore();
                }
            }
        });
        tile6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile6.isClickable() && tile6.isSelected()) {
                    tile6.setSelected(false);
                    tile6.setClickable(false);
                    updateScore();
                }
            }
        });
        tile7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile7.isClickable() && tile7.isSelected()) {
                    tile7.setSelected(false);
                    tile7.setClickable(false);
                    updateScore();
                }
            }
        });
        tile8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile8.isClickable() && tile8.isSelected()) {
                    tile8.setSelected(false);
                    tile8.setClickable(false);
                    updateScore();
                }
            }
        });
        tile9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile9.isClickable() && tile9.isSelected()) {
                    tile9.setSelected(false);
                    tile9.setClickable(false);
                    updateScore();
                }
            }
        });
        tile10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile10.isClickable() && tile10.isSelected()) {
                    tile10.setSelected(false);
                    tile10.setClickable(false);
                    updateScore();
                }
            }
        });
        tile11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile11.isClickable() && tile11.isSelected()) {
                    tile11.setSelected(false);
                    tile11.setClickable(false);
                    updateScore();
                }
            }
        });
        tile12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile12.isClickable() && tile12.isSelected()) {
                    tile12.setSelected(false);
                    tile12.setClickable(false);
                    updateScore();
                }
            }
        });
        tile13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile13.isClickable() && tile13.isSelected()) {
                    tile13.setSelected(false);
                    tile13.setClickable(false);
                    updateScore();
                }
            }
        });
        tile14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile14.isClickable() && tile14.isSelected()) {
                    tile14.setSelected(false);
                    tile14.setClickable(false);
                    updateScore();
                }
            }
        });
        tile15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile15.isClickable() && tile15.isSelected()) {
                    tile15.setSelected(false);
                    tile15.setClickable(false);
                    updateScore();
                }
            }
        });
        tile16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile16.isClickable() && tile16.isSelected()) {
                    tile16.setSelected(false);
                    tile16.setClickable(false);
                    updateScore();
                }
            }
        });
        tile17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile17.isClickable() && tile16.isSelected()) {
                    tile17.setSelected(false);
                    tile17.setClickable(false);
                    updateScore();
                }
            }
        });
        tile18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile18.isClickable() && tile16.isSelected()) {
                    tile18.setSelected(false);
                    tile18.setClickable(false);
                    updateScore();
                }
            }
        });
        tile19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile19.isClickable() && tile16.isSelected()) {
                    tile19.setSelected(false);
                    tile19.setClickable(false);
                    updateScore();
                }
            }
        });
        tile20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile20.isClickable() && tile16.isSelected()) {
                    tile20.setSelected(false);
                    tile20.setClickable(false);
                    updateScore();
                }
            }
        });
        tile21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile21.isClickable() && tile16.isSelected()) {
                    tile21.setSelected(false);
                    tile21.setClickable(false);
                    updateScore();
                }
            }
        });
        tile22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile22.isClickable() && tile16.isSelected()) {
                    tile22.setSelected(false);
                    tile22.setClickable(false);
                    updateScore();
                }
            }
        });
        tile23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile23.isClickable() && tile16.isSelected()) {
                    tile23.setSelected(false);
                    tile23.setClickable(false);
                    updateScore();
                }
            }
        });
        tile24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile24.isClickable() && tile16.isSelected()) {
                    tile24.setSelected(false);
                    tile24.setClickable(false);
                    updateScore();
                }
            }
        });
        tile25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile25.isClickable() && tile16.isSelected()) {
                    tile25.setSelected(false);
                    tile25.setClickable(false);
                    updateScore();
                }
            }
        });
        tile26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile26.isClickable() && tile16.isSelected()) {
                    tile26.setSelected(false);
                    tile26.setClickable(false);
                    updateScore();
                }
            }
        });
        tile27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile27.isClickable() && tile16.isSelected()) {
                    tile27.setSelected(false);
                    tile27.setClickable(false);
                    updateScore();
                }
            }
        });
        tile28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile28.isClickable() && tile16.isSelected()) {
                    tile28.setSelected(false);
                    tile28.setClickable(false);
                    updateScore();
                }
            }
        });
        tile29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile29.isClickable() && tile16.isSelected()) {
                    tile29.setSelected(false);
                    tile29.setClickable(false);
                    updateScore();
                }
            }
        });
        tile30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile30.isClickable() && tile16.isSelected()) {
                    tile30.setSelected(false);
                    tile30.setClickable(false);
                    updateScore();
                }
            }
        });
        tile31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile31.isClickable() && tile16.isSelected()) {
                    tile31.setSelected(false);
                    tile31.setClickable(false);
                    updateScore();
                }
            }
        });
        tile32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile32.isClickable() && tile16.isSelected()) {
                    tile32.setSelected(false);
                    tile32.setClickable(false);
                    updateScore();
                }
            }
        });
        tile33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile33.isClickable() && tile16.isSelected()) {
                    tile33.setSelected(false);
                    tile33.setClickable(false);
                    updateScore();
                }
            }
        });
        tile34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile34.isClickable() && tile16.isSelected()) {
                    tile34.setSelected(false);
                    tile34.setClickable(false);
                    updateScore();
                }
            }
        });
        tile35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile35.isClickable() && tile16.isSelected()) {
                    tile35.setSelected(false);
                    tile35.setClickable(false);
                    updateScore();
                }
            }
        });
        tile36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile36.isClickable() && tile16.isSelected()) {
                    tile36.setSelected(false);
                    tile36.setClickable(false);
                    updateScore();
                }
            }
        });

    }

    protected void selectTiles() {
        int[] tileLst = new int[]{R.id.tile_1, R.id.tile_2, R.id.tile_3, R.id.tile_4, R.id.tile_5, R.id.tile_6, R.id.tile_7,
                R.id.tile_8, R.id.tile_9, R.id.tile_10, R.id.tile_11, R.id.tile_12, R.id.tile_13, R.id.tile_14, R.id.tile_15,
                R.id.tile_16, R.id.tile_17, R.id.tile_18, R.id.tile_19, R.id.tile_20, R.id.tile_21, R.id.tile_22, R.id.tile_23,
                R.id.tile_24, R.id.tile_25, R.id.tile_26, R.id.tile_27, R.id.tile_28, R.id.tile_29, R.id.tile_30, R.id.tile_31,
                R.id.tile_32, R.id.tile_33, R.id.tile_34, R.id.tile_35, R.id.tile_36};
        Random r = new Random();
        int i1 = r.nextInt(1000)%36;
        rand = (Button) findViewById(tileLst[i1]);

        if (rand.isSelected()) {
            rand.setSelected(false);
            rand.setClickable(false);
        }
        else {
            rand.setSelected(true);
            rand.setClickable(true);
        }
    }

    protected void updateScore() {
        scoreCounter++;
        sc = (TextView) findViewById(R.id.score_keeper);
        String s = "";
        sc.setText(s.format("%d", scoreCounter));
    }
}

