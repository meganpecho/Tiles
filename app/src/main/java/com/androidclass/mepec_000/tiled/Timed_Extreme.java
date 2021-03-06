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

        countDownTimer = new CountDownTimer(millisLeft, 1000) {
            TextView t = (TextView)findViewById(R.id.time_keeper);
            public void onTick(long millisUntilFinished) {
                String timeStr = "";
                t.setText(timeStr.format("%d", (millisUntilFinished / 1000)));

                for (int i = 0; i < 20; i++) {
                    selectTiles();
                }
                millisLeft = millisLeft - 1000;
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
                if (tile1.isSelected()) {
                    tile1.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile2.isSelected()) {
                    tile2.setSelected(false);
                    addPoint();
                } else subtractPoint();

            }
        });
        tile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile3.isSelected()) {
                    tile3.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile4.isSelected()) {
                    tile4.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile5.isSelected()) {
                    tile5.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile6.isSelected()) {
                    tile6.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile7.isSelected()) {
                    tile7.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile8.isSelected()) {
                    tile8.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile9.isSelected()) {
                    tile9.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile10.isSelected()) {
                    tile10.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile11.isSelected()) {
                    tile11.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile12.isSelected()) {
                    tile12.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile13.isSelected()) {
                    tile13.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile14.isSelected()) {
                    tile14.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile15.isSelected()) {
                    tile15.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile16.isSelected()) {
                    tile16.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile17.isSelected()) {
                    tile17.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile18.isSelected()) {
                    tile18.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile19.isSelected()) {
                    tile19.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile20.isSelected()) {
                    tile20.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile21.isSelected()) {
                    tile21.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile22.isSelected()) {
                    tile22.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile23.isSelected()) {
                    tile23.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile24.isSelected()) {
                    tile24.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile25.isSelected()) {
                    tile25.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile26.isSelected()) {
                    tile26.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile27.isSelected()) {
                    tile27.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile28.isSelected()) {
                    tile28.setSelected(false);
                    addPoint();
                }
            }
        });
        tile29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile29.isSelected()) {
                    tile29.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile30.isSelected()) {
                    tile30.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile31.isSelected()) {
                    tile31.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile32.isSelected()) {
                    tile32.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile33.isSelected()) {
                    tile33.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile34.isSelected()) {
                    tile34.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile35.isSelected()) {
                    tile35.setSelected(false);
                    addPoint();
                } else subtractPoint();
            }
        });
        tile36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tile36.isSelected()) {
                    tile36.setSelected(false);
                    addPoint();
                } else subtractPoint();
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
        int i1 = r.nextInt(10000)%36;
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
        sc = (TextView) findViewById(R.id.score_keeper);
        String s = "";
        sc.setText(s.format("%d", scoreCounter));
    }
}

