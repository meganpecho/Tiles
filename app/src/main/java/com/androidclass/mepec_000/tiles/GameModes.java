package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameModes extends AppCompatActivity {
    Button GoBackToMain, TimedEasy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_modes);

        GoBackToMain = (Button)findViewById(R.id.back_arrow);
        TimedEasy = (Button)findViewById(R.id.timed_easy);

        GoBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TimedEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameModes.this, Timed_Easy.class);
                startActivity(intent);
            }
        });
    }
}
