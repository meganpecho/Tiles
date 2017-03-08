package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PopUpMenu extends AppCompatActivity {
    Button GoBackToGame, RestartGame, ChangeMode, QuitToMain;
    static boolean shouldFinish = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        GoBackToGame = (Button)findViewById(R.id.back_arrow);
        RestartGame = (Button)findViewById(R.id.restart_button);
        ChangeMode = (Button)findViewById(R.id.change_mode_button);
        QuitToMain = (Button)findViewById(R.id.quit_button);

        GoBackToGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RestartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent;
//                if (GameModes.current_state.equals("Timed_Easy")) {
//                    intent = new Intent(PopUpMenu.this, Timed_Easy.class);
//                    finishActivity(0);
//                } else if (GameModes.current_state.equals("Timed_Medium")) {
//                    intent = new Intent(PopUpMenu.this, Timed_Medium.class);
//                    finishActivity(1);
//                } else /*if (GameModes.current_state.equals("Timed_Hard"))*/ {
//                    intent = new Intent(PopUpMenu.this, Timed_Hard.class);
//                    finishActivity(2);
//                }
                Timed_Easy.millisLeft = 32000;
                Timed_Easy.scoreCounter = 0;
                Timed_Medium.millisLeft = 32000;
                Timed_Medium.scoreCounter = 0;
                Timed_Hard.millisLeft = 31000;
                Timed_Hard.scoreCounter = 0;
                Timed_Extreme.millisLeft = 31000;
                Timed_Extreme.scoreCounter = 0;
//                startActivity(intent);
                finish();

            }
        });

        ChangeMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GameModes.current_state.equals("Timed_Easy")) finishActivity(0);
                else if (GameModes.current_state.equals("Timed_Medium")) finishActivity(1);
                else if (GameModes.current_state.equals("Timed_Hard")) finishActivity(2);
                else /*if (GameModes.current_state.equals("Timed_Extreme"))*/ finishActivity(4);

                shouldFinish = true;
                Intent intent = new Intent(PopUpMenu.this, GameModes.class);
                startActivity(intent);
                finish();
            }
        });

        QuitToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GameModes.current_state.equals("Timed_Easy")) finishActivity(0);
                else if (GameModes.current_state.equals("Timed_Medium")) finishActivity(1);
                else if (GameModes.current_state.equals("Timed_Hard")) finishActivity(2);
                else /*if (GameModes.current_state.equals("Timed_Extreme"))*/ finishActivity(4);

                shouldFinish = true;
                Intent intent = new Intent(PopUpMenu.this, MainMenu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
