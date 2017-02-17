package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.os.Bundle;
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

        RestartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                fix this to not just restart easy
                Intent intent = new Intent(EndGameMenu.this, Timed_Easy.class);
                startActivity(intent);
                finish();
            }
        });

        ChangeMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndGameMenu.this, GameModes.class);
                startActivity(intent);
                finish();
            }
        });

        QuitToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndGameMenu.this, MainMenu.class);
                startActivity(intent);
                finish();
            }
        });
    }
    protected void setScore() {
        sc = (TextView)findViewById(R.id.final_score);
        String s = "";
//        same here
        sc.setText(s.format("%d", EndGameMenu.finalScore));
    }


}
