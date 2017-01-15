package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PopUpMenu extends AppCompatActivity {
    Button GoBackToGame, RestartGame, ChangeMode, QuitToMain;

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
                Intent intent = new Intent(PopUpMenu.this, Timed_Easy.class);
                startActivity(intent);

            }
        });

        ChangeMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PopUpMenu.this, GameModes.class);
                startActivity(intent);
            }
        });

        QuitToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PopUpMenu.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
