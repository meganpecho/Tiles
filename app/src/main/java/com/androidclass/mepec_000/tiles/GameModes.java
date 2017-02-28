package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameModes extends AppCompatActivity {
    Button GoBackToMain, TimedEasy, TimedMedium, TimedHard;
    static String current_state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_modes);

        GoBackToMain = (Button)findViewById(R.id.back_arrow);
        TimedEasy = (Button)findViewById(R.id.timed_easy);
        TimedMedium = (Button)findViewById(R.id.timed_medium);
        TimedHard = (Button)findViewById(R.id.timed_hard);

        GoBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TimedEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(GameModes.this, Timed_Easy.class);
                startActivityForResult(Intent, 0); //Timed_Easy
                finishActivity(3); //MainMenu
                finish();
            }
        });

        TimedMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(GameModes.this, Timed_Medium.class);
                startActivityForResult(Intent, 1); //Timed_Medium
                finishActivity(3); //MainMenu
                finish();
            }
        });

        TimedHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(GameModes.this, Timed_Hard.class);
                startActivityForResult(Intent, 2); //Timed_Hard
                finishActivity(3); //MainMenu
                finish();
            }
        });
    }
}
