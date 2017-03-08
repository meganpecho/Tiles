package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndGameMenu extends AppCompatActivity {
    Button RestartGame, ChangeMode, QuitToMain;
    TextView sc;
    static int finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endgame_menu);


        RestartGame = (Button)findViewById(R.id.restart_button);
        ChangeMode = (Button)findViewById(R.id.change_mode_button);
        QuitToMain = (Button)findViewById(R.id.quit_button);

        setScore();
        showButtons();

        RestartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if (GameModes.current_state.equals("Timed_Easy")) {
                    intent = new Intent(EndGameMenu.this, Timed_Easy.class);
                    finishActivity(0);
                } else if (GameModes.current_state.equals("Timed_Medium")) {
                    intent = new Intent(EndGameMenu.this, Timed_Medium.class);
                    finishActivity(1);
                } else /*if (GameModes.current_state.equals("Timed_Hard"))*/ {
                    intent = new Intent(EndGameMenu.this, Timed_Hard.class);
                    finishActivity(2);
                }
                startActivity(intent);
                finish();
            }
        });

        ChangeMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GameModes.current_state.equals("Timed_Easy")) finishActivity(0);
                else if (GameModes.current_state.equals("Timed_Medium")) finishActivity(1);
                else /*if (GameModes.current_state.equals("Timed_Hard"))*/ finishActivity(2);

                Intent intent = new Intent(EndGameMenu.this, GameModes.class);
                startActivity(intent);
                finish();
            }
        });

        QuitToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GameModes.current_state.equals("Timed_Easy")) finishActivity(0);
                else if (GameModes.current_state.equals("Timed_Medium")) finishActivity(1);
                else /*if (GameModes.current_state.equals("Timed_Hard"))*/ finishActivity(2);
                Intent intent = new Intent(EndGameMenu.this, MainMenu.class);
                startActivity(intent);
                finish();
            }
        });
    }


    protected void setScore() {
        sc = (TextView)findViewById(R.id.final_score);
        String s = "";
        sc.setText(s.format("%d", EndGameMenu.finalScore));
    }

    private Handler handler;

    private void showButtons(){
        handler = new Handler();

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                QuitToMain.setVisibility(View.VISIBLE);
                RestartGame.setVisibility(View.VISIBLE);
                ChangeMode.setVisibility(View.VISIBLE);
            }
        }, 2000);
    }

}
